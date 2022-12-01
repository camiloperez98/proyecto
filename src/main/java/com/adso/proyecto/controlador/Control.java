package com.adso.proyecto.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Control {

    @GetMapping("/inicio")
    public String inicio(){
        return "index";
    }

    @GetMapping("/licores")
    public String licores(){
        return "licores";
    }

}
