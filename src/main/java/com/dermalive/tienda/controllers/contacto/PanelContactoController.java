package com.dermalive.tienda.controllers.contacto;

import com.dermalive.tienda.models.Apartado;
import com.dermalive.tienda.panel.contacto.TiendaContactoPanel;
import com.dermalive.tienda.services.ApartadoService;
import com.dermalive.tienda.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping (value = "/contact/nuevo")
@Controller
public class PanelContactoController {

    @Autowired
    ApartadoService apartadoService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/index" , method = RequestMethod.GET)
    public String index() {
        return "/Contacto/create";
    }

    @RequestMapping(value = {"" , "/"}, method = RequestMethod.POST)
    public String tienda (
        TiendaContactoPanel contactoPanel
    ){
        System.out.println(contactoPanel);

        Apartado apartado = new Apartado();
        apartado.setTitle(contactoPanel.getTitle());
        apartado.setTelefono(contactoPanel.getTelefono());
        apartado.setEmail(contactoPanel.getEmail());

        apartadoService.save(apartado);

        return "/Contacto/create";
    }

}