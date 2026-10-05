package POO.Exercicio33;

/*
 * Exercício 33 - Interfaces
 * Crie a interface Tributavel, com os métodos calcularImposto() e
 * mostrarItem(). Implemente-a em duas classes sem relação de herança:
 * Produto (imposto de 10% do preço) e Servico (imposto de 5% do valor
 * total, calculado por valor da hora x horas). No main, crie um array
 * de Tributavel com dois produtos e um serviço, mostre a descrição e o
 * imposto de cada item e o total de impostos.
 */

public class Main {
    public static void main(String[] args) {
        Tributavel[] tributavels = new Tributavel[3];

        tributavels[0] = new Produto(500, "Tenis");
        tributavels[1] = new Produto(1200, "Relogio");
        tributavels[2] = new Servico("Lava rapido", 100, 10);

        double total = 0;

        for (int i = 0; i < tributavels.length; i++){
            total = total + tributavels[i].calcularImposto();

            System.out.printf("Imposto do item %s é %.2f%n", tributavels[i].mostrarItem(), tributavels[i].calcularImposto());
        }
        System.out.printf("O total acumulado dos impostos é: %.2f", total);

    }
}
