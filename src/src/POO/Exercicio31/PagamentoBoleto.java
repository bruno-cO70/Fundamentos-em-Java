package POO.Exercicio31;

public class PagamentoBoleto extends Pagamento{
    public PagamentoBoleto(double valor) {
        super(valor);
    }
    @Override
    public double calcularValorFinal(){
        return getValor() + 2.50;
    }
}
