import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira data (dia mes ano):");
        int d1 = entrada.nextInt();
        int m1 = entrada.nextInt();
        int y1 = entrada.nextInt();

        System.out.println("Digite a segunda data (dia mes ano):");
        int d2 = entrada.nextInt();
        int m2 = entrada.nextInt();
        int y2 = entrada.nextInt();

        boolean data1Primeiro = false;

        if (y1 < y2) {
            data1Primeiro = true;
        } else if (y1 == y2) {
            if (m1 < m2) {
                data1Primeiro = true;
            } else if (m1 == m2) {
                if (d1 < d2) {
                    data1Primeiro = true;
                }
            }
        }
        
        System.out.println("Datas em ordem crescente:");
        if (data1Primeiro) {
            System.out.println(d1 + "/" + m1 + "/" + y1);
            System.out.println(d2 + "/" + m2 + "/" + y2);
        } else {
            System.out.println(d2 + "/" + m2 + "/" + y2);
            System.out.println(d1 + "/" + m1 + "/" + y1);
        }
        entrada.close();
    }
}
