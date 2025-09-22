class Pessoa {
    String nome;
    int idade;
}

class Aluno extends Pessoa {
    String matricula;
}

public class ExercicioHeranca01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 20;
        aluno1.matricula = "2023-001";

        System.out.println("Nome do Aluno: " + aluno1.nome);
        System.out.println("Idade do Aluno: " + aluno1.idade);
        System.out.println("Matrícula do Aluno: " + aluno1.matricula);
    }
}
