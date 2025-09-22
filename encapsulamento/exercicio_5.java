public class ExercicioEncapsulamento05 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Roberto", 3000.00, "Analista Jr");
        System.out.println("--- Dados Iniciais ---");
        func.exibirDados();

        func.aumentarSalario(10); // Aumento de 10% (permitido)
        System.out.println("\n--- Após aumento de salário ---");
        func.exibirDados();
        
        func.aumentarSalario(30); // Aumento de 30% (não permitido)
        System.out.println("\n--- Após tentativa de aumento inválido ---");
        func.exibirDados();

        func.promover("Analista Pleno");
        System.out.println("\n--- Após promoção ---");
        func.exibirDados();
    }
}

class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0 && percentual <= 20) {
            double aumento = this.salario * (percentual / 100.0);
            this.salario += aumento;
        } else {
            System.out.println("Aumento não permitido. O percentual deve ser entre 0 e 20.");
        }
    }

    public void promover(String novoCargo) {
        // Validação simples: um "Jr" só pode virar "Pleno"
        if (this.cargo.contains("Jr") && novoCargo.contains("Pleno")) {
            this.cargo = novoCargo;
        } else {
            System.out.println("Promoção para o cargo '" + novoCargo + "' não é válida.");
        }
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: R$ " + this.salario);
        System.out.println("Cargo: " + this.cargo);
    }
}
