package com.biblioteca.controllers;

import com.biblioteca.models.Livro;
import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Usuario {

    private boolean logado = false;
    private com.biblioteca.models.Usuario usuario;
    Livro[] livros = new Livro().getLivros();

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

    @GetMapping("/sair")
    public String sair() {
        this.setLogado(false);

        return "produto/index";
    }

    @RequestMapping("/do_login")
    public String do_login(@RequestParam(name="email") String email, @RequestParam(name="senha") String senha, Model model) {
        this.usuario = new com.biblioteca.models.Usuario(9);

        if (this.usuario.validarLogin(email ,senha)) {
            this.setLogado(true);

            model.addAttribute("usuario", this.usuario);
            model.addAttribute("livros", this.livros);
            model.addAttribute("logado", this.estaLogado());

            return "produto/index";
        }

        return "usuarios/login";
    }

    @GetMapping("/cadastro-usuario")
    public String cadastroUsuario() {
        return "usuario/cadastroUsuario";
    }

    @GetMapping("/biblioteca")
    public String biblioteca(Model model) {

        if (this.estaLogado()) {
            model.addAttribute("usuario", this.usuario);
            model.addAttribute("logado", true);
            model.addAttribute("nome", this.usuario.getPessoa().getNome());
            model.addAttribute("livros", this.livros);

            return "usuario/biblioteca";
        }

        Livro[] banner = new Livro[4];

        for (int count = 0; count < 4; count++) {
            banner[count] = this.livros[count];
        }

        model.addAttribute("livros", banner);

        return "produto/index";
    }

    public boolean estaLogado() {
        return this.logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
}
