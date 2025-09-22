import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Valor monetário: ");
        double valor = entrada.nextDouble();
        System.out.print("Código da moeda original (51=R$, 52=US$, 53=€): ");
        int codOrigem = entrada.nextInt();
        System.out.print("Código da moeda para conversão (51=R$, 52=US$, 53=€): ");
        int codDestino = entrada.nextInt();

        double valorEmReais = 0;
        
        if (codOrigem == 51) valorEmReais = valor;
        if (codOrigem == 52) valorEmReais = valor * 2.36;
        if (codOrigem == 53) valorEmReais = valor * 3.02;

        double valorConvertido = 0;

        if (codDestino == 51) valorConvertido = valorEmReais;
        if (codDestino == 52) valorConvertido = valorEmReais / 2.36;
        if (codDestino == 53) valorConvertido = valorEmReais / 3.02;

        System.out.println("Valor convertido: " + valorConvertido);
        entrada.close();
    }
}
