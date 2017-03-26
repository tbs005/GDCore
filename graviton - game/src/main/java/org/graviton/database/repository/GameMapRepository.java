package org.graviton.database.repository;

import com.google.inject.Inject;
import org.graviton.database.Repository;
import org.graviton.database.entity.EntityFactory;
import org.graviton.database.jooq.game.tables.HousesData;
import org.graviton.game.creature.monster.Monster;
import org.graviton.game.creature.monster.MonsterGroup;
import org.graviton.game.creature.npc.Npc;
import org.graviton.game.house.House;
import org.graviton.game.maps.GameMap;
import org.graviton.game.zaap.Zaap;
import org.graviton.xml.XMLElement;
import org.jooq.Record;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Created by Botan on 13/11/2016 : 17:29
 */
public class GameMapRepository extends Repository<Integer, GameMap> {

    @Inject
    private EntityFactory entityFactory;

    public GameMap getByPosition(String position, boolean incarnam) {
        if (incarnam) {
            Optional<GameMap> record = entityFactory.getSubArea().values().stream().filter(subArea -> subArea.getArea().getId() == 45).flatMap(subArea -> subArea.getGameMaps().stream()).collect(Collectors.toList()).stream().filter(gameMap -> gameMap.getPosition().equals(position)).findFirst();
            return record.isPresent() ? record.get().initialize() : null;
        }

        Optional<GameMap> record = super.stream().filter(gameMap -> gameMap.getPosition().equals(position)).findFirst();
        return record.isPresent() ? record.get().initialize() : null;
    }

    public int loadNpc(Document file) {
        return entityFactory.apply(file.getElementsByTagName("Npc"), element -> {
            GameMap gameMap = this.get(element.getAttribute("map").toInt());
            gameMap.addFuture(new Npc(entityFactory.getNpcTemplate(element.getAttribute("id").toInt()), gameMap, element));
        });
    }

    public int loadHouses() {
        return (int) this.entityFactory.getHouses().values().stream().filter(houseTemplate -> {
            GameMap gameMap = get(houseTemplate.getGameMap());
            GameMap houseMap = get(houseTemplate.getHouseMap());

            if (gameMap == null || houseMap == null)
                return false;

            Record record = entityFactory.getDatabase().getRecord(HousesData.HOUSES_DATA, HousesData.HOUSES_DATA.ID.equal(houseTemplate.getId()));

            House house = new House(houseTemplate, record);

            gameMap.addHouse(house);
            houseMap.addHouse(house);
            return true;
        }).count();
    }

    public int loadZaaps(Document file) {
        return entityFactory.apply(file.getElementsByTagName("zaap"), element -> {
            GameMap gameMap = this.get(element.getAttribute("map").toInt());
            if (gameMap != null)
                gameMap.setZaap(new Zaap(element));
        });
    }

    public int loadMonsterGroups(Document file) {
        return entityFactory.apply(file.getElementsByTagName("MonsterGroup"), element -> {
            GameMap gameMap = this.get(element.getAttribute("map").toInt());
            if (gameMap != null) {
                List<Monster> monsters = new ArrayList<>();

                for (String extraData : element.getElementByTagName("data").toString().split(";")) {
                    Monster monster = entityFactory.getMonsterTemplate(Integer.parseInt(extraData.split(",")[0])).getRandom(Short.parseShort(extraData.split(",")[1]), Short.parseShort(extraData.split(",")[2]));
                    if (monster != null)
                        monsters.add(monster);
                }

                gameMap.addFuture(new MonsterGroup(gameMap.getNextId(), gameMap, element.getAttribute("cell").toShort(), monsters, element.getElementByTagName("regenTime").toLong()));
            }
        });
    }

    public int load(Document file) {
        NodeList list = file.getElementsByTagName("GameMap");

        IntStream.range(0, list.getLength()).forEach(i -> {
            XMLElement element = new XMLElement((Element) list.item(i));
            int id = element.getAttribute("id").toInt();
            short subArea = Short.parseShort(element.getElementByTagName("position").toString().split(",")[2]);
            GameMap gameMap = new GameMap(id, element, entityFactory);
            entityFactory.getSubArea(subArea).registerGameMap(gameMap);
            super.add(id, gameMap);
        });

        return objects.size();
    }

    public Collection<GameMap> getInitialized() {
        return super.stream().filter(GameMap::isInitialized).map(gameMap -> gameMap).collect(Collectors.toList());
    }

    @Override
    public GameMap find(Object value) {
        return this.get((int) value).initialize();
    }
}
