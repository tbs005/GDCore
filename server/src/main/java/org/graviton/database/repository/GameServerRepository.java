package org.graviton.database.repository;

import com.google.inject.Inject;
import lombok.Getter;
import org.graviton.database.LoginDatabase;
import org.graviton.database.models.GameServer;
import org.graviton.network.exchange.ExchangeClient;
import org.graviton.network.exchange.protocol.ExchangeProtocol;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.graviton.database.jooq.tables.Servers.SERVERS;

/**
 * Created by Botan on 30/10/2016 : 13:37
 */
public class GameServerRepository {
    @Getter
    private final Map<String, GameServer> gameServers;
    @Inject
    private LoginDatabase database;

    public GameServerRepository() {
        this.gameServers = new ConcurrentHashMap<>();
    }

    private void register(GameServer gameServer) {
        this.gameServers.put(gameServer.getKey(), gameServer);
    }

    public void loadGameServers() {
        database.getResult(SERVERS).forEach(record -> register(new GameServer((byte) (gameServers.size() + 1), record.getValue(SERVERS.KEY))));
    }

    /**
     * Receive data form : SI#key;#adress;#port
     *
     * @param data
     * @param client
     */
    public void setGameServerInformations(String data, ExchangeClient client) {
        String[] informations = data.split(";");
        GameServer gameServer = gameServers.get(informations[0]);

        if (gameServer != null) {
            gameServer.setAddress(informations[1]);
            gameServer.setPort(Integer.parseInt(informations[2]));
            client.setGameServer(gameServer);
        } else
            client.send(ExchangeProtocol.refuseGameServer());
    }

}
