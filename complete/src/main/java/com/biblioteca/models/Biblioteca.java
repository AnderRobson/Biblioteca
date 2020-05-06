package com.biblioteca.models;

public class Biblioteca {


    /** Identificar do registro na tabela bibliotecas.*/
    private int id;

    /** Usuário responsável pelo registro.*/
    private Usuario usuario;

    /** Livro registrado na biblioteca do usuário.*/
    private Livro livro;

    /**
     *  Método construtor buscando a biblioteca do usuário pelo id do usuário.
     *
     * @param id
     */
    public Biblioteca(int id) {
        this.id = id;
    }

    /**
     *  Método construtor cadastrando novo livro na biblioteca do usuário.
     *
     * @param idUsuario
     * @param idLivro
     */
    public Biblioteca(int idUsuario, int idLivro) {
        //Salvar registro no banco de dados na tabela bibliotecas.
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
     *  Setar um novo id da tabela bibliotecas.
     *
     * @param id
     */
    private void setId(int id) {
        this.id = id;
    }

    /**
     *  Pegar Objeto usuario.
     *
     * @return
     */
    public Usuario getUsuario() {
        return this.usuario;
    }

    /**
     *  Setar um novo Objeto Usuario.
     *
     * @param usuario
     */
    private void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     *  Pegar Objeto Livro.
     *
     * @return
     */
    public Livro getLivro() {
        return this.livro;
    }

    /**
     *  Setar um novo Objeto Livro.
     *
     * @param livro
     */
    private void setLivro(Livro livro) {
        this.livro = livro;
    }

    /**
     *  Pegar informações do Objeto Biblioteca.
     *
     * @return
     */
    @Override
    public String toString() {
        String nomeUsuario = this.getUsuario().getPessoa().getNome();
        String tituloLivro = this.getLivro().getTitulo();

        return "Biblioteca : " +
                "\nID : "      + this.getId() +
                "\nUsuario : " + nomeUsuario +
                "\nLivro : "   + tituloLivro;
    }
}
