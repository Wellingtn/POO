package exercicios;

import java.util.Scanner;

class Personagem{
    String nome;
    int vida;

    //Construtor
    Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    //Construtor vazio
    Personagem() {
        this.nome = "";
        this.vida = 100;
    }

    void sofrer_dano(int dano){
        if (this.vida > 0){
            this.vida -= dano;
        } else {
            System.out.println("Vida já zerada.");
        }
    }

    void perder_vida(){
        if (this.vida > 0){
            this.vida = 0;
        } else {
            System.out.println("Vida já zerada.");
        }
    }

    void curar(int valor){
        this.vida += valor;
    }

    void recuperar_vida(){
        this.vida = 100;
    }

}

public class exercicio_6 {
    public static void main(String[] args) {
        System.out.println("Digite o nome do personagem: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();


        Personagem personagem = new Personagem(nome);

        System.out.println("===Resumo===");
        System.out.printf("Personagem %s%n", personagem.nome);
        System.out.println("Vida: " + personagem.vida);

        System.out.printf("Personagem " + personagem.nome + " sofrendo 50 dano.");
        personagem.sofrer_dano(50);
        System.out.println("Vida: " + personagem.vida);
        System.out.println("---------");
        System.out.println("Vida: " + personagem.nome + " morreu.");
        personagem.perder_vida();
        System.out.println("Vida: " + personagem.vida);
        System.out.println("---------");
        System.out.println("Vida: " + personagem.nome + " se curando em 25 de vida.");
        personagem.curar(25);
        System.out.println("Vida: " + personagem.vida);
        System.out.println("---------");
        System.out.println("Vida: " + personagem.nome + " se curou totalmente.");
        personagem.recuperar_vida();
        System.out.println("Vida: " + personagem.vida);
        System.out.println("---------");


        System.out.println("Digite o nome do 2º personagem: ");
        String nome1 = sc.nextLine();

        sc.close();

        Personagem personagem1 = new Personagem(nome1);

        System.out.println("===Resumo===");
        System.out.printf("Personagem %s%n", personagem1.nome);
        System.out.println("Vida: " + personagem1.vida);

        System.out.printf("Personagem " + personagem1.nome + " sofrendo 50 dano.");
        personagem1.sofrer_dano(50);
        System.out.println("Vida: " + personagem1.vida);
        System.out.println("---------");
        System.out.println("Vida: " + personagem1.nome + " morreu.");
        personagem1.perder_vida();
        System.out.println("Vida: " + personagem1.vida);
        System.out.println("---------");
        System.out.println("Vida: " + personagem1.nome + " se curando em 25 de vida.");
        personagem1.curar(25);
        System.out.println("Vida: " + personagem1.vida);
        System.out.println("---------");
        System.out.println("Vida: " + personagem1.nome + " se curou totalmente.");
        personagem1.recuperar_vida();
        System.out.println("Vida: " + personagem1.vida);
        System.out.println("---------");
    }
}
