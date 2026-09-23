package nivel_1;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite um segundo numero ");
        int num2 = sc.nextInt();

        System.out.println("Multiplicação dos numeros digitados: " + (num1 * num2));
        System.out.println("Subtração dos numeros digitados: " + (num1 - num2));
        System.out.println("Divisão dos numeros digitados: " + ((double)num1 / num2));
        System.out.println("Soma dos numeros digitados: " + (num1 + num2));

        sc.close();
    }
}
