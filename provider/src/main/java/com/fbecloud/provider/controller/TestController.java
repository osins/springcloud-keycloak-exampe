package com.fbecloud.provider.controller;

import com.alibaba.fastjson.JSON;
import com.fbecloud.provider.db.identity.tables.UserEntity;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.security.Principal;

@RestController
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    DSLContext dsl;

    @ResponseBody
    @RolesAllowed({"product_read"})
    @GetMapping(value = "/online/hello")
    public ResponseEntity<String> helloWorld(Principal principal) {
        logger.info(String.join("test cloud provider, hello api, principal name：%s", principal.getName()));

        com.fbecloud.provider.db.identity.tables.pojos.UserEntity record = dsl.selectFrom(UserEntity.USER_ENTITY)
                .where(UserEntity.USER_ENTITY.ID.eq(principal.getName()))
                .fetchOneInto(com.fbecloud.provider.db.identity.tables.pojos.UserEntity.class);

        return ResponseEntity.ok(JSON.toJSONString(record));
    }

//    @GetMapping(value = "/clear")
//    public void clearCache() {
//        userService.clearUserCache();
//    }
//
//    @GetMapping(value = "/sayHi")
//    public String sayHi(){
//        return "Hello,this is the provider 1";
//    }
}
