package exercicios;

import java.util.Scanner;

class Produtos{
    String nome;
    double preco;
    int quantidade;

    Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    Produtos(){
        this.nome = "";
        this.preco = 0;
        this.quantidade = 0;
    }
}

public class exercicio_3 {
    public static void main(String[] args) {

        //1º Produto
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do 1º produto");
        String nome = sc.nextLine();
        System.out.println("Digite o preço unitário do 1º produto");
        double preco = sc.nextDouble();
        System.out.println("Digite a quantidade do 1º produto");
        int quantidade = sc.nextInt();
        sc.nextLine();

        Produtos prod1 = new Produtos(nome, preco, quantidade);

        //2º Produto
        System.out.println("Digite o nome do 2º produto");
        String nome1 = sc.nextLine();
        System.out.println("Digite o preço unitário do 2º produto");
        double preco1 = sc.nextDouble();
        System.out.println("Digite a quantidade do 2º produto");
        int quantidade1 = sc.nextInt();
        sc.nextLine();

        Produtos prod2 = new Produtos(nome1, preco1, quantidade1);

        System.out.println("=== Resumo ===");
        System.out.println("             Produto   Preço    Quantidade");
        System.out.println("1º Produto: " + prod1.nome + " | " + prod1.preco + " | " + prod1.quantidade);
        System.out.println("2º Produto: " + prod2.nome + " | " + prod2.preco + " | " + prod2.quantidade);

    }
}
