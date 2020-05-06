package com.biblioteca.controllers;

import com.biblioteca.models.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Produto {

    Usuario usuario = new Usuario();
    Livro[] livros = new Livro().getLivros();

    @GetMapping("/home")
    public String home(Model model) {
        Livro[] banner = new Livro[4];

        for (int count = 0; count < 4; count++) {
            banner[count] = this.livros[count];
        }

        model.addAttribute("logado", usuario.estaLogado());
        model.addAttribute("livros", banner);

        return "produto/index";
    }

    @GetMapping("/produtos")
    public String produtos(Model model) {
        model.addAttribute("logado", usuario.estaLogado());
        model.addAttribute("livros", this.livros);

        return "produto/produtos";
    }

    @GetMapping("/detalhe")
    public String detalhe(@RequestParam(name="idLivro", required=false, defaultValue="404") int idLivro, Model model) {
        Livro[] banner = new Livro[4];

        for (int count = 0; count < 4; count++) {
            banner[count] = this.livros[count];
        }

        model.addAttribute("logado", usuario.estaLogado());
        model.addAttribute("livros", banner);
        model.addAttribute("livro", this.livros[idLivro]);

        return "produto/detalhe";
    }

    @GetMapping("/{SLUG}")
    public String detalheProduto() {
        return "produto/detalheProduto";
    }
}
