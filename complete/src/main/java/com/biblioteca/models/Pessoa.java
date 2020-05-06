package com.biblioteca.models;

public class Pessoa {

    /** Identificar do registro na tabela pessoas.*/
    private int id;

    /** Nome da pessoa.*/
    private String nome;

    /** Data de nascimento da pessoa.*/
    private String dataNascimento;

    /** Endereço da pessoa.*/
    private Endereco endereco;

    Pessoa[] pessoas = new Pessoa[10];

    /**
     * Método construtor buscando pessoa pelo seu id.
     *
     * @param id //ID do usuário na tabela usuario.
     */
    public Pessoa(int id) {
        this.setId(id);
    }

    public Pessoa() {
        this.pessoas[0] = new Pessoa(0, "Mark Manson", "06/10/1964", "Av Protásio Alves", 1287, "Agronomia", "Porto Alegre", "RS");
        this.pessoas[1] = new Pessoa(1, "Patrick Rothfuss", "16/04/1984", "Av Protásio Alves", 1287, "Agronomia", "Porto Alegre", "RS");
        this.pessoas[3] = new Pessoa(3,"Sylvia Plath", "25/07/1989", "Av Protásio Alves", 1287, "Agronomia", "Porto Alegre", "RS");
        this.pessoas[4] = new Pessoa(4,"Dale Carnegie", "30/05/2000", "Av Protásio Alves", 1287, "Agronomia", "Porto Alegre", "RS");
        this.pessoas[5] = new Pessoa(5,"Charles Duhigg", "14/05/1996", "Av Protásio Alves", 1287, "Agronomia", "Porto Alegre", "RS");
        this.pessoas[6] = new Pessoa(6,"Sun Tzu", "06/09/1968", "Av Protásio Alves", 1287, "Agronomia", "Porto Alegre", "RS");
        this.pessoas[7] = new Pessoa(7,"Alex Gillis", "10/07/1984", "Av Protásio Alves", 1287, "Agronomia", "Porto Alegre", "RS");
        this.pessoas[8] = new Pessoa(8,"Robert B. Cialdini", "24/12/1981", "Av Protásio Alves", 1287, "Agronomia", "Porto Alegre", "RS");
        this.pessoas[9] = new Pessoa(9,"Ander Robson", "14/12/1981", "Av Protásio Alves", 1287, "Agronomia", "Porto Alegre", "RS");
    }

    /**
     *  Método construtor gerando o cadastro de uma pessoa.
     *
     * @param nome //Nome da pessoa.
     * @param dataNascimento //Data de nascimento da pessoa.
     *
     * Para cadastar o endereço da pessoa.
     * @param rua //Rua a onde a pessoa mora.
     * @param numero //Número da casa da pessoa.
     * @param bairro //Bairro a onde a pessoa mora.
     * @param cidade //Cidade a onde a pessoa mora.
     * @param estado //Estado a onde a pessoa mora.
     */
    public Pessoa(int id, String nome, String dataNascimento, String rua, int numero, String bairro, String cidade, String estado) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = new Endereco(rua, numero, bairro, cidade, estado);
    }

    /**
     *  Pegar valor na variável id.
     *
     * @return
     */
    public int getId() {
        return this.id;
    }

    /**
     *  Setar um novo id da tabela pessoas.
     *
     * @param id
     */
    private void setId(int id) {
        this.id = id;
    }

    /**
     *  Pegar valor na variável nome.
     *
     * @return
     */
    public String getNome() {
        return this.nome;
    }

    /**
     *  Setar um novo nome.
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *  Pegar valor na variável dataNascimento.
     *
     * @return
     */
    public String getDataNascimento() {
        return this.dataNascimento;
    }

    /**
     *  Setar uma nova data de nascimento.
     *
     * @param dataNascimento
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     *  Pegar Objeto Endereco.
     *
     * @return
     */
    public Endereco getEndereco() {
        return this.endereco;
    }

    /**
     *  Setar um novo Objeto Endereco.
     *
     * @param endereco
     */
    private void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa getPessoa(int idPessoa) {
        return this.pessoas[idPessoa];
    }

    /**
     *  Pegar informações do Objeto Pessoa.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Pessoa: " +
                "\nID : "                 + this.getId() +
                "\nNome : "               + this.getNome() +
                "\nData de Nascimento : " + this.getDataNascimento() +
                "\n"                      + this.getEndereco();
    }
}
