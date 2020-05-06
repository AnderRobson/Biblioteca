package com.biblioteca.models;


import javax.servlet.SessionTrackingMode;

public class Livro {


    /** Identificar do registro na tabela livros.*/
    private int id;

    /** Título do livro.*/
    private String titulo;

    /** Autor do livro.*/
    private Autor autor;

    /** Descrição do livro.*/
    private String descricao;

    /** Número de páginas do livro.*/
    private int paginas;

    private String imagem;

    private Livro[] livros = new Livro[9];

    public Livro() {
        this.livros[0] = new Livro(0, "A Sutil Arte de Ligar o F*da-se", "Teste descrição primeiro livro", 240, "http://imagens.lelivros.love/2018/01/Baixar-Livro-A-Sutil-Arte-de-Ligar-o-Foda-se-Mark-Manson-em-Epub-Mobi-PDF-ou-Ler-Online.jpg");
        this.livros[1] = new Livro(1, "O Nome do Vento", "Teste descrição segundo livro", 240, "https://m.media-amazon.com/images/I/51R71sVQ6PL.jpg");
        this.livros[2] = new Livro(2, "O Temor do Sábio", "Teste descrição terceiro livro", 240, "https://lojasaraiva.vteximg.com.br/arquivos/ids/12102635-287-426/1006559114.jpg?v=637142223580500000");
        this.livros[3] = new Livro(3, "The Bell Jar", "Teste descrição primeiro livro", 240, "https://designcomcafe.com.br/wp-content/uploads/2017/08/capas-de-livros-the-bell-jar-sylvia-plath.jpg");
        this.livros[4] = new Livro(4, "Como Fazer Amigos & Influenciar Pessoas", "Teste descrição segundo livro", 240, "https://qph.fs.quoracdn.net/main-qimg-bb3e4f1e6249ea7d706efe507ecb3488");
        this.livros[5] = new Livro(5, "O Poder do Hábito", "Teste descrição terceiro livro", 240, "https://images-na.ssl-images-amazon.com/images/I/81QPybA6jNL.jpg");
        this.livros[6] = new Livro(6, "A Arte da Guerra", "Teste descrição primeiro livro", 240, "https://lojasaraiva.vteximg.com.br/arquivos/ids/12100765/1008444266.jpg?v=637142217765200000");
        this.livros[7] = new Livro(7, "Uma Arte Mortal", "Teste descrição segundo livro", 240, "https://scontent.fpoa4-1.fna.fbcdn.net/v/t1.0-9/s960x960/40779142_2266414013588128_5599636218582138880_o.jpg?_nc_cat=105&_nc_sid=8024bb&_nc_eui2=AeHY-8r0RrKsHLcWN5ArDc_2oup2zvJdYiOi6nbO8l1iI4ADtDD6yrdZI5sPvMKzZetouxCTHXSez-mYl3CeSAn-&_nc_oc=AQmsaLLPmb0RiNF4bXjTozSCQynhy_GmpZcRoTqNMqHXPfino1_FxYpNF1gzYp9ggbY&_nc_ht=scontent.fpoa4-1.fna&_nc_tp=7&oh=ef058da0fad1089ceca62ef4c1292c81&oe=5ED91B69");
        this.livros[8] = new Livro(8, "As Armas da Persuasão", "Teste descrição terceiro livro", 240, "https://images-na.ssl-images-amazon.com/images/I/81wPx14WC2L.jpg");
//        this.autor[] = new Autor(0, 0);
    }

    /**
     *  Método construtor buscando livro pelo seu id.
     *
     * @param id
     */
    public Livro(int id) {
        this.id = id;
    }

    /**
     *  Método construtor cadastrando um novo livro.
     *
     * @param titulo
     * @param autor
     * @param descricao
     * @param paginas
     */
    public Livro(int id, String titulo, String descricao, int paginas, String imagem) {
        this.id = id;
        this.titulo = titulo;
        this.autor = new Autor(this.id);
        this.descricao = descricao;
        this.paginas = paginas;
        this.imagem = imagem;
    }

    public Livro[] getLivros() {
        return this.livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
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
     *  Setar um novo id da tabela livros.
     *
     * @param id
     */
    private void setId(int id) {
        this.id = id;
    }

    /**
     *  Pegar valor da variável titulo.
     *
     * @return
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     *  Setar um novo título.
     *
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     *  Pegar Objeto Autor.
     *
     * @return
     */
    public Autor getAutor() {
        return this.autor;
    }

    /**
     *  Setar um novo Objeto Autor.
     *
     * @param autor
     */
    private void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     *  Pegar valor da variável descricao.
     *
     * @return
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     *  Setar uma nova descrição.
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     *  Pegar valor da variável paginas.
     *
     * @return
     */
    public int getPaginas() {
        return this.paginas;
    }

    /**
     *  Setar um novo número de páginas.
     *
     * @param paginas
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getImagem() {
        return this.imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    /**
     *  Pegar informações do Objeto Livro.
     *
     * @return
     */
    @Override
    public String toString() {
        String nomeAutor = this.getAutor().getPessoa().getNome();

        return "Livro : " +
                "\nID : "        + this.getId() +
                "\nTitulo : "    + this.getTitulo() +
                "\nAutor : "     + nomeAutor +
                "\nDescricao : " + this.getDescricao() +
                "\nPáginas : "   + this.getPaginas();
    }
}
