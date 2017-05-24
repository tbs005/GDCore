/*
 * This file is generated by jOOQ.
*/
package org.graviton.database.jooq.login;


import javax.annotation.Generated;

import org.graviton.database.jooq.login.tables.Accounts;
import org.graviton.database.jooq.login.tables.Players;
import org.graviton.database.jooq.login.tables.records.AccountsRecord;
import org.graviton.database.jooq.login.tables.records.PlayersRecord;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>login</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AccountsRecord, Integer> IDENTITY_ACCOUNTS = Identities0.IDENTITY_ACCOUNTS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountsRecord> KEY_ACCOUNTS_PRIMARY = UniqueKeys0.KEY_ACCOUNTS_PRIMARY;
    public static final UniqueKey<PlayersRecord> KEY_PLAYERS_PRIMARY = UniqueKeys0.KEY_PLAYERS_PRIMARY;
    public static final UniqueKey<PlayersRecord> KEY_PLAYERS_PLAYERS_NAME_INDEX = UniqueKeys0.KEY_PLAYERS_PLAYERS_NAME_INDEX;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<PlayersRecord, AccountsRecord> PLAYERS_IBFK_1 = ForeignKeys0.PLAYERS_IBFK_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AccountsRecord, Integer> IDENTITY_ACCOUNTS = createIdentity(Accounts.ACCOUNTS, Accounts.ACCOUNTS.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AccountsRecord> KEY_ACCOUNTS_PRIMARY = createUniqueKey(Accounts.ACCOUNTS, "KEY_accounts_PRIMARY", Accounts.ACCOUNTS.ID, Accounts.ACCOUNTS.NAME, Accounts.ACCOUNTS.NICKNAME);
        public static final UniqueKey<PlayersRecord> KEY_PLAYERS_PRIMARY = createUniqueKey(Players.PLAYERS, "KEY_players_PRIMARY", Players.PLAYERS.ID);
        public static final UniqueKey<PlayersRecord> KEY_PLAYERS_PLAYERS_NAME_INDEX = createUniqueKey(Players.PLAYERS, "KEY_players_players_name_index", Players.PLAYERS.NAME);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<PlayersRecord, AccountsRecord> PLAYERS_IBFK_1 = createForeignKey(org.graviton.database.jooq.login.Keys.KEY_ACCOUNTS_PRIMARY, Players.PLAYERS, "players_ibfk_1", Players.PLAYERS.OWNER);
    }
}
