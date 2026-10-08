package Excecoes.Exercicio44;

public abstract class Quarto {
    private int numero;
    private double diaria;

    public Quarto(int numero, double diaria) {
        if (diaria <=  0){
            throw new IllegalArgumentException("A diaria deve ser maior que zero!");
        }
        this.numero = numero;
        this.diaria = diaria;
    }

    public int getNumero() {
        return numero;
    }

    public double getDiaria() {
        return diaria;
    }

    public abstract  double calcularHospedagem(int noites);

    public void mostrarHospedagem(int noites){
        System.out.printf("Numero do quarto: %d, diarias: %d, valor total a pagar: %.2f%n", numero,noites, calcularHospedagem(noites));
    }
}
