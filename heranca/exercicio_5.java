class Produto {
    String nome;
    double preco;

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}

class Eletronico extends Produto {
    int garantia;
    
    public void exibirDadosCompletos() {
        super.exibirDados();
        System.out.println("Garantia: " + garantia + " meses");
    }
}

public class ExercicioHeranca05 {
    public static void main(String[] args) {
        Eletronico tv = new Eletronico();
        tv.nome = "Smart TV 50 polegadas";
        tv.preco = 2500.00;
        tv.garantia = 12;

        tv.exibirDadosCompletos();
    }
}
