package Excecoes.Exercicio44;

public class QuartoLuxo extends Quarto implements Promocional{
    public QuartoLuxo(int numero, double diaria) {
        super(numero, diaria);
    }
    @Override
    public double calcularHospedagem(int noites){
        if (noites <= 0){
            throw new IllegalArgumentException("A diaria devem ser maior que zero");
        }
        return (getDiaria() * noites) * 1.10;
    }

    @Override
    public double calcularComDesconto(int noites){
        return calcularHospedagem(noites) * 0.85;
    }

    @Override
    public int mostrarNumero(){
        return getNumero();
    }
}
