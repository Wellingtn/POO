import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos envelopes possui? ");
        int envelopes = entrada.nextInt();
        System.out.print("Quantos selos possui? ");
        int selos = entrada.nextInt();
        System.out.print("Quanto dinheiro possui (R$)? ");
        double dinheiro = entrada.nextDouble();

        double custoCarta = 0.05 + 0.12;
        int cartasPorDinheiro = (int) (dinheiro / custoCarta);

        int maxCartas = envelopes;
        if (selos < maxCartas) {
            maxCartas = selos;
        }
        if (cartasPorDinheiro < maxCartas) {
            maxCartas = cartasPorDinheiro;
        }

        int envelopesSobra = envelopes - maxCartas;
        int selosSobra = selos - maxCartas;
        
        System.out.println("Quantidade máxima de cartas a enviar: " + maxCartas);
        System.out.println("Sobrarão " + envelopesSobra + " envelopes.");
        System.out.println("Sobrarão " + selosSobra + " selos.");

        entrada.close();
    }
}
