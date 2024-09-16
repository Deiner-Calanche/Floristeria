package com.floristeria.floristeriaapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Bienvenido al Grupo Actividad 6 Evidencia: S35 - Caso de estudio – Floristería – Actividad 1";
    }
}
