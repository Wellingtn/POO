class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }
}

public class ExercicioHeranca03 {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex");
        System.out.println("Nome do cachorro: " + meuCachorro.nome);
    }
}
