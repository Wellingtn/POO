package exercicios;

import java.util.Scanner;

class Carro {
    String marca;
    String modelo;
    int ano;

    //Construtor
    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //Construtor vazio
    Carro() {
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
    }
}

public class exercicio_2 {
    public static void main(String[] args) {
        System.out.println("==== AMF LavaRápido ====");
        Scanner sc = new Scanner(System.in);

        //1º Carro
        System.out.println("Digite a marca do 1º carro: ");
        String marca = sc.nextLine();
        System.out.println("Digite o modelo do 1º carro: ");
        String modelo = sc.nextLine();
        System.out.println("Digite o ano do 1º carro: ");
        int ano = sc.nextInt();
        sc.nextLine();

        Carro carro1 = new Carro(marca, modelo, ano);

        //2º Carro
        System.out.println("Digite a marca do 2º carro: ");
        String marca1 = sc.nextLine();
        System.out.println("Digite o modelo do 2º carro: ");
        String modelo1 = sc.nextLine();
        System.out.println("Digite o ano do 2º carro: ");
        int ano1 = sc.nextInt();

        Carro carro2 = new Carro(marca1, modelo1, ano1);

        System.out.println("\n=== Resumo ===");
        System.out.println("             marca   modelo    ano");
        System.out.println("1º carro: " + carro1.marca + " | " + carro1.modelo + " | " + carro1.ano);
        System.out.println("2º carro: " + carro2.marca + " | " + carro2.modelo + " | " + carro2.ano);

        sc.close();
    }
}
