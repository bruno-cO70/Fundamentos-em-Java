package Excecoes.Exercicio42.Colecoes.Exercicio38;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int quantidade, double preco, String nome) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public double valorEmEstoque(){
        return preco * quantidade;
    }
}
