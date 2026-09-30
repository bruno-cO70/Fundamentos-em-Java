package POO.Exercicio26;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(String titular, int numero){
        super(titular, numero);
    }
    public void sacarComTaxa(double valor){
        sacar(valor + 5);
    }
}
