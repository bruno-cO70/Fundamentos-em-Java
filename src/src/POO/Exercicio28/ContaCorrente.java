package POO.Exercicio28;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String titular, int numero){
        super(titular, numero);
    }
    @Override
    public void sacar(double valor){
        super.sacar(valor + 5);
    }
    @Override
    public void mostrarSaldo(){
        System.out.println("Conta Corrente - "+getTitular()+", seu saldo é: R$ "+getSaldo());
    }
}
