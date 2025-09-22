import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código do item: ");
        int codigo = entrada.nextInt();
        System.out.print("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        String descricao = "";
        double valorUnitario = 0;

        switch (codigo) {
            case 100:
                descricao = "Café expresso pequeno";
                valorUnitario = 2.00;
                break;
            case 101:
                descricao = "Café expresso grande";
                valorUnitario = 3.00;
                break;
            case 102:
                descricao = "Café com leite pequeno";
                valorUnitario = 2.50;
                break;
            case 103:
                descricao = "Café com leite grande";
                valorUnitario = 3.50;
                break;
            case 104:
                descricao = "Água sem gás (200ml)";
                valorUnitario = 1.50;
                break;
            case 105:
                descricao = "Água com gás (500ml)";
                valorUnitario = 2.40;
                break;
            default:
                System.out.println("Código inválido.");
                break;
        }

        if (valorUnitario > 0) {
            double total = quantidade * valorUnitario;
            System.out.println("Produto: " + descricao);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Valor unitário: R$ " + valorUnitario);
            System.out.println("Total a pagar: R$ " + total);
        }
        
        entrada.close();
    }
}
