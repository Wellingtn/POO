import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Lado a: ");
        double a = entrada.nextDouble();
        System.out.print("Lado b: ");
        double b = entrada.nextDouble();
        System.out.print("Lado c: ");
        double c = entrada.nextDouble();
        
        double maior, menor1, menor2;
        
        if (a >= b && a >= c) {
            maior = a; menor1 = b; menor2 = c;
        } else if (b >= a && b >= c) {
            maior = b; menor1 = a; menor2 = c;
        } else {
            maior = c; menor1 = a; menor2 = b;
        }
        
        if (menor1 + menor2 <= maior) {
            System.out.println("Não é triângulo");
        } else {
            String tipoAngulo = "";
            if (maior*maior == menor1*menor1 + menor2*menor2) {
                tipoAngulo = "retângulo";
            } else if (maior*maior > menor1*menor1 + menor2*menor2) {
                tipoAngulo = "obtusângulo";
            } else {
                tipoAngulo = "acutângulo";
            }
            
            String tipoLado = "";
            if (a == b && b == c) {
                tipoLado = "equilátero";
            } else if (a == b || b == c || a == c) {
                tipoLado = "isósceles";
            } else {
                tipoLado = "escaleno";
            }
            
            System.out.println("triângulo " + tipoAngulo + " " + tipoLado);
        }
        entrada.close();
    }
}
