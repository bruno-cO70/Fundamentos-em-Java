package POO.Exercicio29;

public class Circulo extends Forma{

    private double raio;

    public Circulo(double raio){
        super("Circulo");
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * (raio*raio);
    }
}
