package com.dermalive.tienda.controllers;

import java.util.List;

import com.dermalive.tienda.models.Catalogo;
import com.dermalive.tienda.services.CatalogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/Catalogo", method = RequestMethod.GET)
public class CatalogoController {

    @Autowired
    CatalogoService catalogoService;

    @RequestMapping(value = "")
    public String index(ModelMap model) {
        List<Catalogo> catalogo = catalogoService.all();
        model.addAttribute("catalogo", catalogo);
        return "/Catalogo/index";
    }
}