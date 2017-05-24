/*
 * This file is generated by jOOQ.
*/
package org.graviton.database.jooq.game.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.graviton.database.jooq.game.Game;
import org.graviton.database.jooq.game.Keys;
import org.graviton.database.jooq.game.tables.records.SubareaDataRecord;
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
public class SubareaData extends TableImpl<SubareaDataRecord> {

    private static final long serialVersionUID = -985296982;

    /**
     * The reference instance of <code>game.subarea_data</code>
     */
    public static final SubareaData SUBAREA_DATA = new SubareaData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SubareaDataRecord> getRecordType() {
        return SubareaDataRecord.class;
    }

    /**
     * The column <code>game.subarea_data.id</code>.
     */
    public final TableField<SubareaDataRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.subarea_data.alignement</code>.
     */
    public final TableField<SubareaDataRecord, Integer> ALIGNEMENT = createField("alignement", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>game.subarea_data.conquistable</code>.
     */
    public final TableField<SubareaDataRecord, Integer> CONQUISTABLE = createField("conquistable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>game.subarea_data.prisme</code>.
     */
    public final TableField<SubareaDataRecord, Integer> PRISME = createField("prisme", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>game.subarea_data</code> table reference
     */
    public SubareaData() {
        this("subarea_data", null);
    }

    /**
     * Create an aliased <code>game.subarea_data</code> table reference
     */
    public SubareaData(String alias) {
        this(alias, SUBAREA_DATA);
    }

    private SubareaData(String alias, Table<SubareaDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private SubareaData(String alias, Table<SubareaDataRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SubareaDataRecord> getPrimaryKey() {
        return Keys.KEY_SUBAREA_DATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SubareaDataRecord>> getKeys() {
        return Arrays.<UniqueKey<SubareaDataRecord>>asList(Keys.KEY_SUBAREA_DATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubareaData as(String alias) {
        return new SubareaData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SubareaData rename(String name) {
        return new SubareaData(name, null);
    }
}
