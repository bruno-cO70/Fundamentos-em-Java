package Excecoes.Exercicio42.Colecoes.Exercicio38;

/*
 * Exercício 38 - ArrayList de objetos
 * Crie a classe Produto (nome, preço e quantidade, com getters e o
 * método valorEmEstoque()). No main, adicione quatro produtos a um
 * ArrayList e, com um for-each, mostre os dados de cada um, o valor
 * total do estoque e o produto mais caro. Depois, busque um produto
 * pelo nome digitado pelo usuário.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        double valorTotal = 0;
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);

        produtos.add(new Produto(10,150,"Teclado"));
        produtos.add(new Produto(25,80,"Mouse"));
        produtos.add(new Produto(5,900,"Monitor"));
        produtos.add(new Produto(8,250,"Headset"));

        Produto maisCaro = produtos.get(0);

        for (Produto produtosLista : produtos){
            System.out.printf("%s, preco: %.2f, valor em estoque: %.2f%n",produtosLista.getNome(), produtosLista.getPreco(), produtosLista.valorEmEstoque());

            valorTotal = valorTotal + produtosLista.valorEmEstoque();

            if (produtosLista.getPreco() > maisCaro.getPreco()){
                maisCaro = produtosLista;
            }
        }
        System.out.printf("%nValor total em estoque: %.2f%n", valorTotal);
        System.out.printf("%nProduto mais caro: %s (R$ %.2f)%n", maisCaro.getNome(), maisCaro.getPreco());

        System.out.println("\nNome do produto para saber suas informações: ");
        String busca = sc.nextLine();

        for (Produto buscarProduto : produtos){
            if (buscarProduto.getNome() .equals(busca)){
                encontrado = true;
                System.out.printf("%s, quantidade: %d, preço: %.2f, valor em estoque: %.2f%n",buscarProduto.getNome(), buscarProduto.getQuantidade(),buscarProduto.getPreco(), buscarProduto.valorEmEstoque());
            }
        }
        if (!encontrado){
            System.out.println("Produto não Encontrado!");
        }
        sc.close();

    }
}
