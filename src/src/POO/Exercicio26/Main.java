package POO.Exercicio26;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca poupanca = new ContaPoupanca("Ana", 123123);
        poupanca.depositar(1000);
        poupanca.renderJuros(0.01);

        ContaCorrente corrente = new ContaCorrente("Bruno", 456123);
        corrente.depositar(1000);
        corrente.sacarComTaxa(500);

        poupanca.mostrarSaldo();
        corrente.mostrarSaldo();

    }
}
