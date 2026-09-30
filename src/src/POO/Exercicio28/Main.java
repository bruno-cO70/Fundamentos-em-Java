package POO.Exercicio28;

/*
 * Exercício 28 - Polimorfismo
 * Crie um array de ContaBancaria com duas contas poupança e duas contas
 * correntes. Com laços, deposite 1000 em todas, saque 100 de todas e
 * mostre o saldo de cada uma. Cada conta aplica suas próprias regras.
 */

public class Main {
    public static void main(String[] args) {
        ContaBancaria[] contas = new ContaBancaria[4];
        contas[0] = new ContaCorrente("Ana", 123);
        contas[1] = new ContaCorrente("Bruno", 456);
        contas[2] = new ContaPoupanca("Eduardo", 789);
        contas[3] = new ContaPoupanca("Gabriela", 147);

        for (int i = 0;i < contas.length; i++ ){
            contas[i].depositar(1000);
        }

        for (int i =0; i < contas.length; i++){
            contas[i].sacar(100);
        }

        for (int i = 0;i < contas.length; i++){
            contas[i].mostrarSaldo();
        }

    }
}
