package POO.Exercicio32;

public abstract class Veiculo {
    private String modelo;
    private double valorDiaria;

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public Veiculo(String modelo, double valorDiaria) {
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }
    public abstract double calcularAluguel(int dias);

    public void mostrarAluguel(int dias){
        System.out.printf("Modelo: %s, quantidade de dias alugados: %d, valor total do aluguel: %.2f%n", modelo, dias, calcularAluguel(dias));
    }
}
