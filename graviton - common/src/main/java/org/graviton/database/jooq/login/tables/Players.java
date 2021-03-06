/*
 * This file is generated by jOOQ.
*/
package org.graviton.database.jooq.login.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.graviton.database.jooq.login.Keys;
import org.graviton.database.jooq.login.Login;
import org.graviton.database.jooq.login.tables.records.PlayersRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Players extends TableImpl<PlayersRecord> {

    private static final long serialVersionUID = 1256953641;

    /**
     * The reference instance of <code>login.players</code>
     */
    public static final Players PLAYERS = new Players();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlayersRecord> getRecordType() {
        return PlayersRecord.class;
    }

    /**
     * The column <code>login.players.id</code>.
     */
    public final TableField<PlayersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>login.players.owner</code>.
     */
    public final TableField<PlayersRecord, Integer> OWNER = createField("owner", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>login.players.name</code>.
     */
    public final TableField<PlayersRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>login.players.breed</code>.
     */
    public final TableField<PlayersRecord, Byte> BREED = createField("breed", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>login.players.sex</code>.
     */
    public final TableField<PlayersRecord, Byte> SEX = createField("sex", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>login.players.skin</code>.
     */
    public final TableField<PlayersRecord, Short> SKIN = createField("skin", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>login.players.size</code>.
     */
    public final TableField<PlayersRecord, Short> SIZE = createField("size", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("100", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>login.players.colors</code>.
     */
    public final TableField<PlayersRecord, String> COLORS = createField("colors", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>login.players.level</code>.
     */
    public final TableField<PlayersRecord, Short> LEVEL = createField("level", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>login.players.experience</code>.
     */
    public final TableField<PlayersRecord, Long> EXPERIENCE = createField("experience", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>login.players.title</code>.
     */
    public final TableField<PlayersRecord, Byte> TITLE = createField("title", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>login.players.kamas</code>.
     */
    public final TableField<PlayersRecord, Long> KAMAS = createField("kamas", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>login.players.map</code>.
     */
    public final TableField<PlayersRecord, Integer> MAP = createField("map", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>login.players.cell</code>.
     */
    public final TableField<PlayersRecord, Short> CELL = createField("cell", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>login.players.orientation</code>.
     */
    public final TableField<PlayersRecord, Byte> ORIENTATION = createField("orientation", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>login.players.waypoints</code>.
     */
    public final TableField<PlayersRecord, String> WAYPOINTS = createField("waypoints", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>login.players.stat_points</code>.
     */
    public final TableField<PlayersRecord, Short> STAT_POINTS = createField("stat_points", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>login.players.spell_points</code>.
     */
    public final TableField<PlayersRecord, Short> SPELL_POINTS = createField("spell_points", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>login.players.energy</code>.
     */
    public final TableField<PlayersRecord, Short> ENERGY = createField("energy", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("10000", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>login.players.life</code>.
     */
    public final TableField<PlayersRecord, Byte> LIFE = createField("life", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("100", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>login.players.vitality</code>.
     */
    public final TableField<PlayersRecord, Integer> VITALITY = createField("vitality", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>login.players.wisdom</code>.
     */
    public final TableField<PlayersRecord, Integer> WISDOM = createField("wisdom", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>login.players.strength</code>.
     */
    public final TableField<PlayersRecord, Integer> STRENGTH = createField("strength", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>login.players.intelligence</code>.
     */
    public final TableField<PlayersRecord, Integer> INTELLIGENCE = createField("intelligence", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>login.players.chance</code>.
     */
    public final TableField<PlayersRecord, Integer> CHANCE = createField("chance", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>login.players.agility</code>.
     */
    public final TableField<PlayersRecord, Integer> AGILITY = createField("agility", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>login.players.server</code>.
     */
    public final TableField<PlayersRecord, Byte> SERVER = createField("server", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>login.players.alignment</code>.
     */
    public final TableField<PlayersRecord, Byte> ALIGNMENT = createField("alignment", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>login.players.honor</code>.
     */
    public final TableField<PlayersRecord, Integer> HONOR = createField("honor", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>login.players.dishonnor</code>.
     */
    public final TableField<PlayersRecord, Integer> DISHONNOR = createField("dishonnor", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>login.players.pvp_enabled</code>.
     */
    public final TableField<PlayersRecord, Byte> PVP_ENABLED = createField("pvp_enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>login.players.guild</code>.
     */
    public final TableField<PlayersRecord, Integer> GUILD = createField("guild", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>login.players.savedLocation</code>.
     */
    public final TableField<PlayersRecord, String> SAVEDLOCATION = createField("savedLocation", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>login.players.store</code>.
     */
    public final TableField<PlayersRecord, String> STORE = createField("store", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>login.players.job</code>.
     */
    public final TableField<PlayersRecord, String> JOB = createField("job", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>login.players</code> table reference
     */
    public Players() {
        this("players", null);
    }

    /**
     * Create an aliased <code>login.players</code> table reference
     */
    public Players(String alias) {
        this(alias, PLAYERS);
    }

    private Players(String alias, Table<PlayersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Players(String alias, Table<PlayersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Login.LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PlayersRecord> getPrimaryKey() {
        return Keys.KEY_PLAYERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PlayersRecord>> getKeys() {
        return Arrays.<UniqueKey<PlayersRecord>>asList(Keys.KEY_PLAYERS_PRIMARY, Keys.KEY_PLAYERS_PLAYERS_NAME_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PlayersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PlayersRecord, ?>>asList(Keys.PLAYERS_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Players as(String alias) {
        return new Players(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Players rename(String name) {
        return new Players(name, null);
    }
}
