package nivel_2;

/*
 * Exercício 09: Leia três números e mostre qual é o maior e qual é o menor.
 */

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        int maior = num1;
        int menor = num1;

        if(num2 > maior){
            maior = num2;
        }
        if(num2 < menor){
            menor = num2;
        }
        if(num3 > maior){
            maior = num3;
        }
        if(num3 < menor){
            menor = num3;
        }
        System.out.println("O maior número é: "+maior);
        System.out.println("O menor numero é: "+menor);

        sc.close();
    }
}
