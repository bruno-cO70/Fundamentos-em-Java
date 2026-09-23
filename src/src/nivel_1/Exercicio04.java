package nivel_1;

/*
 * Exercício 04: Leia o salário de um funcionário e o percentual de
 * aumento, e mostre o novo salário.
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = sc.nextDouble();

        System.out.println("Digite o percentual de aumento do salário: ");
        double percentual = sc.nextDouble();

        System.out.println("O seu novo salário é: "+salario*(1+percentual/100));

        sc.close();
    }
}
