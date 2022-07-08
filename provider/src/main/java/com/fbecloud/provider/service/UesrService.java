package com.fbecloud.provider.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

public interface UesrService {
    @Transactional
    void findById(UUID id);
}
