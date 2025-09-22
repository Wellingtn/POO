import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c;

        System.out.print("Digite o primeiro valor: ");
        a = entrada.nextDouble();
        System.out.print("Digite o segundo valor: ");
        b = entrada.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        c = entrada.nextDouble();

        System.out.println("Valores em ordem crescente:");

        if (a <= b && a <= c) {
            System.out.print(a);
            if (b <= c) {
                System.out.println(", " + b + ", " + c);
            } else {
                System.out.println(", " + c + ", " + b);
            }
        } else if (b <= a && b <= c) {
            System.out.print(b);
            if (a <= c) {
                System.out.println(", " + a + ", " + c);
            } else {
                System.out.println(", " + c + ", " + a);
            }
        } else {
            System.out.print(c);
            if (a <= b) {
                System.out.println(", " + a + ", " + b);
            } else {
                System.out.println(", " + b + ", " + a);
            }
        }
        entrada.close();
    }
}
