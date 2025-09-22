import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int hora = entrada.nextInt();
        System.out.print("Digite o minuto: ");
        int minuto = entrada.nextInt();
        System.out.print("Digite o segundo: ");
        int segundo = entrada.nextInt();

        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
            System.out.println("Horário válido.");
        } else {
            System.out.println("Horário inválido.");
        }
        entrada.close();
    }
}
