package br.com.bookhub.service;

import br.com.bookhub.model.Livro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    // Método Construtor
    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    // Método para adicionar o livro na lista
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    // Método para exibir o catalogo de livros
    public void exibirCatalogo() {
        if (livros.isEmpty()) {
            System.out.println("O catálogo está vazio.");
        } else {
            livros.forEach(System.out::println);
        }
    }

    // Método para retornar uma lista
    public List<Livro> getLivros() {
        return Collections.unmodifiableList(livros);
    }

    // Busca por título
    public void buscarPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado:");
                System.out.println(livro);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Livro com o título '" + titulo + "' não encontrado.");
        }
    }
}