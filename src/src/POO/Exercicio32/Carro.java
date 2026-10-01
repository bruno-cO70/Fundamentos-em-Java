    package POO.Exercicio32;

    public class Carro extends Veiculo{
        public Carro(String modelo, double valorDiaria) {
            super(modelo, valorDiaria);
        }
        @Override
        public double calcularAluguel(int dias){
            if (dias >= 7){
            return (getValorDiaria() * dias) * 0.90;
            }else{
                return getValorDiaria() * dias;
            }
        }
    }
