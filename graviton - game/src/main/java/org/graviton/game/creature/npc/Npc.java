package org.graviton.game.creature.npc;

import lombok.Data;
import org.graviton.game.client.player.Player;
import org.graviton.game.creature.Creature;
import org.graviton.database.entity.EntityFactory;
import org.graviton.game.look.AbstractLook;
import org.graviton.game.maps.GameMap;
import org.graviton.game.position.Location;
import org.graviton.game.statistics.common.Statistics;
import org.graviton.network.game.protocol.NpcPacketFormatter;
import org.graviton.xml.XMLElement;


/**
 * Created by Botan on 27/11/16. 23:02
 */
@Data
public class Npc implements Creature {
    private final int id;
    private final NpcTemplate template;
    private Location location;
    private GameMap gameMap;
    private short cell;
    private byte orientation;

    public Npc(NpcTemplate template, GameMap gameMap, XMLElement element) {
        this.gameMap = gameMap;
        this.cell = element.getAttribute("cell").toShort();
        this.orientation = element.getAttribute("orientation").toByte();
        this.template = template;
        this.id = gameMap.getNextId();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getGm(Player player) {
        return NpcPacketFormatter.gmMessage(this, player);
    }

    @Override
    public void send(String data) {

    }

    @Override
    public Location getLocation() {
        return this.location == null ? (this.location = new Location(gameMap, cell, orientation)) : this.location;
    }

    @Override
    public void setLocation(Location location) {

    }

    @Override
    public int getColor(byte color) {
        return template.getColors()[color];
    }

    @Override
    public Statistics getStatistics() {
        return null;
    }

    @Override
    public EntityFactory entityFactory() {
        return gameMap.getEntityFactory();
    }

    @Override
    public AbstractLook look() {
        return template.getLook();
    }

    public int getTemplateId() {
        return this.template.getId();
    }
}
