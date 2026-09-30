package POO.Exercicio30;

/*
 * Exercício 30 - Abstração e polimorfismo: folha de pagamento
 * Crie uma classe abstrata Funcionario com nome, salário base e o
 * método abstrato calcularSalario(). Crie as filhas Gerente (bônus de
 * 20%), Desenvolvedor (R$ 50 por hora extra) e Estagiario (só o base).
 * No main, mostre o salário de cada um e o total da folha.
 */

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[4];
        funcionarios[0] = new Gerente("Valter", 5000);
        funcionarios[1] = new Desenvolvedor("Bruno", 4000, 10);
        funcionarios[2] = new Desenvolvedor("Enzo", 4000, 5);
        funcionarios[3] = new Estagiario("Felipe", 2500);

        double total = 0;

        for (int i =0; i < funcionarios.length; i++){
            funcionarios[i].mostraSalario();

            total = total + funcionarios[i].calcularSalario();
        }
        System.out.printf("Total folha de pagamento: %.2f", total);
    }
}
