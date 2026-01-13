package br.com.bookhub.model;

public class Livro {

    // Visibilidade, tipo e atributo
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private double preco;

    // Método Construtor
    public Livro(String titulo, String autor, int anoDePublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.preco = preco;
    }

    // Método Getter (Usar o SETTER somente quando quiser alterar um objeto depois de criado)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public double getPreco() {
        return preco;
    }

    // Método toString
    @Override
    public String toString() {
        return "\n" +
                "╔════════════════════════════════════════════╗\n" +
                "║                 📚 LIVRO 📚               ║\n" +
                "╠════════════════════════════════════════════╣\n" +
                String.format("║ Título:            %-22s ║\n", titulo) +
                String.format("║ Autor:             %-22s ║\n", autor) +
                String.format("║ Ano de Publicação: %-22d ║\n", anoDePublicacao) +
                String.format("║ Preço:             R$ %-19.2f ║\n", preco) +
                "╚════════════════════════════════════════════╝";
    }


}
