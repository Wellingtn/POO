import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();
        System.out.print("Valor por hora: ");
        double valorHora = entrada.nextDouble();
        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        System.out.print("Tempo de serviço (anos): ");
        int tempoServico = entrada.nextInt();

        double salarioBruto = horasTrabalhadas * valorHora;
        
        int numTrienios = tempoServico / 3;
        double adicionalTrienio = salarioBruto * (numTrienios * 0.02);

        double adicionalIdade = 0;
        if (idade >= 40) {
            adicionalIdade = salarioBruto * 0.015;
        }

        double baseCalculo = salarioBruto + adicionalTrienio + adicionalIdade;
        double inss = baseCalculo * 0.085;
        inss = Math.floor(inss * 100) / 100;
        
        double baseIR = baseCalculo - inss;
        double impostoRenda = 0;

        if (baseIR > 1434.00 && baseIR <= 2150.00) {
            impostoRenda = (baseIR * 0.075) - 107.55;
        } else if (baseIR > 2150.00 && baseIR <= 2866.00) {
            impostoRenda = (baseIR * 0.15) - 268.80;
        } else if (baseIR > 2866.00 && baseIR <= 3582.00) {
            impostoRenda = (baseIR * 0.225) - 483.75;
        } else if (baseIR > 3582.00) {
            impostoRenda = (baseIR * 0.275) - 662.85;
        }
        
        impostoRenda = Math.floor(impostoRenda * 100) / 100;

        double salarioLiquido = baseCalculo - inss - impostoRenda;

        System.out.println("Salário líquido: " + salarioLiquido);
        entrada.close();
    }
}
