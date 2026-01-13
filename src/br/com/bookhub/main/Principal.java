package br.com.bookhub.main;

import br.com.bookhub.model.Livro;
import br.com.bookhub.service.CatalogoLivros;

public class Principal {
    static void main() {

        // Instanciar classe Catalogo
        CatalogoLivros meuCatalogo = new CatalogoLivros();

        // Criar livros
        Livro l1 = new Livro("Java: Como Programar", "Deitel", 2017, 150.00);
        Livro l2 = new Livro("Codigo Limpo", "Robert Martin", 2009, 85.50);
        Livro l3 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937, 45.00);

        // Adiicionar livros ao catalogo
        System.out.println("Adicionando livros ao sistema...");
        meuCatalogo.adicionarLivro(l1);
        meuCatalogo.adicionarLivro(l2);
        meuCatalogo.adicionarLivro(l3);

        // Exibir Catalogo
        System.out.println("\n*** -- BIBLIOTECA -- ***");
        meuCatalogo.exibirCatalogo();

        // Testar busca
        System.out.println("\n*** -- TESTE DE BUSCA -- ***");
        meuCatalogo.buscarPorTitulo("Codigo Limpo");

        // Teste de busca com livro que não existe
        meuCatalogo.buscarPorTitulo("Harry Potter");
    }
}