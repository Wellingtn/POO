import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();
        System.out.print("Digite a quantidade de faltas: ");
        int faltas = entrada.nextInt();

        int conceito;

        if (faltas > 5) {
            conceito = 0;
        } else {
            double media = (nota1 + nota2 + nota3) / 3.0;
            if (media < 6) {
                conceito = 0;
            } else if (media < 7) {
                conceito = 1;
            } else if (media < 8) {
                conceito = 2;
            } else if (media < 9) {
                conceito = 3;
            } else {
                conceito = 4;
            }
        }
        
        System.out.println("Conceito: " + conceito);
        entrada.close();
    }
}
