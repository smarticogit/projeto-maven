package br.com.maven_build;

import java.util.ArrayList;

import br.com.model.Produto;

public class App {
    public static void main(String[] args) {

        Produto produto1 = new Produto(1, "Bacon", "Embutidos", 45.00);
        Produto produto2 = new Produto(2, "Pão com Gergelim", "Pães", 24.00);
        Produto produto3 = new Produto(3, "Coca-Cola", "Bebidas", 12.00);

        ArrayList<Produto> produtos = new ArrayList<Produto>();

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println(produtos);
    }
}
