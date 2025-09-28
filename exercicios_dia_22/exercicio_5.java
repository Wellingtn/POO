package exercicios;

import java.util.Scanner;

class Conta{
    String numero;
    double saldo;

    //construtor
    Conta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    //Construtor vazio
    Conta(){
        this.numero = "";
        this.saldo = 0;
    }

    void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void depositar(double valor){
            if (valor > 0) {
                saldo += valor;
            } else {
                System.out.println("Valor inválido");
            }
        }
}

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da 1ª conta:");
        String conta1 = sc.nextLine();
        System.out.println("Digite o saldo inicial da 1ª conta: ");
        double saldo1 = sc.nextDouble();
        Conta cont1 = new Conta(conta1, saldo1);
        sc.nextLine();

        System.out.println("Digite o número da 2ª conta:");
        String conta2 = sc.nextLine();
        System.out.println("Digite o saldo inicial da 2ª conta: ");
        double saldo2 = sc.nextDouble();

        Conta cont2 = new Conta(conta2, saldo2);
        sc.close();

        //Operações Bancárias
        System.out.println("Depositando 50 reais na conta 1");
        cont1.depositar(50);
        System.out.printf("Saldo da conta %s: %.2f%n", cont1.numero, cont1.saldo);
        System.out.println("sacando 20 reais na conta 2");
        cont1.sacar(25);
        System.out.printf("Saldo da conta %s: %.2f%n", cont1.numero, cont1.saldo);

        System.out.println("Depositando 50 reais na conta 2");
        cont2.depositar(50);
        System.out.printf("Saldo da conta %s: %.2f%n", cont2.numero, cont2.saldo);
        System.out.println("sacando 20 reais na conta 2");
        cont2.sacar(25);
        System.out.printf("Saldo da conta %s: %.2f%n", cont2.numero, cont2.saldo);
    }
}
