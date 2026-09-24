package nivel_3;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para saber seu fatorial: ");
        int num = sc.nextInt();

        long fatorial=1;

        for (int i= 1;i<=num;i++){
            fatorial = i * fatorial;
        }
        System.out.println("O Fatorial de: "+num+" eh: "+fatorial);

        sc.close();
    }
}
