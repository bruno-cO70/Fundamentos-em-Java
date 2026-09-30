package POO.Exercicio29;

public abstract class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();

    public void mostrarArea(){
        System.out.printf(nome + ", sua Area é %.2f%n",calcularArea());
    }
}
