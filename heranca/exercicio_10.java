class Equipamento {
    public void ligar() {
        System.out.println("Equipamento ligado.");
    }
}

class Computador extends Equipamento {
    // Nenhuma sobrescrita ou método novo
}

public class ExercicioHeranca10 {
    public static void main(String[] args) {
        Computador meuPC = new Computador();
        meuPC.ligar();
    }
}
