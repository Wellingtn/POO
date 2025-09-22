class Pessoa {
    String nome;
    int idade;
}

class Professor extends Pessoa {
    String disciplina;
}

class Aluno extends Pessoa {
    String matricula;
}

public class ExercicioHeranca06 {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Maria";
        prof.idade = 45;
        prof.disciplina = "Matemática";

        Aluno aluno = new Aluno();
        aluno.nome = "Carlos";
        aluno.idade = 19;
        aluno.matricula = "2023-002";

        System.out.println("Professor: " + prof.nome + ", Disciplina: " + prof.disciplina);
        System.out.println("Aluno: " + aluno.nome + ", Matrícula: " + aluno.matricula);
    }
}
