package nivel_2;

/*
 * Exercício 07: Leia três notas de um aluno, calcule a média e mostre
 * "Aprovado" (média >= 7), "Recuperação" (entre 5 e 7)
 * ou "Reprovado" (abaixo de 5).
 */


import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primera nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é: %.1f%n", media);

        if(media >= 7){
            System.out.println("Aprovado!!");
        } else if (media >= 5) {
            System.out.println("Recuperação!!");
        }else{
            System.out.println("Reprovado!!");
        }
      sc.close();
    }
}
