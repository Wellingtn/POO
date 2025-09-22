class Veiculo {
    int capacidadeTanque;
}

class Carro extends Veiculo {
    public void exibirCapacidadeTanque() {
        System.out.println("Capacidade do Tanque: " + capacidadeTanque + " litros");
    }
}

public class ExercicioHeranca08 {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.capacidadeTanque = 50;
        meuCarro.exibirCapacidadeTanque();
    }
}
