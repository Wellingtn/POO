import java.util.Scanner;

public class Exercicio26a {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o ano: ");
        int ano = entrada.nextInt();

        if (ano % 4 == 0) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
        entrada.close();
    }
}
