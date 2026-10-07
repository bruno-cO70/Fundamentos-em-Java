package Excecoes.Exercicio41;

/*
 * Exercício 41 - Tratamento de exceções (try/catch)
 * Leia dois números inteiros e mostre a divisão do primeiro pelo
 * segundo. Trate a InputMismatchException (entrada que não é número)
 * e a ArithmeticException (divisão por zero), pedindo os números de
 * novo até a divisão dar certo.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;
        boolean sucesso = false;

        do {
            try{
                System.out.println("Digite o primeiro numero: ");
                num1 = sc.nextInt();

                System.out.println("Digite o segundo numero: ");
                num2 = sc.nextInt();

                resultado = (num1/num2);

                System.out.println("Resultado da conta: "+resultado);
                sucesso = true;

            } catch (InputMismatchException e){
                System.out.println("Erro: Digite apenas números inteiros!");
                sc.nextLine();
            }
            catch (ArithmeticException e){
                System.out.println("Erro não é possível dividir por zero!");
            }

        }while (!sucesso);

        sc.close();
    }
}
