class Funcionario {
    protected double salario;
}

class Gerente extends Funcionario {
    public Gerente(double salario) {
        this.salario = salario;
    }
}

public class ExercicioHeranca04 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(5000.00);
        System.out.println("Salário do Gerente: " + gerente.salario);
    }
}
