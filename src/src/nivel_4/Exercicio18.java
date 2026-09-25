package nivel_4;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []numeros  = new int[5];
        int soma = 0;

        for (int i=0;i < numeros.length;i++){
            System.out.println("digite o "+(i+1)+ "º numero");
            numeros[i] = sc.nextInt();

            soma = (soma + numeros[i]);
        }
        double media = (double) soma / numeros.length;
        System.out.println("A soma dos números é: "+soma);
        System.out.println("A media dos números é: "+media);

        sc.close();
    }
}
