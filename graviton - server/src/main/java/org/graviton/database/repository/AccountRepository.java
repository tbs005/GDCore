package org.graviton.database.repository;

import com.google.inject.Inject;
import lombok.Getter;
import org.graviton.database.Database;
import org.graviton.database.api.LoginDatabase;
import org.graviton.database.models.Account;
import org.graviton.database.models.Player;
import org.graviton.network.exchange.protocol.ExchangeProtocol;
import org.graviton.network.login.LoginClient;
import org.graviton.network.login.protocol.LoginProtocol;
import org.jooq.Record;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import static org.graviton.database.jooq.login.tables.Accounts.ACCOUNTS;
import static org.graviton.database.jooq.login.tables.Players.PLAYERS;


/**
 * Created by Botan on 30/10/2016 : 00:24
 */

public class AccountRepository {
    @Getter private final Map<Integer, Byte> connectedClients;

    private final Map<Integer, Account> accounts;

    private Database database;

    @Inject public AccountRepository(@LoginDatabase  Database database) {
        this.accounts = new ConcurrentHashMap<>();
        this.connectedClients = new HashMap<>();
        this.database = database;
    }

    public Account load(String name, LoginClient client) {
        Record record = database.getRecord(ACCOUNTS, ACCOUNTS.NAME.equal(name));

        if (record == null)
            return null;

        int account = record.get(ACCOUNTS.ID);

        if (accounts.containsKey(account)) {
            accounts.get(account).getClient().send(LoginProtocol.alreadyConnected());

            if (connectedClients.containsKey(account))
                client.getGameServerRepository().getGameServers().get(connectedClients.get(account)).getExchangeClient().send(ExchangeProtocol.disconnectAccount(account));
        }

        return new Account(record);
    }

    public void register(Account account) {
        this.accounts.put(account.getId(), account);
    }

    public void updateNickname(Account account) {
        database.update(ACCOUNTS).set(ACCOUNTS.NICKNAME, account.getNickname()).where(ACCOUNTS.ID.equal(account.getId())).execute();
    }

    public boolean isAvailableNickname(String nickname) {
        return database.getRecord(ACCOUNTS, ACCOUNTS.NICKNAME.equal(nickname)) == null;
    }

    public Collection<Player> load(int accountId) {
        return database.getResult(PLAYERS, PLAYERS.OWNER.equal(accountId)).stream().map(record -> new Player(record.getValue(PLAYERS.ID), record.getValue(PLAYERS.SERVER))).collect(Collectors.toList());
    }

    public Collection<Player> getPlayers(String nickname) {
        Record result = database.getRecord(ACCOUNTS, ACCOUNTS.NICKNAME.equal(nickname));
        return result != null ? database.getResult(PLAYERS, PLAYERS.OWNER.equal(result.getValue(ACCOUNTS.ID))).stream().map(record -> new Player(record.getValue(PLAYERS.ID), record.getValue(PLAYERS.SERVER))).collect(Collectors.toList()) : new ArrayList<>();
    }

}
