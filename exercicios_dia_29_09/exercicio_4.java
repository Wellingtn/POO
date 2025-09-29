package exercicio_dia_29;

class Obra {
    String titulo;
    String autor;
    int ano_publicacao;

    // Construtor vazio
    Obra() {
        this.titulo = "";
        this.autor = "";
        this.ano_publicacao = 0;
    }

    // Construtor
    Obra(String titulo, String autor, int ano_publicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
    }
}

class Livro extends Obra {
    int numero_paginas;
    String genero_literario;

    // Construtor vazio
    Livro() {
        super();
        this.numero_paginas = 0;
        this.genero_literario = "";
    }

    // Construtor
    Livro(String titulo, String autor, int ano_publicacao, int numero_paginas, String genero_literario) {
        super(titulo, autor, ano_publicacao);
        this.numero_paginas = numero_paginas;
        this.genero_literario = genero_literario;
    }
}

class Revista extends Obra {
    int edicao;
    String area;

    // Construtor vazio
    Revista() {
        super();
        this.edicao = 0;
        this.area = "";
    }

    // Construtor
    Revista(String titulo, String autor, int ano_publicacao, int edicao, String area) {
        super(titulo, autor, ano_publicacao);
        this.edicao = edicao;
        this.area = area;
    }
}

class Artigo_Cientifico extends Obra {
    String jornal_publicado;
    String DOI;

    // Construtor vazio
    Artigo_Cientifico() {
        super();
        this.jornal_publicado = "";
        this.DOI = "";
    }

    // Construtor
    Artigo_Cientifico(String titulo, String autor, int ano_publicacao, String jornal_publicado, String DOI) {
        super(titulo, autor, ano_publicacao);
        this.jornal_publicado = jornal_publicado;
        this.DOI = DOI;
    }
}

class Usuario {
    String nome;
    String matricula;
    String curso;

    // Construtor vazio
    Usuario() {
        this.nome = "";
        this.matricula = "";
        this.curso = "";
    }

    // Construtor
    Usuario(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
}
class Emprestimo {
    Obra obra_emprestada;
    Usuario usuario_responsavel;
    String data_emprestimo;
    String data_devolucao;

    // Construtor vazio
    Emprestimo() {
        this.obra_emprestada = null;
        this.usuario_responsavel = null;
        this.data_emprestimo = "";
        this.data_devolucao = "";
    }

    // Construtor
    Emprestimo(Obra obra_emprestada, Usuario usuario_responsavel, String data_emprestimo, String data_devolucao) {
        this.obra_emprestada = obra_emprestada;
        this.usuario_responsavel = usuario_responsavel;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }
}


public class exercicio_4 {
    public static void main(String[] args) {
        // Obras
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 1200, "Fantasia");
        Revista revista1 = new Revista("National Geographic", "Vários", 2023, 10, "Ciências e Cultura");
        Artigo_Cientifico artigo1 = new Artigo_Cientifico("A Estrutura do DNA", "Watson e Crick", 1953, "Nature", "10.1038/171737a0");

        // Usuários
        Usuario usuario1 = new Usuario("Maria Joaquina", "2023001", "Engenharia de Software");
        Usuario usuario2 = new Usuario("João da Silva", "2022015", "Biologia");

        Emprestimo emprestimo1 = new Emprestimo(livro1, usuario1, "29/09/2025", "15/10/2025");
        Emprestimo emprestimo2 = new Emprestimo(artigo1, usuario2, "28/09/2025", "05/10/2025");

        System.out.println("=== Registro de Empréstimo 1 ===");
        System.out.println("Obra: " + emprestimo1.obra_emprestada.titulo + " (" + emprestimo1.obra_emprestada.autor + ")");
        System.out.println("Usuário: " + emprestimo1.usuario_responsavel.nome + " (Matrícula: " + emprestimo1.usuario_responsavel.matricula + ")");
        System.out.println("Curso: " + emprestimo1.usuario_responsavel.curso);
        System.out.println("Data de Empréstimo: " + emprestimo1.data_emprestimo);
        System.out.println("Data de Devolução: " + emprestimo1.data_devolucao);

        System.out.println("\n=== Registro de Empréstimo 2 ===");
        System.out.println("Obra: " + emprestimo2.obra_emprestada.titulo + " (" + emprestimo2.obra_emprestada.autor + ")");
        System.out.println("Usuário: " + emprestimo2.usuario_responsavel.nome + " (Matrícula: " + emprestimo2.usuario_responsavel.matricula + ")");
        System.out.println("Curso: " + emprestimo2.usuario_responsavel.curso);
        System.out.println("Data de Empréstimo: " + emprestimo2.data_emprestimo);
        System.out.println("Data de Devolução: " + emprestimo2.data_devolucao);
    }
}
