package POO.Exercicio24;

public class ContaBancaria {
    String titular;
    int numero;
    double saldo;

    public ContaBancaria(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
    }
    void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    void sacar(double valor){
        if (valor > this.saldo){
            System.out.println("Saque indisponível!");
        }else{
            this.saldo = this.saldo - valor;
        }

    }
    void mostrarSaldo(){
        System.out.println(titular + " Seu saldo é: R$ " + saldo);
    }
}
