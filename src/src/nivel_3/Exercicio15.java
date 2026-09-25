package nivel_3;

/*
 * Exercício 14: Leia um número e diga se ele é primo.
 */

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha quantos N termos quer ver na sequência de Fibonacci: ");
        int num = sc.nextInt();

        long a = 0;
        long b = 1;

        for (int i=0;i<num;i++){
            long soma = (a+b);
            System.out.println(a);
            a = b;
            b = soma;
        }
        sc.close();
    }
}
