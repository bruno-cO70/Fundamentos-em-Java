package POO.Exercicio24;

/*
 * Exercício 24 - Construtores
 * Crie uma classe ContaBancaria com titular, numero e saldo, e um
 * construtor que recebe o titular e o número (saldo começa em 0).
 * Implemente depositar, sacar (só se houver saldo suficiente)
 * e mostrarSaldo.
 */

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Bruno", 123456);

        conta1.depositar(500);
        conta1.mostrarSaldo();

        conta1.sacar(200);
        conta1.mostrarSaldo();

        conta1.sacar(1000);
        conta1.mostrarSaldo();
    }
}
