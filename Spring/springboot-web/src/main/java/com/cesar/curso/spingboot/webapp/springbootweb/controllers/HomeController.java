package com.cesar.curso.spingboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String home(){

        return "redirect:/list";
        /* También está el comando forward con request.getRequestDispatcher("/details").forward(request.response)
         * La diferencia es que con el Forward se mantiene dentro de la misma petición http,
         * y no pierdes los parámetros que tienes dentro del request, tampoco cambia la ruta url,
         * ya que no hace un refresh-page, sino que despacha a otra cción del controlador sin recargar 
         * la página, mientras que el redirect cambia la ruta url, reinicia el request y refresca el navegador,
         * además que todos los parámetros del request que teníamos antes del redirect se píerden en este nuevo
         * request.
         */
    }
}
