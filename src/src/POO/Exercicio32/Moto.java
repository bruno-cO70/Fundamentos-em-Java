package POO.Exercicio32;

public class Moto extends Veiculo{
    public Moto(String modelo, double valorDiaria) {
        super(modelo, valorDiaria);
    }
    @Override
    public double calcularAluguel(int dias){
        return getValorDiaria() * dias;
    }
}
