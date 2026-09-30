package POO.Exercicio25;

/*
 * Exercício 25 - Encapsulamento (private, getters e setters)
 * Deixe os atributos da ContaBancaria como private, crie getters para
 * os três e um setter apenas para o titular, que recusa nomes em branco.
 * O saldo só pode ser alterado por depósito ou saque.
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

        conta1.setTitular("Bruno Carvalho");
        conta1.mostrarSaldo();
        System.out.println("Titular "+ conta1.getTitular());
        System.out.println("Numero "+ conta1.getNumero());
        System.out.println("Saldo "+ conta1.getSaldo());
    }
}
