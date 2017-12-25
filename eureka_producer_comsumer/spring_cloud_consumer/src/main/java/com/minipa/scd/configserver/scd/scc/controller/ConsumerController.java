package com.minipa.scd.configserver.scd.scc.controller;

import com.minipa.scd.configserver.scd.scc.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote remote;
	
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return remote.hello(name);
    }

}