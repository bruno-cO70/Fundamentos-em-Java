package nivel_4;

/*
 * Exercício 21: Leia 5 números num array, depois peça um número ao usuário
 * e diga se ele está no array e em qual posição.
 */

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []numeros = new int[5];
        boolean encontrado = false;

        for (int i=0;i< numeros.length;i++){
            System.out.println("Digite "+(i+1)+"º número.");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Digite um número para saber sua posição no array.");
        int busca = sc.nextInt();

        for (int i =0; i < numeros.length; i++){
                if (numeros[i] == busca){
                encontrado = true;
                    System.out.println("O número "+busca+" está na posicão "+(i+1));
            }
        }
        if (!encontrado){
            System.out.println("Número não encontrado!");
        }
        sc.close();
    }
}
