package exercicios;

import java.util.Scanner;

class ContaCorrente {
    int numero;
    double saldo;
    double taxaDeSaque;

    ContaCorrente(int numero, double saldo, double taxaDeSaque) {
        this.numero = numero;
        this.saldo = saldo;
        this.taxaDeSaque = taxaDeSaque;
    }

    ContaCorrente() {
        this.numero = 0;
        this.saldo = 0;
        this.taxaDeSaque = 5.0;
    }
}

class ContaPoupanca {
    int numero;
    double saldo;

    ContaPoupanca(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    ContaPoupanca() {
        this.numero = 0;
        this.saldo = 0;
    }
}

public class exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cadastro de Conta Corrente ---");
        System.out.print("Digite o número da conta: ");
        int numCC = sc.nextInt();
        System.out.print("Digite o saldo inicial: R$ ");
        double saldoCC = sc.nextDouble();
        
        ContaCorrente cc = new ContaCorrente(numCC, saldoCC, 5.0);

        System.out.println("\n--- Cadastro de Conta Poupança ---");
        System.out.print("Digite o número da conta: ");
        int numCP = sc.nextInt();
        System.out.print("Digite o saldo inicial: R$ ");
        double saldoCP = sc.nextDouble();

        ContaPoupanca cp = new ContaPoupanca(numCP, saldoCP);

        System.out.println("\n\n=== Resumo das Contas ===");
        System.out.println("Tipo            | Número | Saldo     | Detalhe");
        System.out.printf("Conta Corrente  | %-6d | R$ %-7.2f | Taxa Saque: R$ %.2f%n", cc.numero, cc.saldo, cc.taxaDeSaque);
        System.out.printf("Conta Poupança  | %-6d | R$ %-7.2f | Permite Juros%n", cp.numero, cp.saldo);

        sc.close();
    }
}

