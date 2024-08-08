package com.cesar.curso.spingboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.cesar.curso.spingboot.webapp.springbootweb.models.dto.ParamDto;
import com.cesar.curso.spingboot.webapp.springbootweb.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo") //se puede asignar a @requestparam el nombre de "message" y cambiarlo con name = "mensaje"(ej) 
    //y así habría que mandarlo con mensaje = "Hola" por ejemplo
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola default") String message){

        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;

    }
    
    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code) {
        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);

        return params;
    }

    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request) {

        Integer code = 0;

        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (Exception e) {
            // TODO: handle exception
        }

        ParamMixDto params = new ParamMixDto();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));

        return params;
    }
    
    

}
