package com.fbecloud.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    @SuppressWarnings("all")
    private DiscoveryClient discoveryClient;

    @RequestMapping("/queryService")
    @ResponseBody
    public String query() {
        List<ServiceInstance> instances =discoveryClient.getInstances("service-provider1");
        StringBuilder urls= new StringBuilder();
        for(ServiceInstance instance : instances){
            urls.append(instance.getHost()+":"+instance.getPort()).append(",");
        }
        return urls.toString();
    }
}
