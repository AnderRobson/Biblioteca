package com.biblioteca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Produto {

    @GetMapping("/home")
    public String home() {
        return "produto/index";
    }

    @GetMapping("/produtos")
    public String produtos() {
        return "produto/produtos";
    }

    @GetMapping("/{SLUG}")
    public String detalheProduto() {
        return "produto/detalheProduto";
    }
}
