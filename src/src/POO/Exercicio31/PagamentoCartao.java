package POO.Exercicio31;

public class PagamentoCartao extends Pagamento {
    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorFinal(){
        return getValor() * 1.03;
    }
}
