package com.biblioteca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Usuario {

    private boolean logado = false;

    @GetMapping("usuario")
    public String usuario() {
        if (! this.logado) {
            /**
             * Fazer redirect para página de login
             */
        }

        return "usuario/index";
    }

    @GetMapping("/login")
    public String login() {
        return "usuario/login";
    }

    @GetMapping("/cadastro-usuario")
    public String cadastroUsuario() {
        return "usuario/cadastroUsuario";
    }
}
