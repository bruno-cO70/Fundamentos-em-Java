package POO.Exercicio26;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular, int numero){
        super(titular, numero);
    }
    public void renderJuros(double taxa){
        depositar(getSaldo() * taxa);
    }
}
