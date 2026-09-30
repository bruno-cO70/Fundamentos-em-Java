package POO.Exercicio29;

public abstract class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();

    public void mostrarArea(){
        System.out.println(nome + " sua Area é "+calcularArea());
    }
}
