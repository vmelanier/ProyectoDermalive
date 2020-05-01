package com.dermalive.tienda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {


    @RequestMapping("/")
    public String index(){
        //return "index";

       // User user = new User();
       // user.setUsername("vmel");
       // user.setPassword("1234");

       // service.save(user);

        return "index";
    }

}