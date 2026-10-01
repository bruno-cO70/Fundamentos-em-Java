package POO.Exercicio31;

public abstract class Pagamento {

    private double valor;

    public double getValor() {
        return valor;
    }

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract double calcularValorFinal();

    public void mostrarResumo(){
        System.out.printf("valor inicial: %.2f valor final: %.2f%n",valor, calcularValorFinal());
    }
}
