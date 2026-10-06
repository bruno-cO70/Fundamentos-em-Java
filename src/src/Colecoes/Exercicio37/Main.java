package Colecoes.Exercicio37;

/*
 * Exercício 37 - ArrayList de números (Integer)
 * Leia notas de 0 a 10 até o usuário digitar -1. Com for-each, mostre
 * a quantidade, a média com duas casas e a maior nota. Depois, peça
 * uma nota e diga se ela está na lista.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int nota = 0;
        double soma = 0;
        double media = 0;
        int maior = 0;

        do {
            System.out.println("Digite -1 para encerrar - Digite uma nota: ");
            nota = sc.nextInt();
            if (nota != -1){
                notas.add(nota);
            }
        }while (nota != -1);

        System.out.println("Quantidade de notas digitadas: "+notas.size());

        for (int notasTotais : notas){
            System.out.println(notasTotais);

            soma = soma + notasTotais;

            if (notasTotais > maior){
                maior = notasTotais;
            }
        }
        media = soma / notas.size();

        System.out.printf("A media das notas é %.2f%n",media);

        System.out.println("A maior nota digitada foi: "+maior);

        System.out.println("Digite uma nota para verificar sua existência: ");
        int verificar = sc.nextInt();

        if (notas.contains(verificar)){
            System.out.println("Sua nota existe!");
        }else {
            System.out.println("Sua nota não existe!");
        }
        sc.close();
    }
}
