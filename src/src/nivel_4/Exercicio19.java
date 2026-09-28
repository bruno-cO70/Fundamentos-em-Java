package nivel_4;

/*
 * Exercício 19: Leia 5 números num array e mostre o maior e o menor.
 */

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []numeros = new int[5];

        for (int i=0;i<numeros.length;i++){
            System.out.println("Digite "+(i+1)+"º numero.");
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i=0;i<numeros.length;i++){

            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println("O maior numero digitado foi: "+maior);
        System.out.println("O menor numero digitado foi: "+menor);

        sc.close();
    }
}
