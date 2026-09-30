package POO.Exercicio28;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, int numero){
        super(titular, numero);
    }
    public void renderJuros(double taxa){
        depositar(getSaldo() * taxa);
    }
    @Override
    public void mostrarSaldo(){
        System.out.println("Conta Poupança - "+getTitular()+ ", seu saldo é: R$ "+getSaldo());
    }
}
