package POO.Exercicio31;

public class PagamentoPix extends Pagamento{

    public PagamentoPix(double valor) {
        super(valor);
    }
    @Override
    public double calcularValorFinal(){
        return getValor() * 0.95;
    }
}
