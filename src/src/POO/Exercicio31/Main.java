package POO.Exercicio31;

/*
 * Exercício 31 - Abstração e polimorfismo: sistema de pagamentos
 * Crie uma classe abstrata Pagamento com o valor (privado, com getter),
 * o método abstrato calcularValorFinal() e o método mostrarResumo(),
 * que exibe o valor original e o final. Crie as filhas PagamentoPix
 * (5% de desconto), PagamentoCartao (3% de acréscimo) e PagamentoBoleto
 * (taxa fixa de R$ 2,50). No main, mostre o resumo de cada pagamento
 * e o total recebido pela loja.
 */

public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = new Pagamento[3];

        pagamentos[0] = new PagamentoPix(1000);
        pagamentos[1] = new PagamentoCartao(1000);
        pagamentos[2] = new PagamentoBoleto(1000);

        double total =0;

        for (int i =0; i < pagamentos.length; i++){
            pagamentos[i].mostrarResumo();

            total = total + pagamentos[i].calcularValorFinal();
        }
        System.out.printf("%nValor final acumulado: %.2f", total);
    }
}
