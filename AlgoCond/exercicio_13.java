import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        
        if (numero < 10000) {
            System.out.println("O número possui menos de 5 dígitos significativos.");
        } else if (numero > 99999) {
            System.out.println("O número possui mais de 5 dígitos significativos.");
        } else {
            int d1 = numero / 10000;
            int d5 = numero % 10;
            
            int d2 = (numero / 1000) % 10;
            int d4 = (numero / 10) % 10;

            if (d1 == d5 && d2 == d4) {
                System.out.println("É palíndromo.");
            } else {
                System.out.println("Não é palíndromo.");
            }
        }
        entrada.close();
    }
}
