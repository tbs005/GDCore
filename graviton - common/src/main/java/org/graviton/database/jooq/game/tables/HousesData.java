/*
 * This file is generated by jOOQ.
*/
package org.graviton.database.jooq.game.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.graviton.database.jooq.game.Game;
import org.graviton.database.jooq.game.Keys;
import org.graviton.database.jooq.game.tables.records.HousesDataRecord;
import org.jooq.Field;
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
public class HousesData extends TableImpl<HousesDataRecord> {

    private static final long serialVersionUID = -1123650349;

    /**
     * The reference instance of <code>game.houses_data</code>
     */
    public static final HousesData HOUSES_DATA = new HousesData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HousesDataRecord> getRecordType() {
        return HousesDataRecord.class;
    }

    /**
     * The column <code>game.houses_data.id</code>.
     */
    public final TableField<HousesDataRecord, Short> ID = createField("id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>game.houses_data.owner</code>.
     */
    public final TableField<HousesDataRecord, Integer> OWNER = createField("owner", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.houses_data.sale</code>.
     */
    public final TableField<HousesDataRecord, Long> SALE = createField("sale", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>game.houses_data.guild_id</code>.
     */
    public final TableField<HousesDataRecord, Integer> GUILD_ID = createField("guild_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.houses_data.access</code>.
     */
    public final TableField<HousesDataRecord, Integer> ACCESS = createField("access", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.houses_data.key</code>.
     */
    public final TableField<HousesDataRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false), this, "");

    /**
     * The column <code>game.houses_data.guild_rights</code>.
     */
    public final TableField<HousesDataRecord, Integer> GUILD_RIGHTS = createField("guild_rights", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>game.houses_data</code> table reference
     */
    public HousesData() {
        this("houses_data", null);
    }

    /**
     * Create an aliased <code>game.houses_data</code> table reference
     */
    public HousesData(String alias) {
        this(alias, HOUSES_DATA);
    }

    private HousesData(String alias, Table<HousesDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private HousesData(String alias, Table<HousesDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Game.GAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HousesDataRecord> getPrimaryKey() {
        return Keys.KEY_HOUSES_DATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HousesDataRecord>> getKeys() {
        return Arrays.<UniqueKey<HousesDataRecord>>asList(Keys.KEY_HOUSES_DATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HousesData as(String alias) {
        return new HousesData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HousesData rename(String name) {
        return new HousesData(name, null);
    }
}
