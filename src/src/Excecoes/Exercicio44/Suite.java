package Excecoes.Exercicio44;

public class Suite extends Quarto{
    public Suite(int numero, double diaria) {
        super(numero, diaria);
    }
    @Override
    public double calcularHospedagem(int noites){
        if (noites <= 0){
            throw new IllegalArgumentException("As noites devem ser maior que zero");
        }
        return (getDiaria() * noites) + (50 * noites);
    }
}
