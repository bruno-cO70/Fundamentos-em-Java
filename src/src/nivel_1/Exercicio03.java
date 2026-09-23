package nivel_1;

/*
 * Exercício 03: Leia uma temperatura em Celsius e converta para
 * Fahrenheit (F = C * 9/5 + 32).
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma temperatura em graus C para transformar em F: ");
        double temperatura = sc.nextDouble();

        System.out.println("Sua temperatura em Graus é:" + temperatura + " \nE sua temperatura transformada em fahrenheit é: " + ((temperatura*9)/5+32));

        sc.close();
    }
}
