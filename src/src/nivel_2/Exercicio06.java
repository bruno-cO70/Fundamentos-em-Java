package nivel_2;

/*
 * Exercício 06: Leia um número e diga se ele é par ou ímpar.
 */


import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para ver se ele impar ou par: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Seu numero é par");
        }else {
            System.out.println("Seu numero é impar");
        }
        sc.close();
    }

}
