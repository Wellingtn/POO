import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite x1 (canto inferior esquerdo): ");
        double x1 = entrada.nextDouble();
        System.out.print("Digite y1 (canto inferior esquerdo): ");
        double y1 = entrada.nextDouble();
        
        System.out.print("Digite x2 (canto superior direito): ");
        double x2 = entrada.nextDouble();
        System.out.print("Digite y2 (canto superior direito): ");
        double y2 = entrada.nextDouble();
        
        System.out.print("Digite x3 (ponto a verificar): ");
        double x3 = entrada.nextDouble();
        System.out.print("Digite y3 (ponto a verificar): ");
        double y3 = entrada.nextDouble();

        boolean naBordaX = (x3 == x1 || x3 == x2) && (y3 >= y1 && y3 <= y2);
        boolean naBordaY = (y3 == y1 || y3 == y2) && (x3 >= x1 && x3 <= x2);

        if (naBordaX || naBordaY) {
            System.out.println("O ponto está na borda do retângulo.");
        } else if (x3 > x1 && x3 < x2 && y3 > y1 && y3 < y2) {
            System.out.println("O ponto está dentro do retângulo.");
        } else {
            System.out.println("O ponto está fora do retângulo.");
        }
        
        entrada.close();
    }
}
