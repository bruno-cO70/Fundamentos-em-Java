package nivel_2;

/*
 * Exercício 08: Leia o ano de nascimento, calcule a idade e diga se a
 * pessoa não pode votar (menos de 16), se o voto é facultativo
 * (16 e 17 anos ou mais de 70) ou obrigatório (18 a 70 anos).
 */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano em que voce nasceu: ");
        int ano = sc.nextInt();

        int anoAtual = java.time.Year.now().getValue();

        int idade = anoAtual - ano;

        System.out.println("Sua idade é: "+idade);

        if(idade < 16 ){
            System.out.println("Não pode votar!!");
        } else if (idade <18) {
            System.out.println("Voto facultativo!!");
        } else if (idade <= 70) {
            System.out.println("Voto obrigatório!!");
        }else{
            System.out.println("Voto facultativo!!");
        }
        sc.close();
    }
}
