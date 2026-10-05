package POO.Exercicio33;

public class Produto implements Tributavel{
    private String nome;
    private double preco;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public double calcularImposto(){
        return preco * 0.10;
    }

    @Override
    public String mostrarItem(){
        return nome;
    }
}
