import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número de 5 dígitos: ");
        int numero = entrada.nextInt();
        int numeroOriginal = numero;

        int impares = 0;
        int somaPares = 0;

        int digito5 = numero % 10;
        numero = numero / 10;
        int digito4 = numero % 10;
        numero = numero / 10;
        int digito3 = numero % 10;
        numero = numero / 10;
        int digito2 = numero % 10;
        numero = numero / 10;
        int digito1 = numero % 10;

        if (digito1 % 2 != 0) impares++; else somaPares += digito1;
        if (digito2 % 2 != 0) impares++; else somaPares += digito2;
        if (digito3 % 2 != 0) impares++; else somaPares += digito3;
        if (digito4 % 2 != 0) impares++; else somaPares += digito4;
        if (digito5 % 2 != 0) impares++; else somaPares += digito5;
        
        System.out.println("No número " + numeroOriginal + ":");
        System.out.println("Quantidade de algarismos ímpares: " + impares);
        System.out.println("Soma dos algarismos pares: " + somaPares);

        entrada.close();
    }
}
