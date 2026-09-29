package POO.Exercicio24;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Bruno", 123456);

        conta1.depositar(500);
        conta1.mostrarSaldo();

        conta1.sacar(200);
        conta1.mostrarSaldo();

        conta1.sacar(1000);
    }
}
