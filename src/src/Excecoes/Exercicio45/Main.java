package Excecoes.Exercicio45;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        int opcao = 0;
        int plano = 0;
        String nome;
        int idade = 0;

        do {
            boolean sucesso = false;

            do {
                try {
                    System.out.println("== ACADEMIA == \n1 - Matricular Aluno \n2 - Listar Aluno \n3 - Buscar aluno por nome \n4 - Cancelar matrícula \n5 - Relatório \n0 - Sair");
                    opcao = sc.nextInt();
                    sc.nextLine();

                    sucesso = true;

                } catch (InputMismatchException e) {
                    System.out.println("Erro: Digite as opções do menu!");
                    sc.nextLine();
                }

            } while (!sucesso);

            switch (opcao) {

                case 1:
                    try {
                        System.out.println("1 - Básico\n2 - Premium\n3 - Estudante\nSelecione o plano: ");
                        plano = sc.nextInt();
                        sc.nextLine();


                        System.out.println("Nome do aluno: ");
                        nome = sc.nextLine();

                        System.out.println("Idade: ");
                        idade = sc.nextInt();
                        sc.nextLine();

                        switch (plano) {
                            case 1:
                                alunos.add(new AlunoBasico(idade, nome));
                                System.out.println("Aluno cadastrado!");
                                break;
                            case 2:
                                alunos.add(new AlunoPremium(idade, nome));
                                System.out.println("Aluno cadastrado!");
                                break;
                            case 3:
                                alunos.add(new AlunoEstudante(idade, nome));
                                System.out.println("Aluno cadastrado!");
                                break;
                            default:
                                System.out.println("Plano inválido!");
                                break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Digite apenas numeros!");
                        sc.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.printf("Erro: %s%n", e.getMessage());
                    }

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Saindo ... ");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
