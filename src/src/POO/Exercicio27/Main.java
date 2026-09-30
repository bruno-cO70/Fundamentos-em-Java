package POO.Exercicio27;

/*
 * Exercício 27 - Sobrescrita de métodos (@Override)
 * Na ContaCorrente, sobrescreva o método sacar para cobrar a taxa de
 * R$ 5,00 automaticamente. Nas duas classes filhas, sobrescreva o
 * mostrarSaldo para exibir também o tipo da conta.
 */

public class Main {
    public static void main(String[] args) {

        ContaPoupanca poupanca = new ContaPoupanca("Ana", 123123);
        poupanca.depositar(1000);
        poupanca.renderJuros(0.01);

        ContaCorrente corrente = new ContaCorrente("Bruno", 456123);
        corrente.depositar(1000);
        corrente.sacar(500);

        poupanca.mostrarSaldo();
        corrente.mostrarSaldo();

    }
}
