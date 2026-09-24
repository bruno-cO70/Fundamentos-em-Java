package nivel_3;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para começar(0 para parar): ");
        int num = sc.nextInt();

        int soma =0;
        int contador =0;

        while (num != 0){
            soma = soma+num;
            contador = contador+1;
            System.out.println("Digite 0 quanndo quiser parar(0 para parar): ");
            num = sc.nextInt();

        }
        if (contador >0){
            double media=0;
            media = (double) soma/contador;

            System.out.println("Numeros digitados: "+contador);
            System.out.println("Soma dos numeros digitados: "+soma);
            System.out.println("A media dos numeros digitados eh: "+media);
        }else {
            System.out.println("Nenhum numero foi digitado!");
        }

        sc.close();
    }
}
