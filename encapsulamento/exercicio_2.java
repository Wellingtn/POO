public class ExercicioEncapsulamento02 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Ana Souza");
        conta.setNumeroConta("12345-6");
        
        conta.depositar(1000.00);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        conta.sacar(300.00);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());
        
        // Testando saque maior que o saldo
        conta.sacar(800.00);
        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}

class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("O saldo não pode ser negativo.");
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente.");
        }
    }
}
