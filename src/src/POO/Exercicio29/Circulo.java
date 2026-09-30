package POO.Exercicio29;

public class Circulo extends Forma{

    private double raio;
    private double pi = Math.PI;

    public Circulo(double raio, double pi){
        super("Circulo");
        this.pi = pi;
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        return pi * raio;
    }
}
