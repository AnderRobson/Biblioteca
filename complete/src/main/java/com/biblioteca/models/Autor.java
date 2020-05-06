package com.biblioteca.models;

public class Autor {


    /** Identificar do registro na tabela autores.*/
    private int id;

    private int idPessoa;

    /** Pessoa responsavel pelo autor.*/
    private Pessoa pessoa;

    /**
     *  Método construtor buscando autor pelo seu id.
     *
     * @param id
     */
    public Autor(int id) {
        this.setId(id);
        if (id == 2) {
            id = 1;
        }
        this.setPessoa(new Pessoa().getPessoa(id));
    }

    /**
     *  Método construtor cadastrando uma pessoa como autor.
     *
     * @param pessoa
     */
    public Autor(Pessoa pessoa) {
        this.setPessoa(pessoa);
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
     *  Setar um novo id da tabela autores.
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
     *  Pegar informações do Objeto Autor.
     *
     * @return
     */
    public String toString() {
        return "Autor : " +
                "\nID : " + this.getId() +
                "\n"      + this.getPessoa();
    }
}
