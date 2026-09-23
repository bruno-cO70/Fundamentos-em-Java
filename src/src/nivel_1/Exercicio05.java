package nivel_1;

/*
 * Exercício 05: Leia um valor em segundos e mostre quantas horas,
 * minutos e segundos ele representa (ex.: 3725 -> 1h 2min 5s).
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor em segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(totalSegundos + " segundos equivalem a " + horas + "h " + minutos + "min " + segundos + "s");

        sc.close();
    }
}