import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = entrada.nextInt();
        System.out.print("Hora final: ");
        int horaFinal = entrada.nextInt();

        int horasNormais = 0;
        int horasNoturnas = 0;
        int horaAtual = horaInicial;

        while (horaAtual != horaFinal) {
            boolean ehNoturna = (horaAtual >= 20 && horaAtual <= 23) || (horaAtual >= 0 && horaAtual < 8);
            if (ehNoturna) {
                horasNoturnas++;
            } else {
                horasNormais++;
            }
            horaAtual = (horaAtual + 1) % 24;
        }

        double valorNormal = horasNormais * 10.00;
        double valorNoturno = horasNoturnas * 10.00 * 1.20;
        double valorTotal = valorNormal + valorNoturno;

        System.out.println("Horas (normais): " + horasNormais);
        System.out.println("Horas (noturnas): " + horasNoturnas);
        System.out.println("Valor a receber: " + valorTotal);

        entrada.close();
    }
}
