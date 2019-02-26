package com.scott.zookeeper.registry.zookeeper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Huo on 2019/2/27.
 */
@RestController
public class TestController {

    @RequestMapping(name="HelloService",method = RequestMethod.GET,path = "/hello")
    public String hello(){
        return "Hello";
    }
}
