package com.biblioteca.models;

public class Endereco {

    /** Identificar do registro na tabela enderecos.*/
    private int id;

    /** Nome da rua.*/
    private String rua;

    /** Número da casa.*/
    private int numero;

    /** Nome do bairro.*/
    private String bairro;

    /** Nome da cidade.*/
    private String cidade;

    /** Sigla do stado*/
    private String estado;

    /**
     *  Método construtor buscando endereço pelo seu id.
     *
     * @param id
     */
    public Endereco(int id) {
        this.id = id;
    }

    /**
     *  Método construtor cadastrando um novo endereço.
     *
     * @param rua //Nome da rua.
     * @param numero //Número da casa.
     * @param bairro //Nome do bairro.
     * @param cidade //Nome da cidade.
     * @param estado //Sigla do estado.
     */
    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
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
     *  Setar um novo id da tabela enderecos.
     *
     * @param id
     */
    private void setId(int id) {
        this.id = id;
    }

    /**
     *  Pegar valor da variável rua.
     *
     * @return
     */
    public String getRua() {
        return this.rua;
    }

    /**
     *  Setar um novo nome rua.
     *
     * @param rua
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     *  Pegar valor da variável numero.
     *
     * @return
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     *  Setar um novo número da casa.
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     *  Pegar valor da variável bairro.
     *
     * @return
     */
    public String getBairro() {
        return this.bairro;
    }

    /**
     *  Setar um novo nome bairro.
     *
     * @param bairro
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     *  Pegar valor da variável cidade.
     *
     * @return
     */
    public String getCidade() {
        return this.cidade;
    }

    /**
     *  Setar um novo nome cidade.
     *
     * @param cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     *  Pegar valor da variável estado.
     *
     * @return
     */
    public String getEstado() {
        return this.estado;
    }

    /**
     *  Setar uma nova sigla de estado.
     *
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     *  Pegar informações do Objeto Endereco.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Endereco :" +
                "\nID : "     + this.getId() +
                "\nRua : "    + this.getRua() +
                "\nNumero : " + this.getNumero() +
                "\nBairro : " + this.getBairro() +
                "\nCidade : " + this.getCidade() +
                "\nEstado : " + this.getEstado();
    }
}
