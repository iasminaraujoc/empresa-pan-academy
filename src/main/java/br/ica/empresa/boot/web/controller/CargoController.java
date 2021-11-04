package br.ica.empresa.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/cargos")
public class CargoController {

    @RequestMapping(method = RequestMethod.GET, value = "/cadastrar")
    public String cadastrar(){
        return "/cargo/cadastro.html";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/listar")
    public String listar(){
        return "/cargo/lista.html";
    }
}
