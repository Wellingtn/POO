import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Número do Bilhete do Cliente: ");
        int bilheteCliente = entrada.nextInt();
        System.out.print("Número do Bilhete Premiado: ");
        int bilhetePremiado = entrada.nextInt();
        
        int ultimos2Cliente = bilheteCliente % 100;
        
        boolean ganhou = false;
        
        int tempPremiado = bilhetePremiado;
        
        int par1 = tempPremiado % 100;
        tempPremiado /= 10;
        int par2 = tempPremiado % 100;
        tempPremiado /= 10;
        int par3 = tempPremiado % 100;
        tempPremiado /= 10;
        int par4 = tempPremiado % 100;

        if(ultimos2Cliente == par1 || ultimos2Cliente == par2 || ultimos2Cliente == par3 || ultimos2Cliente == par4) {
            ganhou = true;
        }
        
        if(ganhou) {
            System.out.println("Ganhou bilhete grátis");
        } else {
            System.out.println("Tente Novamente");
        }
        
        entrada.close();
    }
}
