package com.dermalive.tienda.controllers;

import com.dermalive.tienda.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping(value = "/auth")
public class AuthController {
 
    @Autowired
    UserService service;
 
    @GetMapping(value = "/login")
    public String login(
        Model model,
        String error,
        String logout
    ) {
        if (error != null) {
            model.addAttribute("errorMessage", "Las credenciales no son válidas.");
        }
 
        if (logout != null) {
            model.addAttribute("logoutMessage", "Se cerró sesión correctamente.");
        }
 
        return "Auth/login";
    }
 
    
 
}