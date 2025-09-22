import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a nota final: ");
        double notaFinal = entrada.nextDouble();

        if (notaFinal >= 6) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }
        
        entrada.close();
    }
}
