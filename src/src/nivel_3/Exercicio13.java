package nivel_3;

/*
 * Exercício 13: Leia vários números até o usuário digitar 0. No final,
 * mostre quantos foram digitados, a soma e a média (o 0 não entra na conta).
 * Se o usuário digitar 0 logo de cara, mostre "Nenhum número foi digitado".
 */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero (0 para parar): ");
        int num = sc.nextInt();

        int contador = 0;
        int soma = 0;

        while (num != 0){
            soma = soma +num;
            contador = contador+1;

            System.out.println("Digite o próximo número(0 para parar):  ");
            num = sc.nextInt();
        }
        if (contador > 0){
            double media = (double) soma/ contador;
            System.out.println("Quantidade de numeros digitados: "+contador);
            System.out.println("Soma dos  numeros digitados: "+soma);
            System.out.println("Media dos numeros digitados: "+media);
        }else {
            System.out.println("Nenhum numero foi digitado!!");
        }
        sc.close();
        }
    }
