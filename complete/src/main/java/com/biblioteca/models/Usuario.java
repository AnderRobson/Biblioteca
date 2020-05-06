package com.biblioteca.models;

public class Usuario {

    /** Mensagem caso usuario não seja identificado.*/
    private final String NONEXISTENT_USER = "Usuário inexistente !";

    /** Mensagem caso a senha não corresponda ao usuário informado.*/
    private final String INVALID_PASSWORD = "Senha inválida !";

    /** Mensagem caso o login seja feito com sucesso.*/
    private final String SUCCESS = "Logado com sucesso !";

    /** Identificar do registro na tabela usuarios.*/
    private int id = 9;

    /** Pessoa responsavel pelo usuário.*/
    private Pessoa pessoa;

    /** Login da pessoa.*/
    private String login = "teste@teste.com.br";

    /** Senha da pessoa.*/
    private String senha = "123456789";

    /** Email da pessoa.*/
    private String email = "teste@teste.com.br";

    /**
     *  Método construtor buscando usuário pelo id.
     *
     * @param id
     */
    public Usuario(int id) {
        this.setId(id);
        this.setPessoa(new Pessoa().getPessoa(this.getId()));
    }

    /**
     *  Método construtor cadastrando um novo usuário.
     *
     * @param pessoa
     * @param login
     * @param senha
     * @param email
     */
    public Usuario(Pessoa pessoa, String login, String senha, String email) {
        this.pessoa = pessoa;
        this.login = login;
        this.email = email;
        this.senha = senha;
    }

    /**
     *  Pegar valor da variável id.
     *
     * @return
     */
    public int getId() {
        return this.id;
    }

    /**
     *  Setar um novo id da tabela usuarios.
     *
     * @param id
     */
    private void setId(int id) {
        this.id = id;
    }

    /**
     *  Pegar Objeto Pessoa.
     *
     * @return
     */
    public Pessoa getPessoa() {
        return this.pessoa;
    }

    /**
     *  Setar um novo Objeto Pessoa.
     *
     * @param pessoa
     */
    private void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /**
     *  Pegar valor da variável login.
     *
     * @return
     */
    public String getLogin() {
        return this.login;
    }

    /**
     *  Setar uma novo login.
     *
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *  Pegar valor da variável senha.
     *
     * @return
     */
    private String getSenha() {
        return this.senha;
    }

    /**
     *  Setar uma nova senha.
     *
     * @param senha
     */
    private void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     *  Pegar valor da variável email.
     *
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     *  Setar um novo email.
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *  Pegar Objeto Biblioteca.
     *
     * @return
     */
    public Biblioteca getBiblioteca() {
        return new Biblioteca(this.getId());
    }

    /**
     *  Método responsavel por cadastrar novo livro na biblioteca do usuário.
     *
     * @param idLivro
     */
    public void cadastrarLivroBiblioteca(int idLivro) {
        new Biblioteca(this.getId(), idLivro);
    }

    /**
     *  Método responsavel por validar login.
     *
     * @param login
     * @param senha
     * @return
     */
    public boolean validarLogin(String login, String senha) {
        if (this.login.equals(login)) {

            if (! this.senha.equals(senha)) {
                return false;
            }

            return true;
        } else {
            return false;
        }
    }

    /**
     *  Método responsavel por alterar a senha do usuário.
     *
     * @param senhaAtual
     * @param senhaNova
     * @return
     */
    public boolean alterarSenha(String senhaAtual, String senhaNova) {
        if (this.login != null && this.getSenha().equals(senhaAtual)) {
            this.setSenha(senhaNova);

            return true;
        }

        return false;
    }

    /**
     *  Pegar informações do Objeto Usuario.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "id="         + this.getId() +
                "\nPessoa : " + this.getPessoa() +
                "\nLogin : "  + this.getLogin() +
                "\nEmail : "  + this.getEmail() +
                "\n"          + this.getBiblioteca();
    }
}
