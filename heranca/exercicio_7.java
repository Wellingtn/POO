class SerVivo {
    String nomeCientifico;
    int idade;
}

class Animal extends SerVivo {
    String habitat;
}

class Mamifero extends Animal {
    String alimentacao;
}

public class ExercicioHeranca07 {
    public static void main(String[] args) {
        Mamifero leao = new Mamifero();
        leao.nomeCientifico = "Panthera leo";
        leao.idade = 5;
        leao.habitat = "Savana";
        leao.alimentacao = "Carnívoro";

        System.out.println("Nome Científico: " + leao.nomeCientifico);
        System.out.println("Habitat: " + leao.habitat);
        System.out.println("Alimentação: " + leao.alimentacao);
    }
}
