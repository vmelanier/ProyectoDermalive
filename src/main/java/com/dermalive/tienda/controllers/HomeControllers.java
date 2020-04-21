package com.dermalive.tienda.controllers;

import com.dermalive.tienda.db.HibernateSession;
import com.dermalive.tienda.models.User;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {

    @RequestMapping("/")
    public String index (){

        User user = new User ();
        user.setFirstName("Migu");
        user.setLastName("Ang");
        user.setUsername("miguel.ang");
        user.setPassword("123456789");

        Session session = HibernateSession.open();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();

        return "index";
    }

}