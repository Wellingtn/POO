import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Números em ordem crescente:");
        if (num1 < num2) {
            System.out.println(num1 + ", " + num2);
        } else {
            System.out.println(num2 + ", " + num1);
        }
        entrada.close();
    }
}
