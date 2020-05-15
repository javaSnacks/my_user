package com.slw.my_user.controllor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope
public class HomeControllor {
    @Value("${env.name:config server not found}")
    private String bar;

    @RequestMapping("/app")
    String hello(){
        return "hello"+bar;
    }
}
