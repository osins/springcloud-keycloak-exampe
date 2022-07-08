/*
 * This file is generated by jOOQ.
 */
package com.fbecloud.provider.db.identity;


import com.fbecloud.provider.db.identity.tables.UserEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keycloak extends SchemaImpl {

    private static final long serialVersionUID = 2115157640;

    /**
     * The reference instance of <code>keycloak</code>
     */
    public static final Keycloak KEYCLOAK = new Keycloak();

    /**
     * The table <code>keycloak.USER_ENTITY</code>.
     */
    public final UserEntity USER_ENTITY = com.fbecloud.provider.db.identity.tables.UserEntity.USER_ENTITY;

    /**
     * No further instances allowed
     */
    private Keycloak() {
        super("keycloak", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            UserEntity.USER_ENTITY);
    }
}