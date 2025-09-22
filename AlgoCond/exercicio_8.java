import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("O número é negativo.");
        } else if (numero == 0) {
            System.out.println("O número é zero.");
        } else {
            System.out.print("O número é positivo");
            if (numero % 2 == 0) {
                System.out.println(" e par.");
            } else {
                System.out.println(" e ímpar.");
            }
        }
        entrada.close();
    }
}
