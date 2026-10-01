package POO.Exercicio32;

/*
 * Exercício 32 - Método abstrato com parâmetro: locadora de veículos
 * Crie uma classe abstrata Veiculo com modelo e valorDiaria (privados,
 * com getters), o método abstrato calcularAluguel(int dias) e o método
 * mostrarAluguel(int dias). Crie as filhas Carro (10% de desconto para
 * 7 dias ou mais), Moto (sem desconto) e Caminhao (taxa fixa de seguro
 * de R$ 100,00). No main, mostre o aluguel de cada veículo para 7 dias
 * e o faturamento total da locadora.
 */

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];

        veiculos[0] = new Carro("Argo", 150);
        veiculos[1] = new Moto("Fazer 300", 80);
        veiculos[2] = new Caminhao("Scania", 300);

        double total =0;

        for (int i = 0; i < veiculos.length; i++){
            veiculos[i].mostrarAluguel(7);

            total = total + veiculos[i].calcularAluguel(7);
        }
        System.out.printf("%nValor total do Alugueis: %.2f", total);

    }
}
