import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o coeficiente a: ");
        double a = entrada.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = entrada.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        double c = entrada.nextDouble();
        
        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else {
            double delta = (b * b) - (4 * a * c);
            
            if (delta < 0) {
                System.out.println("As raízes desta equação não pertencem aos números reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Somente uma raiz.");
                System.out.println("Raiz: " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Duas raízes encontradas.");
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }
        entrada.close();
    }
}
