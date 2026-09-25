package nivel_3;

/*
 * Exercício 14: Leia um número e diga se ele é primo.
 */

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para ver se ele é primo: ");
        int num = sc.nextInt();

        int divisores =0;

        for (int i=1;i<=num;i++){
            if (num % i == 0){
                divisores++;
            }
        }

        if (divisores == 2){
            System.out.println(num+ " é primo!");
        }else{
            System.out.println(num+ " não é primo!");
        }
        sc.close();
    }
}
