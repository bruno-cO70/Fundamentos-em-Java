package nivel_4;

/*
 * Exercício 20: Leia 5 números num array e mostre-os na ordem inversa.
 */

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int []numeros = new int[5];

       for (int i=0; i< numeros.length;i++){
           System.out.println("Digite "+(i+1)+"º número.");
           numeros[i] = sc.nextInt();
       }
       for (int i = numeros.length -1; i>=0; i--){
           System.out.println("Numeros na ordem invertida: "+numeros[i]);
       }
       sc.close();
    }
}
