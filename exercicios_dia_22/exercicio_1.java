package exercicios;

import java.util.Scanner;

class Cachorros {
    String nome;
    String raca;
    int idade;

    // Construtor
    Cachorros(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Construtor vazio
    Cachorros() {
        this.nome = "";
        this.raca = "";
        this.idade = 0;
    }
}

public class exercicio_1 {
    public static void main(String[] args) {
        System.out.println("==== AMF PetShop ====");
        Scanner sc = new Scanner(System.in);

        // 1º cachorro
        System.out.println("Digite o nome do 1º cachorro");
        String nome = sc.nextLine();
        System.out.println("Digite a raça do 1º cachorro");
        String raca = sc.nextLine();
        System.out.println("Digite a idade do 1º cachorro");
        int idade = sc.nextInt();
        sc.nextLine();

        Cachorros pet1 = new Cachorros(nome, raca, idade);

        // 2º cachorro
        System.out.println("Digite o nome do 2º cachorro");
        String nome1 = sc.nextLine();
        System.out.println("Digite a raça do 2º cachorro");
        String raca1 = sc.nextLine();
        System.out.println("Digite a idade do 2º cachorro");
        int idade1 = sc.nextInt();

        Cachorros pet2 = new Cachorros(nome1, raca1, idade1);

        System.out.println("\n=== Resumo ===");
        System.out.println("             nome   raça    idade");
        System.out.println("1º cachorro: " + pet1.nome + " | " + pet1.raca + " | " + pet1.idade);
        System.out.println("2º cachorro: " + pet2.nome + " | " + pet2.raca + " | " + pet2.idade);

        sc.close();
    }
}
