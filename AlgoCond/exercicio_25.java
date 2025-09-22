import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a data de nascimento (dia mes ano):");
        int diaNasc = entrada.nextInt();
        int mesNasc = entrada.nextInt();
        int anoNasc = entrada.nextInt();

        System.out.println("Digite a data atual (dia mes ano):");
        int diaAtual = entrada.nextInt();
        int mesAtual = entrada.nextInt();
        int anoAtual = entrada.nextInt();
        
        int idade = anoAtual - anoNasc;
        
        if (mesAtual < mesNasc || (mesAtual == mesNasc && diaAtual < diaNasc)) {
            idade--;
        }
        
        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
        
        entrada.close();
    }
}
