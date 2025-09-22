public class ExercicioEncapsulamento01 {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setMarca("Ford");
        meuCarro.setModelo("Ka");
        meuCarro.setAno(2020);
        meuCarro.setPreco(45000.00);

        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Preço: R$ " + meuCarro.getPreco());

        // Testando a validação
        meuCarro.setPreco(-500);
        System.out.println("Novo Preço (após tentativa de valor negativo): R$ " + meuCarro.getPreco());
    }
}

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }
}
