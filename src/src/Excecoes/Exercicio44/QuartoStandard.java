package Excecoes.Exercicio44;

public class QuartoStandard extends Quarto implements Promocional{
    public QuartoStandard(int numero, double diaria) {
        super(numero, diaria);
    }
    @Override
    public double calcularHospedagem(int noites){
        if (noites <=  0){
            throw new IllegalArgumentException("As noites devem ser maior que zero!");
        }
         return getDiaria() * noites;
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
