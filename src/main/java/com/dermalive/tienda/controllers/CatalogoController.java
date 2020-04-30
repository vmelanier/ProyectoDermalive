package com.dermalive.tienda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/Catalogo", method = RequestMethod.GET)
public class CatalogoController {

    @RequestMapping(value = "")
    public String index() {
        return "Catalogo/index";
    }
}