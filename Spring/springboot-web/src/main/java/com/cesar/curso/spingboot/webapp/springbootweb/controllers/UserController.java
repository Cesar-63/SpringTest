package com.cesar.curso.spingboot.webapp.springbootweb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cesar.curso.spingboot.webapp.springbootweb.models.User;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class UserController {

    //para thymeleaf reacordar que se usa '$' para llamar variables 
    //y '@' para llamar rutas
    @GetMapping("/details")
    public String details(Model model) 
    {

        User user = new User("Andres", "Guzman");
        user.setEmail("andres@correo.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        
        //List<User> users = Arrays. asList(
          //      new User("Pepa", "Gonzales"),
            //    new User("Lalo", "Perez", "lalo@correo.com"),
              //  new User("Juanita", "Roe"),
                //new User("Andres", "Doe"));

        //model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios!");
        return "list";
    }
    
    @ModelAttribute("users")
    public List<User> usersModel(){
        List<User> users = Arrays. asList(
                new User("Pepa", "Gonzales"),
                new User("Lalo", "Perez", "lalo@correo.com"),
                new User("Juanita", "Roe"),
                new User("Andres", "Doe"));
        return users;
    }
}
