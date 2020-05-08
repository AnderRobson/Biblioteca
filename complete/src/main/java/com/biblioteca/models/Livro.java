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
        this.livros[0] = new Livro(0, "A Sutil Arte de Ligar o F*da-se", "Chega de tentar buscar um sucesso que só existe na sua cabeça. Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo. Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.\n" +
                "\n" +
                "Coaching, autoajuda, desenvolvimento pessoal, mentalização positiva - sem querer desprezar o valor de nada disso, a grande verdade é que às vezes nos sentimos quase sufocados diante da pressão infinita por parecermos otimistas o tempo todo. É um pecado social se deixar abater quando as coisas não vão bem. Ninguém pode fracassar simplesmente, sem aprender nada com isso. Não dá mais. É insuportável. E é aí que entra a revolucionária e sutil arte de ligar o foda-se.\n" +
                "\n" +
                "Mark Manson usa toda a sua sagacidade de escritor e seu olhar crítico para propor um novo caminho rumo a uma vida melhor, mais coerente com a realidade e consciente dos nossos limites. E ele faz isso da melhor maneira. Como um verdadeiro amigo, Mark se senta ao seu lado e diz, olhando nos seus olhos: você não é tão especial. Ele conta umas piadas aqui, dá uns exemplos inusitados ali, joga umas verdades na sua cara e pronto, você já se sente muito mais alerta e capaz de enfrentar esse mundo cão.\n" +
                "\n" +
                "Para os céticos e os descrentes, mas também para os amantes do gênero, enfim uma abordagem franca e inteligente que vai ajudar você a descobrir o que é realmente importante na sua vida, e f*da-se o resto. Livre-se agora da felicidade maquiada e superficial e abrace esta arte verdadeiramente transformadora.", 240, "http://imagens.lelivros.love/2018/01/Baixar-Livro-A-Sutil-Arte-de-Ligar-o-Foda-se-Mark-Manson-em-Epub-Mobi-PDF-ou-Ler-Online.jpg");
        this.livros[1] = new Livro(1, "O Nome do Vento", "Ninguém sabe ao certo quem é o herói ou o vilão desse fascinante universo criado por Patrick Rothfuss. Na realidade, essas duas figuras se concentram em Kote, um homem enigmático que se esconde sob a identidade de proprietário da hospedaria Marco do Percurso. Da infância numa trupe de artistas itinerantes, passando pelos anos vividos numa cidade hostil e pelo esforço para ingressar na escola de magia, O nome do vento acompanha a trajetória de Kote e as duas forças que movem sua vida: o desejo de aprender o mistério por trás da arte de nomear as coisas e a necessidade de reunir informações sobre o Chandriano - os lendários demônios que assassinaram sua família no passado. Quando esses seres do mal reaparecem na cidade, um cronista suspeita de que o misterioso Kote seja o personagem principal de diversas histórias que rondam a região e decide aproximar-se dele para descobrir a verdade. Pouco a pouco, a história de Kote vai sendo revelada, assim como sua multifacetada personalidade - notório mago, esmerado ladrão, amante viril, herói salvador, músico magistral, assassino infame. Nesta provocante narrativa, o leitor é transportado para um mundo fantástico, repleto de mitos e seres fabulosos, heróis e vilões, ladrões e trovadores, amor e ódio, paixão e vingança. Mais do que a trama bem construída e os personagens cativantes, o que torna O nome do vento uma obra tão especial - que levou Patrick Rothfuss ao topo da lista de mais vendidos do The New York Times - é sua capacidade de encantar leitores de todas as idades.", 240, "https://m.media-amazon.com/images/I/51R71sVQ6PL.jpg");
        this.livros[2] = new Livro(2, "O Temor do Sábio", "“Lembre-se de que há três coisas que todo sábio teme: o mar na tormenta, uma noite sem luar e a ira de um homem gentil.” O temor do sábio dá continuidade à impressionante história de Kvothe, o Arcano, o Sem-Sangue, o Matador do Rei. Quando é aconselhado a abandonar seus estudos na Universidade por um período, por causa de sua rivalidade com um membro da nobreza local, Kvothe é obrigado a tentar a vida em outras paragens. Em busca de um patrocinador para sua música, viaja mais de mil quilômetros até Vintas. Lá, é rapidamente envolvido na política da corte. Enquanto tenta cair nas graças de um nobre poderoso, Kvothe usa sua habilidade de arcanista para impedir que ele seja envenenado e lidera um grupo de mercenários pela floresta, a fim de combater um bando de ladrões perigosos. Ao longo do caminho, tem um encontro fantástico com Feluriana, uma criatura encantada à qual nenhum homem jamais pôde resistir ou sobreviver – até agora. Kvothe também conhece um guerreiro ademirano que o leva a sua terra, um lugar de costumes muito diferentes, onde vai aprender a lutar como poucos. Enquanto persiste em sua busca de respostas sobre o Chandriano, o grupo de criaturas demoníacas responsável pela morte de seus pais, Kvothe percebe como a vida pode ser difícil quando um homem se torna uma lenda de seu próprio tempo.", 240, "https://lojasaraiva.vteximg.com.br/arquivos/ids/12102635-287-426/1006559114.jpg?v=637142223580500000");
        this.livros[3] = new Livro(3, "A redoma de vidro", "O ÚNICO ROMANCE DE SYLVIA PLATH GANHA NOVA CAPA!\n" +
                "\n" +
                "Publicado originalmente em 1963, esta edição, com tradução de Chico Mattoso, traz nova capa e desenhos da autora. Lançado semanas antes da morte de Sylvia, o livro é repleto de referências autobiográficas, e a narrativa é inspirada nos acontecimentos do verão de 1952, quando Silvia Plath tentou o suicídio e foi internada em uma clínica psiquiátrica.\n" +
                "\n" +
                "Esther Greenwood é uma jovem que sai do subúrbio de Boston para trabalhar em uma prestigiosa revista de moda em Nova York. Assim como a protagonista, a autora foi uma estudante com um histórico exemplar que sofreu uma grave depressão. Muitas questões de Esther retratam as preocupações de uma geração pré-revolução sexual, em que as mulheres ainda precisavam escolher se priorizavam a profissão ou a família.\n" +
                "\n" +
                "Além da elegância da prosa de Plath, o livro extrai sua força da forma corajosa como trata a depressão. Mais que um relato sobre problemas mentais, A redoma de vidro é uma narrativa singular acerca das dores do amadurecimento.\n" +
                "\n" +
                "\"A redoma de vidro continuará a ressoar nas pessoas ao longo dos anos e merecerá inúmeras releituras, pois fala de contradições e de problemas humanos. Um livro para refletir sobre a representação da mulher na sociedade, os desafios profissionais e a solidão nas metrópoles e sobre alguém que tinha tudo para ser feliz.\"\n" +
                "Juliana Gomes, co-criadora do projeto Leia Mulheres", 240, "https://m.media-amazon.com/images/I/41MVKBsPksL.jpg");
        this.livros[4] = new Livro(4, "Como Fazer Amigos & Influenciar Pessoas", "Um dos maiores clássicos de todos os tempos, Como fazer amigos e influenciar pessoas é considerado a Bíblia dos relacionamentos interpessoais.\n" +
                "\n" +
                "\"O livro de autoajuda mais bem-sucedido de todos os tempos. Carnegie nunca foi tão relevante.\"–The Times\n" +
                "\n" +
                "MAIS DE 16 MILHÕES DE LIVROS VENDIDOS\n" +
                "\n" +
                "Ao longo de oito décadas, este livro se tornou a referência quando o assunto é o desenvolvimento das relações humanas, das habilidades sociais e da comunicação eficiente.\n" +
                "\n" +
                "Partindo do princípio de que é preciso se interessar genuinamente por aqueles com quem interagimos, ele mudou a vida de milhões de pessoas, fazendo-as se sentirem mais seguras, abertas e confiantes em seus encontros sociais e profissionais.\n" +
                "\n" +
                "Com saborosas histórias, exemplos práticos e ótimos conselhos, esta é uma leitura prazerosa e fundamental para quem deseja criar bons vínculos, se tornar mais persuasivo, deixar uma marca positiva e inspirar os outros com energia e gentileza.\n" +
                "\n" +
                "\"Os princípios ensinados neste livro só funcionam quando são de coração. Não estou defendendo um conjunto de truques. Estou falando sobre um novo estilo de vida.\n" +
                "\n" +
                "Se inspirarmos as pessoas a perceber os próprios tesouros ocultos, poderemos fazer bem mais do que mudá-las – poderemos literalmente transformá-las.\" – Dale Carnegie", 240, "https://qph.fs.quoracdn.net/main-qimg-bb3e4f1e6249ea7d706efe507ecb3488");
        this.livros[5] = new Livro(5, "O Poder do Hábito", "Charles Duhigg, repórter investigativo do New York Times, mostra que a chave para o sucesso é entender como os hábitos funcionam - e como podemos transformá-los.\n" +
                "\n" +
                "Durante os últimos dois anos, uma jovem transformou quase todos os aspectos de sua vida. Parou de fumar, correu uma maratona e foi promovida. Em um laboratório, neurologistas descobriram que os padrões dentro do cérebro dela mudaram de maneira fundamental.\n" +
                "Publicitários da Procter & Gamble observaram vídeos de pessoas fazendo a cama. Tentavam desesperadamente descobrir como vender um novo produto chamado Febreze, que estava prestes a se tornar um dos maiores fracassos na história da empresa. De repente, um deles detecta um padrão quase imperceptível - e, com uma sutil mudança na campanha publicitária, Febreze começa a vender um bilhão de dólares por anos.\n" +
                "Um diretor executivo pouco conhecido assume uma das maiores empresas norte-americanas. Seu primeiro passo é atacar um único padrão entre os funcionários - a maneira como lidam com a segurança no ambiente de trabalho -, e logo a empresa começa a ter o melhor desempenho no índice Dow Jones.\n" +
                "O que todas essas pessoas tem em comum? Conseguiram ter sucesso focando em padrões que moldam cada aspecto de nossas vidas. Tiveram êxito transformando hábitos. Com perspicácia e habilidade, Charles Duhigg apresenta um novo entendimento da natureza humana e seu potencial para a transformação.", 240, "https://images-na.ssl-images-amazon.com/images/I/81QPybA6jNL.jpg");
        this.livros[6] = new Livro(6, "A Arte da Guerra", "O maior tratado de guerra de todos os tempos em sua versão completa em português. A Arte da Guerra é sem dúvida a Bíblia da estratégia, sendo hoje utilizada amplamente no mundo dos negócios, conquistando pessoas e mercados. Não nos surpreende vê-la citada em filmes como Wall Street (Oliver Stone, 1990) e constantemente aplicada para solucionar os mais recentes conflitos do nosso dia-a-dia. Conheça um dos maiores ícones da estratégia dos últimos 2500 anos.\n" +
                "\n" +
                "Sunzi disse:\n" +
                "\n" +
                "\"A guerra se baseia no engano, se faz pelo ganho e se adapta pela divisão e combinação.\"\n" +
                "\n" +
                "\"Tal como a água procura as profundezas e evita os cumes, um exército ataca o vazio e evita o cheio. A água se move de acordo com a terra; um exército se movimenta de acordo com o inimigo.\"\n" +
                "\n" +
                "\"Quando o general é fraco, sem autoridade junto aos soldados, suas regras são confusas e sua moral é baixa, o exército é confuso.\"", 240, "https://lojasaraiva.vteximg.com.br/arquivos/ids/12100765/1008444266.jpg?v=637142217765200000");
        this.livros[7] = new Livro(7, "Uma Arte Mortal", "Os líderes do Tae Kwon Do, um esporte olímpico e uma das artes marciais mais populares do mundo, gostam de dizer que sua arte está cheia de antigas dinastias e proezas sobre-humanas. Existem motivos para as mentiras e mitos por trás das poderosas técnicas. O \"Uma Arte Mortal\" leva você a cultos, casas de gueixas e sindicatos do crime que moldaram o Tae Kwon Do.\n" +
                "\n" +
                "A edição brasileira é a tradução da 2ª edição do livro best-seller \"A Killing Art: The Untold History of Tae Kwon Do\", que contém fontes que antes eram anônimas e capítulos atualizados, além de mais 7 capítulos inéditos sobre a história do Tae Kwon Do no Brasil.", 400, "https://scontent.fpoa4-1.fna.fbcdn.net/v/t1.0-9/s960x960/40779142_2266414013588128_5599636218582138880_o.jpg?_nc_cat=105&_nc_sid=8024bb&_nc_eui2=AeHY-8r0RrKsHLcWN5ArDc_2oup2zvJdYiOi6nbO8l1iI4ADtDD6yrdZI5sPvMKzZetouxCTHXSez-mYl3CeSAn-&_nc_oc=AQmsaLLPmb0RiNF4bXjTozSCQynhy_GmpZcRoTqNMqHXPfino1_FxYpNF1gzYp9ggbY&_nc_ht=scontent.fpoa4-1.fna&_nc_tp=7&oh=ef058da0fad1089ceca62ef4c1292c81&oe=5ED91B69");
        this.livros[8] = new Livro(8, "As Armas da Persuasão", "“Este excelente livro explica em linguagem clara e prática como somos persuadidos. Ele oferece informações essenciais não só para aqueles que vendem, mas também para aqueles que não querem comprar.” – Roger Fischer, diretor do Projeto de Negociação de Harvard e coautor de Como Chegar ao Sim. Depois de passar anos caindo na lábia de vendedores, arrecadadores de doações e operadores de telemarketing, o psicólogo Robert B. Cialdini resolveu se dedicar ao estudo da persuasão. Ele queria entender quais são os fatores que levam uma pessoa a dizer “sim” a um pedido e que técnicas exploram melhor esses fatores. Reunindo dados das mais recentes pesquisas científicas sobre o assunto, histórias de gente comum e a experiência adquirida ao se infiltrar em organizações que treinam os chamados “profissionais da persuasão”, Cialdini criou uma obra acessível, informativa e indispensável a todos aqueles que querem saber como influenciar pessoas e, ao mesmo tempo, se defender dos manipuladores. Seis princípios psicológicos básicos governam o comportamento humano quando tomamos uma decisão e podem ser usados como verdadeiras armas: 1. Reciprocidade - nos sentimos compelidos a retribuir, nem sempre de forma vantajosa para nós, o que outra pessoa nos proporcionou; 2. Compromisso e coerência - depois que fazemos uma escolha, enfrentamos pressões para nos comportarmos de maneira condizente com o compromisso assumido; 3. Aprovação social - buscamos nos outros indícios do comportamento mais apropriado a seguir; 4. Afeição - preferimos acatar pedidos de pessoas que conhecemos e de que gostamos; 5. Autoridade - temos um arraigado senso de obediência à autoridade; 6. Escassez - tudo se torna mais valioso quando fica menos disponível. Cada princípio é discutido pelo autor em termos de sua função na sociedade e de como um profissional da persuasão pode mobilizar seu poder em pedidos de compras, doações, concessões, votos, permissões, etc. Além disso, aprendemos a usar essas técnicas a nosso favor nas interações diárias de todo tipo, com vizinhos, amigos, colegas, parceiros de negócios ou familiares.", 240, "https://images-na.ssl-images-amazon.com/images/I/81wPx14WC2L.jpg");
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
