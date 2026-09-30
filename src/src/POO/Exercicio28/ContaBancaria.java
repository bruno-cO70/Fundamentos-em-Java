package POO.Exercicio28;

public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;

    public void setTitular(String titular) {
        if (titular.isBlank()){
            System.out.println("Nome Inválido");
        }else{
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public ContaBancaria(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor){
        if (valor > this.saldo){
            System.out.println("Saque indisponível!");
        }else{
            this.saldo = this.saldo - valor;
        }

    }

    public void mostrarSaldo(){
        System.out.println(titular + ", Seu saldo é: R$ " + saldo);
    }
}
