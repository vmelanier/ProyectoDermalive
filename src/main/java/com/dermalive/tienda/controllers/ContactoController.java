package com.dermalive.tienda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/Contacto")
public class ContactoController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
    return "Contacto/index";
    }

    @RequestMapping(value = "/{Contacto_id}", method = RequestMethod.GET)
	public String show(
        @PathVariable String Contacto_id,
        Model model
	) {
        System.out.println("Contacto ID = " + Contacto_id);

        model.addAttribute("var1", "Hello World");
		return "Contacto/show";
	}

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(){
    return "Contacto";
     }

}