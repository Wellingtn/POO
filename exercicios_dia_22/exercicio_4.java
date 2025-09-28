package exercicios;

import java.util.Scanner;

class Aluno{
    String nome;
    double nota1;
    double nota2;
    double media;
    String situacao;

    Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = (nota1 + nota2) / 2;
        if (media >= 7) {
            this.situacao = "Aprovado";
        } else {
            this.situacao = "Reprovado";
        }
    }

    Aluno(){
        this.nome = "";
        this.nota1 = 0;
        this.nota2 = 0;
        this.media = 0;
        this.situacao = "Reprovado";
    }
}

public class exercicio_4 {
    public static void main(String[] args) {

        //1º Produto
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do 1º aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a 1ª nota do 1º aluno: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a 2ª nota do 1º aluno: ");
        double nota2 = sc.nextDouble();
        sc.nextLine();

        Aluno aluno1 = new Aluno(nome, nota1, nota2);

        //2º Produto
        System.out.println("Digite o nome do 2º aluno: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite o preço unitário do 2º aluno: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a quantidade do 2º aluno: ");
        double nota4 = sc.nextDouble();
        sc.nextLine();

        Aluno aluno2 = new Aluno(nome1, nota3, nota4);

        System.out.println("=== Resumo ===");
        System.out.println("             Nome   1ª Nota   2ª Nota   Média    Situação");
        System.out.println("1º Produto: " + aluno1.nome + " | " + aluno1.nota1 + " | " + aluno1.nota2 + " | " + aluno1.media + " | " + aluno1.situacao);
        System.out.println("2º Produto: " + aluno2.nome + " | " + aluno2.nota1 + " | " + aluno2.nota2 + " | " + aluno2.media + " | " + aluno2.situacao);

    }
}
