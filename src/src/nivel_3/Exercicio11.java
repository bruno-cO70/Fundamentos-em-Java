package nivel_3;

import java.util.Scanner;

public class Exercicio11 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para saber a tabuada: ");
        int numero = sc.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(numero+ "X"+ i+ " ="+numero*i);
        }
        sc.close();
    }
}
