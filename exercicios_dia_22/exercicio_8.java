package exercicios;

import java.util.Scanner;

class Gerente {
    String nome;
    double salarioBase;
    String setor;

    Gerente(String nome, double salarioBase, String setor) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.setor = setor;
    }

    Gerente() {
        this.nome = "";
        this.salarioBase = 0;
        this.setor = "";
    }
}

class Vendedor {
    String nome;
    double salarioBase;
    double comissao;

    Vendedor(String nome, double salarioBase, double comissao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    Vendedor() {
        this.nome = "";
        this.salarioBase = 0;
        this.comissao = 0;
    }
}

public class exercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cadastro de Gerente ---");
        System.out.print("Digite o nome do gerente: ");
        String nomeGerente = sc.nextLine();
        System.out.print("Digite o salário base: R$ ");
        double salarioGerente = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Digite o setor: ");
        String setorGerente = sc.nextLine();
        
        Gerente gerente = new Gerente(nomeGerente, salarioGerente, setorGerente);

        System.out.println("\n--- Cadastro de Vendedor ---");
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = sc.nextLine();
        System.out.print("Digite o salário base: R$ ");
        double salarioVendedor = sc.nextDouble();
        System.out.print("Digite a comissão (%): ");
        double comissaoVendedor = sc.nextDouble();
        
        Vendedor vendedor = new Vendedor(nomeVendedor, salarioVendedor, comissaoVendedor);

        System.out.println("\n\n=== Resumo dos Cadastros ===");
        System.out.println("Funcionário | Nome      | Salário Base | Detalhe");
        System.out.printf("Gerente     | %-9s | R$ %-10.2f | Setor: %s%n", gerente.nome, gerente.salarioBase, gerente.setor);
        System.out.printf("Vendedor    | %-9s | R$ %-10.2f | Comissão: %.1f%%%n", vendedor.nome, vendedor.salarioBase, vendedor.comissao);

        sc.close();
    }
}

