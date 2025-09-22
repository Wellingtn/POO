import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = entrada.nextInt();
        System.out.print("Digite o mês: ");
        int mes = entrada.nextInt();
        System.out.print("Digite o ano: ");
        int ano = entrada.nextInt();

        boolean dataValida = true;
        int diasNoMes;

        if (mes < 1 || mes > 12 || ano <= 0) {
            dataValida = false;
        } else {
            if (mes == 2) {
                boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                diasNoMes = bissexto ? 29 : 28;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasNoMes = 30;
            } else {
                diasNoMes = 31;
            }

            if (dia < 1 || dia > diasNoMes) {
                dataValida = false;
            }
        }

        if (dataValida) {
            System.out.println("Data válida.");
            
            int diaAnterior = dia - 1;
            int mesAnterior = mes;
            int anoAnterior = ano;

            if (diaAnterior == 0) {
                mesAnterior--;
                if (mesAnterior == 0) {
                    mesAnterior = 12;
                    anoAnterior--;
                }
                
                if (mesAnterior == 2) {
                    boolean bissextoAnterior = (anoAnterior % 4 == 0 && anoAnterior % 100 != 0) || (anoAnterior % 400 == 0);
                    diaAnterior = bissextoAnterior ? 29 : 28;
                } else if (mesAnterior == 4 || mesAnterior == 6 || mesAnterior == 9 || mesAnterior == 11) {
                    diaAnterior = 30;
                } else {
                    diaAnterior = 31;
                }
            }
            System.out.println("Dia anterior: " + diaAnterior + "/" + mesAnterior + "/" + anoAnterior);
        } else {
            System.out.println("Data inválida.");
        }
        entrada.close();
    }
}
