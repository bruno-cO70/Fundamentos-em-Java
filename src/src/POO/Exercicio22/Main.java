package POO.Exercicio22;

/*
 * Exercício 22 - Classes e objetos
 * Crie uma classe Produto com os atributos nome, preco e quantidade.
 * Crie dois produtos e mostre, para cada um, o nome e o valor total
 * em estoque (preço x quantidade).
 */

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "escova";
        produto1.preco = 15.0;
        produto1.quantidade = 50;

        Produto produto2 = new Produto();
        produto2.nome = "pasta";
        produto2.preco = 10.0;
        produto2.quantidade = 60;

        System.out.println(produto1.nome + " valor em estoque " + (produto1.preco * produto1.quantidade));
        System.out.println(produto2.nome + " valor em estoque " + (produto2.preco * produto2.quantidade));
    }
}
