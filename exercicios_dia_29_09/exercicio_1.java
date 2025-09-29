package exercicio_dia_29;

/*
A escola está organizando uma Feira Tecnológica de Inovação, onde serão apresentados diversos projetos de diferentes áreas.
O sistema que deve ser desenvolvido em Java tem como objetivo gerenciar os projetos expostos e também registrar as avaliações
feitas pelos avaliados solicitados.
 */

import javax.xml.transform.Source;

class Projeto {
    String nome;
    String nome_responsavel;
    String instituicao_origem;
    int espaco_feira;

    //Construtor vazio
    Projeto(){
        this.nome = "";
        this.nome_responsavel = "";
        this.instituicao_origem = "";
        this.espaco_feira = 0;
    }

    //Construtor
    Projeto(String nome, String nome_responsavel, String instituicao_origem, int espaco_feira){
        this.nome = nome;
        this.nome_responsavel = nome_responsavel;
        this.instituicao_origem = instituicao_origem;
        this.espaco_feira = espaco_feira;
    }
}

class Projeto_Robotica extends Projeto{
    int quant_sensores;
    String hardware_utilizado;
    String software_utilizado;
    String linguagem_programacao_utilizada;

    //Construtor
    Projeto_Robotica(){
        this.nome = "";
        this.nome_responsavel = "";
        this.instituicao_origem = "";
        this.quant_sensores = 0;
        this.hardware_utilizado = "";
        this.software_utilizado = "";
        this.linguagem_programacao_utilizada = "";
    }

    //Construtor
    Projeto_Robotica(String nome, String nome_responsavel, int espaco_feira, int quant_sensores, String hardware_utilizado, String software_utilizado, String linguagem_programacao_utilizada){
        this.nome = nome;
        this.nome_responsavel = nome_responsavel;
        this.espaco_feira = espaco_feira;
        this.quant_sensores = quant_sensores;
        this.hardware_utilizado = hardware_utilizado;
        this.software_utilizado = software_utilizado;
        this.linguagem_programacao_utilizada = linguagem_programacao_utilizada;
    }
}

class Projeto_Software extends Projeto{
    String software_utilizado;
    String plataforma_desenvolvimento;
    String framework;

    //Construtor vazio
    Projeto_Software(){
        this.nome = "";
        this.nome_responsavel = "";
        this.espaco_feira = 0;
        this.software_utilizado = "";
        this.plataforma_desenvolvimento = "";
        this.framework = "";
    }

    //Construtor
    Projeto_Software(String nome, String nome_responsavel, int espaco_feira, String software_utilizado, String plataforma_desenvolvimento, String framework) {
        this.nome = nome;
        this.nome_responsavel = nome_responsavel;
        this.espaco_feira = espaco_feira;
        this.software_utilizado = software_utilizado;
        this.plataforma_desenvolvimento = plataforma_desenvolvimento;
        this.framework = framework;
    }
}

class Projeto_ciencias extends Projeto{
    String tema_pesquisa;
    String origem_pesquisa;
    String area_cientifica;

    //Construtor vazio
    Projeto_ciencias(){
        this.nome = "";
        this.nome_responsavel = "";
        this.espaco_feira = 0;
        this.tema_pesquisa = "";
        this.origem_pesquisa = "";
        this.area_cientifica = "";
    }

    //Construtor
    Projeto_ciencias(String nome, String nome_responsavel, int espaco_feira, String tema_pesquisa, String origem_pesquisa, String area_cientifica){
        this.nome = nome;
        this.nome_responsavel = nome_responsavel;
        this.espaco_feira = espaco_feira;
        this.tema_pesquisa = tema_pesquisa;
        this.origem_pesquisa = origem_pesquisa;
        this.area_cientifica = area_cientifica;
    }
}

class Avaliador {
    String nome;
    String especialidade;

    //Construtor vazio
    Avaliador(){
        this.nome = "";
        this.especialidade = "";
    }

    //Construtor
    Avaliador(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
}

class Avaliacao extends Avaliador{
    Projeto projeto;
    Avaliador avaliador;
    int nota;

    //Construtor vazio
    Avaliacao(){
        this.projeto = new Projeto();
        this.avaliador = new Avaliador();
        this.nota = 0;
    }

    //Construtor
    Avaliacao(Object projeto,Object Avaliador, int nota){
        this.projeto = new Projeto();
        this.avaliador = new Avaliador();
        this.nota = nota;
    }

    public void mostrar_nota() {
        System.out.println("=== Avaliação ===");
        System.out.printf("nome: " + projeto.nome);
        System.out.println("Avaliador: " + avaliador.nome);
        System.out.println("nota: " + nota);
    }

}
public class exercicio_1 {
    public static void main(String[] args) {
        Projeto_Robotica projeto1 = new Projeto_Robotica("Projeto1", "Wellington",1, 1, "Arduino", "ArduinoIDE", "C");
        Avaliador avaliador1 = new Avaliador("Luciano Cassol", "Robótica");

        Avaliacao avaliacao1 = new Avaliacao(projeto1,avaliador1,10);
        System.out.println("Projeto: " + projeto1.nome);
        System.out.println("Avaliador: " + avaliador1.nome);
        System.out.println("nota: " + avaliacao1.nota);
    }
}

