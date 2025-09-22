class Veiculo {
    String marca;
    String modelo;
    int ano;
}

class Carro extends Veiculo {
    int numPortas;
}

public class ExercicioHeranca02 {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Fiat";
        meuCarro.modelo = "Uno";
        meuCarro.ano = 2010;
        meuCarro.numPortas = 4;

        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);
        System.out.println("Número de Portas: " + meuCarro.numPortas);
    }
}
