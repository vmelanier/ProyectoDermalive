package com.dermalive.tienda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/Conocenos", method = RequestMethod.GET)
public class ConocenosController {

    @RequestMapping(value = "")
    public String index() {
        return "Conocenos/index";
    }
}