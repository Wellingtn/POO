package exercicio_dia_29;

class Pacote {
    String destino;
    int duracao_dias;
    double preco;

    // Construtor vazio
    Pacote() {
        this.destino = "";
        this.duracao_dias = 0;
        this.preco = 0.0;
    }

    // Construtor
    Pacote(String destino, int duracao_dias, double preco) {
        this.destino = destino;
        this.duracao_dias = duracao_dias;
        this.preco = preco;
    }
}

class Pacote_Nacional extends Pacote {
    String estado_destino;
    String transporte_utilizado;

    // Construtor vazio
    Pacote_Nacional() {
        super();
        this.estado_destino = "";
        this.transporte_utilizado = "";
    }

    // Construtor
    Pacote_Nacional(String destino, int duracao_dias, double preco, String estado_destino, String transporte_utilizado) {
        super(destino, duracao_dias, preco);
        this.estado_destino = estado_destino;
        this.transporte_utilizado = transporte_utilizado;
    }
}

class Pacote_Internacional extends Pacote {
    String pais_destino;
    boolean necessidade_visto;

    // Construtor vazio
    Pacote_Internacional() {
        super();
        this.pais_destino = "";
        this.necessidade_visto = false;
    }

    // Construtor
    Pacote_Internacional(String destino, int duracao_dias, double preco, String pais_destino, boolean necessidade_visto) {
        super(destino, duracao_dias, preco);
        this.pais_destino = pais_destino;
        this.necessidade_visto = necessidade_visto;
    }
}

class Pacote_Aventura extends Pacote {
    String nivel_dificuldade;
    boolean equipamento_incluido;

    // Construtor vazio
    Pacote_Aventura() {
        super();
        this.nivel_dificuldade = "";
        this.equipamento_incluido = false;
    }

    // Construtor
    Pacote_Aventura(String destino, int duracao_dias, double preco, String nivel_dificuldade, boolean equipamento_incluido) {
        super(destino, duracao_dias, preco);
        this.nivel_dificuldade = nivel_dificuldade;
        this.equipamento_incluido = equipamento_incluido;
    }
}

class Guia {
    String nome;
    String idioma_fala;
    int anos_experiencia;

    // Construtor vazio
    Guia() {
        this.nome = "";
        this.idioma_fala = "";
        this.anos_experiencia = 0;
    }

    // Construtor
    Guia(String nome, String idioma_fala, int anos_experiencia) {
        this.nome = nome;
        this.idioma_fala = idioma_fala;
        this.anos_experiencia = anos_experiencia;
    }
}

public class exercicio_3 {
    public static void main(String[] args) {
        // Guias Turísticos
        Guia guia_nacional = new Guia("Carlos Silva", "Português", 10);
        Guia guia_internacional = new Guia("Ana Pereira", "Inglês e Espanhol", 8);
        Guia guia_aventura = new Guia("Marcos Rocha", "Português e Inglês", 15);

        // Pacotes de Viagem
        Pacote_Nacional pacote1 = new Pacote_Nacional("Chapada Diamantina", 7, 2500.00, "Bahia", "Aéreo e Terrestre");
        Pacote_Internacional pacote2 = new Pacote_Internacional("Machu Picchu", 10, 5500.00, "Peru", false);
        Pacote_Aventura pacote3 = new Pacote_Aventura("Monte Roraima", 8, 4200.00, "Difícil", true);

        System.out.println("=== Pacote Nacional ===");
        System.out.println("Destino: " + pacote1.destino);
        System.out.println("Duração: " + pacote1.duracao_dias + " dias");
        System.out.printf("Preço: R$ %.2f\n", pacote1.preco);
        System.out.println("Estado: " + pacote1.estado_destino);
        System.out.println("Transporte: " + pacote1.transporte_utilizado);
        System.out.println("Guia Responsável: " + guia_nacional.nome + " (" + guia_nacional.idioma_fala + ")");

        System.out.println("\n=== Pacote Internacional ===");
        System.out.println("Destino: " + pacote2.destino);
        System.out.println("Duração: " + pacote2.duracao_dias + " dias");
        System.out.printf("Preço: R$ %.2f\n", pacote2.preco);
        System.out.println("País: " + pacote2.pais_destino);
        System.out.println("Necessita Visto: " + (pacote2.necessidade_visto ? "Sim" : "Não"));
        System.out.println("Guia Responsável: " + guia_internacional.nome + " (" + guia_internacional.idioma_fala + ")");

        System.out.println("\n=== Pacote de Aventura ===");
        System.out.println("Destino: " + pacote3.destino);
        System.out.println("Duração: " + pacote3.duracao_dias + " dias");
        System.out.printf("Preço: R$ %.2f\n", pacote3.preco);
        System.out.println("Nível de Dificuldade: " + pacote3.nivel_dificuldade);
        System.out.println("Equipamento Incluído: " + (pacote3.equipamento_incluido ? "Sim" : "Não"));
        System.out.println("Guia Responsável: " + guia_aventura.nome + " (" + guia_aventura.idioma_fala + ")");
    }
}
