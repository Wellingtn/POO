package exercicio_dia_29;
/*
Uma universidade está organizando um campeonato esportivo entre diferentes modalidades.
O sistema deve ser desenvolvido em Java para gerenciar os tempos participantes, os julgados
responsáveis e as partidas realizadas.
*/
class Time {
    String nome;
    String instituicao;
    int numero_jogadores;

    //Construtor vazio
    Time() {
        this.nome = "";
        this.instituicao = "";
        this.numero_jogadores = 0;
    }

    //Construtor
    Time(String nome, String instituicao, int numero_jogadores) {
        this.nome = nome;
        this.instituicao = instituicao;
        this.numero_jogadores = numero_jogadores;
    }
}

class Time_Futebol extends Time {
    String tecnico_responsavel;
    int numero_reservas;

    //Construtor vazio
    Time_Futebol() {
        this.nome = "";
        this.instituicao = "";
        this.numero_jogadores = 0;
        this.tecnico_responsavel = "";
        this.numero_reservas = 0;
    }

    //Construtor
    Time_Futebol(String nome, String instituicao, int numero_jogadores,  String tecnico_responsavel, int numero_reservas) {
        super(nome, instituicao, numero_jogadores);
        this.tecnico_responsavel = tecnico_responsavel;
        this.numero_reservas = numero_reservas;
    }
}

class Time_Volei extends Time {
    Double altura_media_jogadores;
    int quant_sets_jogados;

    //Construtor vazio
    Time_Volei() {
        super();
        this.altura_media_jogadores = 0.0;
        this.quant_sets_jogados = 0;
    }

    //Construtor
    Time_Volei(String nome, String instituicao, int numero_jogadores, double altura_media_jogadores, int quant_sets_jogados) {
        super(nome, instituicao, numero_jogadores);
        this.altura_media_jogadores = altura_media_jogadores;
        this.quant_sets_jogados = quant_sets_jogados;
    }
}

class Time_Basquete extends Time {
    Double altura_media_jogadores;
    String capitao;

    Time_Basquete() {
        super();
        this.altura_media_jogadores = 0.0;
        this.capitao = "";
    }

    Time_Basquete(String nome, String instituicao, int numero_jogadores, Double altura_media_jogadores,String capitao) {
        super(nome, instituicao, numero_jogadores);
        this.altura_media_jogadores = altura_media_jogadores;
        this.capitao = capitao;
    }
}

class Arbitro {
    String nome;
    String modalidade;
    int anos_experiencia;

    Arbitro() {
        this.nome = "";
        this.modalidade = "";
        this.anos_experiencia = 0;
    }

    Arbitro(String nome, String modalidade, int anos_experiencia) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.anos_experiencia = anos_experiencia;
    }
}

class Partida {
    Time time1;
    Time time2;
    Arbitro arbitro;
    String resultado;

    //Construtor vazio
    Partida() {
        this.time1 = null;
        this.time2 = null;
        this.arbitro = null;
        this.resultado = "";
    }

    //Construtor
    Partida (Time time1, Time time2, Arbitro arbitro, String resultado) {
        this.time1 = time1;
        this.time2 = time2;
        this.arbitro = arbitro;
        this.resultado = resultado;
    }
}


public class exercicio_2 {
    public static void main(String[] args) {
    //CRIAÇÃO DOS TIMES
    // Times de Futebol
        Time_Futebol Inter = new Time_Futebol("Inter", "AMF", 11, "Luciano Cassol", 5);
        Time_Futebol Gremio = new Time_Futebol("Grêmio", "AMF", 11, "Felipe Becker", 5);

    // Times de Volei
        Time_Volei Modena = new Time_Volei("Modena", "AMF", 5, 1.9, 5);
        Time_Volei Dynamo = new Time_Volei("Dynamo", "AMF", 5, 1.79, 5);

    // Times de Volei
        Time_Basquete Chicago_bulls = new Time_Basquete("Chicago Bulls", "AMF", 6, 1.9, "M. Jordan");
        Time_Basquete La_lakers = new Time_Basquete("LA Lakers", "AMF", 6, 1.9, "Stephen");

    //CRIAÇÃO DE ARBITROS
    // Arbitro de Futebol
        Arbitro Pierluigi_Collina = new Arbitro("Pierluigi Collina", "Futebol", 20);

    // Arbitro de Volei
        Arbitro Paulo_Beal = new Arbitro("Paulo Beal", "Volei", 10);

    // Arbitro de Basquete
        Arbitro Joey_Crawford = new Arbitro("Joey Crawford", "Basquete", 18);

    // Partidas de Futebol
        Partida partida_futebol_1 = new Partida(Gremio, Inter, Pierluigi_Collina, "1x5" );
        Partida partida_futebol_2 = new Partida(Inter, Gremio, Pierluigi_Collina, "4x1" );
        System.out.println("=== Partidas Futebol ===");
        System.out.println("Partida ida:" +
                "Time da casa: " + partida_futebol_1.time1.nome +
                "\nTime visitante: " + partida_futebol_1.time2.nome +
                "\nArbitro: " + partida_futebol_1.arbitro.nome +
                "\nResultado: " + partida_futebol_1.resultado);
        System.out.println("\nPartida de volta:" +
                "\nTime da casa: " + partida_futebol_2.time1.nome +
                "\nTime visitante: " + partida_futebol_2.time2.nome +
                "\nArbitro: " + partida_futebol_2.arbitro.nome +
                "\nResultado: " + partida_futebol_2.resultado);

    // Partidas de Volei
        Partida partida_volei_1 = new Partida(Modena, Dynamo, Paulo_Beal, "1x3" );
        Partida partida_volei_2 = new Partida(Dynamo, Modena, Paulo_Beal, "2x1" );
        System.out.println("\n=== Partidas Volei ===");
        System.out.println("Partida ida:" +
                "\nTime da casa: " + partida_volei_1.time1.nome +
                "\nTime visitante: " + partida_volei_1.time2.nome +
                "\nArbitro: " + partida_volei_1.arbitro.nome +
                "\nResultado: " + partida_volei_1.resultado);
        System.out.println("\nPartida de volta:" +
                "\nTime da casa: " + partida_volei_2.time1.nome +
                "\nTime visitante: " + partida_volei_2.time2.nome +
                "\nArbitro: " + partida_volei_2.arbitro.nome +
                "\nResultado: " + partida_volei_2.resultado);
    // Partidas de Basquete
        Partida partida_basquete_1 = new Partida(Chicago_bulls, La_lakers, Joey_Crawford, "98x103" );
        Partida partida_basquete_2 = new Partida(La_lakers, Chicago_bulls, Joey_Crawford, "93x97" );

        System.out.println("\n=== Partidas Basquete ===");
        System.out.println("Partida ida:" +
                "\nTime da casa: " + partida_basquete_1.time1.nome +
                "\nTime visitante: " + partida_basquete_1.time2.nome +
                "\nArbitro: " + partida_basquete_1.arbitro.nome +
                "\nResultado: " + partida_basquete_1.resultado);
        System.out.println("\nPartida de volta:" +
                "\nTime da casa: " + partida_basquete_2.time1.nome +
                "\nTime visitante: " + partida_basquete_2.time2.nome +
                "\nArbitro: " + partida_basquete_2.arbitro.nome +
                "\nResultado: " + partida_basquete_2.resultado);
    }
}
