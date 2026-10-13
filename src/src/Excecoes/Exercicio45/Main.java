package Excecoes.Exercicio45;

/*
 * Exercício 45 - Projeto final da Etapa 1: sistema de academia
 * Classe abstrata Aluno (nome e idade, com validações) e as filhas
 * AlunoBasico, AlunoPremium e AlunoEstudante, cada uma com sua
 * mensalidade. Menu com matrícula, listagem, busca, cancelamento e
 * relatório (total de alunos, faturamento e aluno mais velho). O
 * programa trata todas as entradas inválidas sem quebrar.
 */

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

                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno Matriculado!");

                    } else {
                        for (Aluno aluno : alunos) {
                            System.out.printf("Nome: %s, Idade: %d, Plano: %s, Mensalidade: %.2f%n", aluno.getNome(), aluno.getIdade(), aluno.getPlano(),aluno.calcularMensalidade());
                        }
                    }
                    break;
                case 3:
                    boolean encontrarNome = false;

                    System.out.println("Nome para ser buscado: ");
                    nome = sc.nextLine();

                    for (Aluno aluno : alunos) {
                        if (aluno.getNome().equals(nome)) {
                            System.out.printf("Nome: %s, Idade: %d, Plano: %s, Mensalidade: %.2f%n", aluno.getNome(), aluno.getIdade(), aluno.getPlano(),aluno.calcularMensalidade());
                            encontrarNome = true;
                        }
                    }
                    if (!encontrarNome) {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 4:
                    Aluno alunoRemover = null;

                    System.out.println("Digite o nome para cancelar a matricula: ");
                    nome = sc.nextLine();

                    for (Aluno aluno : alunos) {
                        if (aluno.getNome().equals(nome)) {
                            alunoRemover = aluno;
                        }
                    }
                    if (alunoRemover != null) {
                        alunos.remove(alunoRemover);
                        System.out.println("Aluno removido!");
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 5:
                    double faturamentoMensal = 0;

                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno Matriculado!");
                    } else {
                        Aluno alunoMaisVelho = alunos.get(0);

                        System.out.println("Quantidade de alunos matriculados: " + alunos.size());

                        for (Aluno aluno : alunos) {
                            faturamentoMensal = faturamentoMensal + aluno.calcularMensalidade();

                            if (aluno.getIdade() > alunoMaisVelho.getIdade()) {
                                alunoMaisVelho = aluno;
                            }
                        }

                        System.out.printf("Aluno mais velho: %s, Idade: %d%n", alunoMaisVelho.getNome(), alunoMaisVelho.getIdade());
                        System.out.printf("faturamento total: %.2f%n", faturamentoMensal);
                    }
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
