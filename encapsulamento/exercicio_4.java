public class ExercicioEncapsulamento04 {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Notebook");
        p1.setPreco(3500.00);
        
        p1.adicionarEstoque(10);
        System.out.println("Estoque inicial: " + p1.getQuantidadeEstoque());
        
        p1.vender(3);
        System.out.println("Estoque após venda: " + p1.getQuantidadeEstoque());
        
        // Testando venda maior que estoque
        p1.vender(10);
        System.out.println("Estoque final: " + p1.getQuantidadeEstoque());
    }
}

class Produto {
    private String nome;
    private int quantidadeEstoque;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço deve ser maior que zero.");
        }
    }
    
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
        }
    }
    
    public void vender(int quantidade) {
        if (quantidade > 0 && this.quantidadeEstoque >= quantidade) {
            this.quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Venda não realizada. Estoque insuficiente.");
        }
    }
}
