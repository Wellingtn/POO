import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro entre 1 e 399: ");
        int numero = entrada.nextInt();
        String romano = "";

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;

        if (centenas == 3) romano += "CCC";
        if (centenas == 2) romano += "CC";
        if (centenas == 1) romano += "C";
        
        if (dezenas == 9) romano += "XC";
        else if (dezenas >= 5) {
            romano += "L";
            if(dezenas == 6) romano += "X";
            if(dezenas == 7) romano += "XX";
            if(dezenas == 8) romano += "XXX";
        } else if (dezenas == 4) romano += "XL";
        else {
            if(dezenas == 1) romano += "X";
            if(dezenas == 2) romano += "XX";
            if(dezenas == 3) romano += "XXX";
        }

        if (unidades == 9) romano += "IX";
        else if (unidades >= 5) {
            romano += "V";
            if(unidades == 6) romano += "I";
            if(unidades == 7) romano += "II";
            if(unidades == 8) romano += "III";
        } else if (unidades == 4) romano += "IV";
        else {
            if(unidades == 1) romano += "I";
            if(unidades == 2) romano += "II";
            if(unidades == 3) romano += "III";
        }
        
        System.out.println("Em algarismos romanos: " + romano);
        entrada.close();
    }
}
