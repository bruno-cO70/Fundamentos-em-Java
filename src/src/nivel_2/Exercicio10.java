package nivel_2;

/*
 * Exercício 10: Faça uma calculadora. Leia dois números e uma operação
 * (+, -, *, /) e use switch para mostrar o resultado. Trate a divisão
 * por zero e mostre "Operação inválida" para qualquer outro símbolo.
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite um numero: ");
        double num2 = sc.nextDouble();

        System.out.println("Digite a operação: \n+\n-\n*\n/");
        String operacao = sc.next();

        switch(operacao){
            case "+":
                System.out.println("Resultado: "+ (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado: "+ (num1-num2));
                break;
            case "*":
                System.out.println("Resultado: "+ (num1*num2));
                break;
            case "/":
                if(num2 == 0){
                    System.out.println("Erro: não é possível dividir por zero!");
                }else{
                    System.out.println("Resultado: "+ (num1/num2));
                }
                break;
            default:
                System.out.println("Operação inválida!!");
                break;
        }
        sc.close();
    }
}
