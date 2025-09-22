import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o peso (kg): ");
        double peso = entrada.nextDouble();
        System.out.print("Digite a altura (m): ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Normal";
        } else if (imc < 30) {
            classificacao = "Pré-obeso";
        } else if (imc < 35) {
            classificacao = "Obeso classe I";
        } else if (imc < 40) {
            classificacao = "Obeso classe II";
        } else {
            classificacao = "Obeso classe III";
        }

        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + classificacao);
        entrada.close();
    }
}
