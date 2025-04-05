package edu.tienda2.core2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoRestController {

    @GetMapping("/hola/{nombreUsuario}")
    public String saludo(@PathVariable String nombreUsuario){
        System.out.printf("Ejecutando saludo");
       // return "HOLA MUNDO Spring Boot";
        return "Hola " + nombreUsuario;
    }
}
