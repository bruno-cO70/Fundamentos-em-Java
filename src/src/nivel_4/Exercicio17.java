package nivel_4;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]numeros = new int[5];

        for (int i=0;i<numeros.length;i++){
            System.out.println("Digite 0"+ (i+1)+ "ºnúmero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Os números digitados foram: ");
        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]+ "");
        }

        sc.close();
    }
}
