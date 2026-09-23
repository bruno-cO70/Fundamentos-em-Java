package nivel_2;

/*
 * Exercício 10: Faça uma calculadora. Leia dois números e uma operação
 * (+, -, *, /) e use switch para mostrar o resultado. Trate a divisão
 * por zero e mostre "Operação inválida" para qualquer outro símbolo.
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite um numero: ");
        double num2 = sc.nextDouble();

        String operacao = sc.next();

    }
}
