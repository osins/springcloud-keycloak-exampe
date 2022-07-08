package com.fbecloud.provider.service;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class DefaultUserService implements UesrService{
    @Autowired
    DSLContext dsl;

    @Override
    @Transactional
    public void findById(UUID id) {

    }
}
