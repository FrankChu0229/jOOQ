/*
 * This file is generated by jOOQ.
*/
package org.jooq.util.postgres.pg_catalog.tables;


import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.pg_catalog.PgCatalog;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgCursor extends TableImpl<Record> {

    private static final long serialVersionUID = -1066387473;

    /**
     * The reference instance of <code>pg_catalog.pg_cursor</code>
     */
    public static final PgCursor PG_CURSOR = new PgCursor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_cursor.name</code>.
     */
    public final TableField<Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_cursor.statement</code>.
     */
    public final TableField<Record, String> STATEMENT = createField("statement", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_cursor.is_holdable</code>.
     */
    public final TableField<Record, Boolean> IS_HOLDABLE = createField("is_holdable", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_cursor.is_binary</code>.
     */
    public final TableField<Record, Boolean> IS_BINARY = createField("is_binary", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_cursor.is_scrollable</code>.
     */
    public final TableField<Record, Boolean> IS_SCROLLABLE = createField("is_scrollable", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_cursor.creation_time</code>.
     */
    public final TableField<Record, OffsetDateTime> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * Create a <code>pg_catalog.pg_cursor</code> table reference
     */
    public PgCursor() {
        this(DSL.name("pg_cursor"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_cursor</code> table reference
     */
    public PgCursor(String alias) {
        this(DSL.name(alias), PG_CURSOR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_cursor</code> table reference
     */
    public PgCursor(Name alias) {
        this(alias, PG_CURSOR);
    }

    private PgCursor(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgCursor(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCursor as(String alias) {
        return new PgCursor(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCursor as(Name alias) {
        return new PgCursor(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCursor rename(String name) {
        return new PgCursor(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgCursor rename(Name name) {
        return new PgCursor(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgCursor call() {
        return new PgCursor(DSL.name(getName()), null, new Field[] {
        });
    }
}