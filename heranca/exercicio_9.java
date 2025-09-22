class Documento {
    String titulo;
    String conteudo;
}

class Artigo extends Documento {
    String autor;
}

public class ExercicioHeranca09 {
    public static void main(String[] args) {
        Artigo meuArtigo = new Artigo();
        meuArtigo.titulo = "Herança em Java";
        meuArtigo.conteudo = "Este é um artigo sobre POO...";
        meuArtigo.autor = "José da Silva";

        System.out.println("Título: " + meuArtigo.titulo);
        System.out.println("Autor: " + meuArtigo.autor);
    }
}
