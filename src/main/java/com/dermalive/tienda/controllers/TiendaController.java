package com.dermalive.tienda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/Tienda", method = RequestMethod.GET)
public class TiendaController {

    @RequestMapping(value = "")
    public String index() {
        return "Tienda/index";
    }
}