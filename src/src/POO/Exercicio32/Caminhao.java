package POO.Exercicio32;

public class Caminhao extends Veiculo{
    public Caminhao(String modelo, double valorDiaria) {
        super(modelo, valorDiaria);
    }
    @Override
    public double calcularAluguel(int dias){
        return (getValorDiaria() * dias) + 100;
    }
}
