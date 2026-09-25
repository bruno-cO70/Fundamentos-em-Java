package nivel_3;

/*
 * Exercício 16 (Desafio): Jogo de adivinhação. O programa sorteia um número
 * de 1 a 100 e o usuário vai chutando. A cada chute, o programa diz
 * "maior" ou "menor". No final, mostra em quantas tentativas ele acertou.
 */

import java.util.Random;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int sorteado = random.nextInt(100) + 1;
        int chute;
        int tentativas =0;

        do {
            System.out.println("Chute o numero que foi sorteado: ");
            chute = sc.nextInt();
            tentativas++;

            if (chute > sorteado){
                System.out.println("Menos!");
            }else if (chute == sorteado){
                System.out.println("Você acertou!");
            }else {
                System.out.println("Mais!");
            }

        }while(chute != sorteado);

        System.out.println(sorteado + " foi o numero sorteado");
        System.out.println("Você acertou em: "+tentativas+" tentativas");

        sc.close();
    }
}
