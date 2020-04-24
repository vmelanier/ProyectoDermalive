package com.dermalive.tienda.controllers;

import com.dermalive.tienda.models.User;
import com.dermalive.tienda.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {

    @Autowired
    private UserService service;

    @RequestMapping("/")
    public String index(){
        //return "index";

        User user = new User();
        user.setUsername("vmel");
        user.setPassword("1234");

        service.save(user);

        return "index";
    }

}