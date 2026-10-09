package Excecoes.Exercicio45;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("== AGENDA == \n1 - Matricular Aluno \n2 - Listar Aluno \n3 - Buscar aluno por nome \n4 - Cancelar matrícula \n5 - Relatório \n0 - Sair");
            opcao = sc.nextInt();
        }while (opcao != 0);
    }
}
