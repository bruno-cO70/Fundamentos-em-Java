package Excecoes.Exercicio43;

public class Produto {
    private String nome;
    private double preco;
    private  int quantidade;

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto(String nome, double preco, int quantidade) {
        if (nome.isBlank()){
            throw new IllegalArgumentException("O nome não pode estar em branco!");
        }
        if (preco <= 0){
            throw new IllegalArgumentException("O preço deve ser maior que zero!");
        }
        if (quantidade < 0){
            throw new IllegalArgumentException("A quantidade não pode ser negativa");
        }
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void vender(int qtd){
        if (qtd <= 0){
            throw new IllegalArgumentException("Retire ao menos 1 item!");
        }
        if (qtd > quantidade){
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        quantidade = quantidade - qtd;
    }
}
