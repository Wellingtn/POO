public class ExercicioEncapsulamento03 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos");
        pessoa.setIdade(30);
        pessoa.setCpf("111.222.333-44");
        
        System.out.println("--- Dados Iniciais ---");
        pessoa.mostrarDados();
        
        // Tentando alterar o CPF
        pessoa.setCpf("999.888.777-66");
        
        // Alterando nome e idade
        pessoa.setNome("Carlos Alberto");
        pessoa.setIdade(31);
        
        System.out.println("\n--- Dados Finais ---");
        pessoa.mostrarDados();
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade deve ser maior que zero.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (this.cpf == null) {
            this.cpf = cpf;
        } else {
            System.out.println("O CPF não pode ser alterado.");
        }
    }
    
    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
    }
}
