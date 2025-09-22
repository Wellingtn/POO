import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite a nota 2: ");
        double n2 = entrada.nextDouble();
        System.out.print("Digite a nota 3: ");
        double n3 = entrada.nextDouble();
        System.out.print("Digite a nota 4: ");
        double n4 = entrada.nextDouble();

        double menorNota = n1;
        if (n2 < menorNota) {
            menorNota = n2;
        }
        if (n3 < menorNota) {
            menorNota = n3;
        }
        if (n4 < menorNota) {
            menorNota = n4;
        }

        double soma = n1 + n2 + n3 + n4;
        double media = (soma - menorNota) / 3.0;

        System.out.println("A média das três maiores notas é: " + media);
        entrada.close();
    }
}
