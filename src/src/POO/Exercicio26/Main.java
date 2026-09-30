package POO.Exercicio26;

/*
 * Exercício 26 - Herança (extends e super)
 * Crie as classes filhas ContaPoupanca, com o método renderJuros(taxa),
 * e ContaCorrente, com o método sacarComTaxa(valor), que cobra uma
 * taxa fixa de R$ 5,00 por saque.
 */

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
