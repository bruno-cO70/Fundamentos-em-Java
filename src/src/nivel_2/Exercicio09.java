package nivel_2;

import java.util.Scanner;

/*
 * Exercício 09: Leia três números e mostre qual é o maior e qual é o menor.
 */
public class Exercicio09{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite  o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite  o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite  o terceiro número: ");
        int num3 = sc.nextInt();

        int maior = num1;
        int menor = num1;

        if(num2 < menor){
            menor = num2;
        }
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        if (num3 > maior) {
            maior = num3;
        }
        System.out.println("O maoir número é: "+maior+"\nO menor número eh: "+menor);

        sc.close();
    }
}
