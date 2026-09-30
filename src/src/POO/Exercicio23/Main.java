package POO.Exercicio23;

/*
 * Exercício 23 - Métodos e a palavra-chave this
 * Adicione à classe Produto os métodos valorTotalEmEstoque(),
 * adicionarEstoque(int qtd) e removerEstoque(int qtd). Crie um produto,
 * mostre o valor em estoque, adicione 10 unidades, remova 3 e mostre
 * o valor novamente.
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

        produto1.adicionarEstoque(10);
        produto1.removerEstoque(3);

        produto2.adicionarEstoque(20);
        produto2.removerEstoque(7);

        System.out.println("\nApos as movimentações o produto: "+ produto1.nome + " tem valor em estoque " + produto1.valorTotalEmEstoque());
        System.out.println("\nApos as movimentações o produto: "+ produto2.nome + " tem valor em estoque " + produto2.valorTotalEmEstoque());


    }
}
