/*
 * This file is generated by jOOQ.
*/
package org.graviton.database.jooq.game.tables;


import javax.annotation.Generated;

import org.graviton.database.jooq.game.Game;
import org.graviton.database.jooq.game.tables.records.ItemsRecord;
import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Items extends TableImpl<ItemsRecord> {

    private static final long serialVersionUID = 596881590;

    /**
     * The reference instance of <code>game.items</code>
     */
    public static final Items ITEMS = new Items();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ItemsRecord> getRecordType() {
        return ItemsRecord.class;
    }

    /**
     * The column <code>game.items.id</code>.
     */
    public final TableField<ItemsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.items.owner</code>.
     */
    public final TableField<ItemsRecord, Integer> OWNER = createField("owner", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.items.template</code>.
     */
    public final TableField<ItemsRecord, Short> TEMPLATE = createField("template", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>game.items.quantity</code>.
     */
    public final TableField<ItemsRecord, Short> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>game.items.position</code>.
     */
    public final TableField<ItemsRecord, Byte> POSITION = createField("position", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>game.items.statistics</code>.
     */
    public final TableField<ItemsRecord, String> STATISTICS = createField("statistics", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>game.items</code> table reference
     */
    public Items() {
        this("items", null);
    }

    /**
     * Create an aliased <code>game.items</code> table reference
     */
    public Items(String alias) {
        this(alias, ITEMS);
    }

    private Items(String alias, Table<ItemsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Items(String alias, Table<ItemsRecord> aliased, Field<?>[] parameters) {
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
    public Items as(String alias) {
        return new Items(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Items rename(String name) {
        return new Items(name, null);
    }
}
