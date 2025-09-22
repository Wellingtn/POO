import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = entrada.nextInt();
            if (numero > 0 && numero % 2 != 0) {
                contador++;
            }
        }

        double percentual = (double) contador / 6.0 * 100.0;

        System.out.println(percentual + "% dos números são positivos ímpares.");
        entrada.close();
    }
}
