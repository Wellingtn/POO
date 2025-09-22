import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a hora: ");
        int hora = entrada.nextInt();
        System.out.print("Digite o minuto: ");
        int minuto = entrada.nextInt();
        System.out.print("Digite o segundo: ");
        int segundo = entrada.nextInt();
        
        segundo++;
        
        if(segundo == 60) {
            segundo = 0;
            minuto++;
            if(minuto == 60) {
                minuto = 0;
                hora++;
                if(hora == 24) {
                    hora = 0;
                }
            }
        }
        
        System.out.println("Próximo segundo: " + hora + ":" + minuto + ":" + segundo);
        
        entrada.close();
    }
}
