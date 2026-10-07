package Excecoes.Exercicio42;

/*
 * Exercício 42 - Tratamento de exceções num menu
 * Proteja o menu da agenda do exercício 40 contra entradas que não são
 * números: em caso de InputMismatchException, avise o usuário, limpe o
 * buffer e mostre o menu de novo, sem repetir a opção anterior.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        String nome;
        String telefone;
        String email;


        do {
            boolean sucesso = false;

            do {
                try{
                    System.out.println("==Agenda==");
                    System.out.println("1 - Adicionar contato\n2 - Listar contatos\n3 - Buscar contato por nome\n4 - Remover contato\n0 - Sair");

                    opcao = sc.nextInt();
                    sc.nextLine();

                    sucesso = true;
                }catch (InputMismatchException e){
                    System.out.println("Erro: Digite as opções do menu!");
                    sc.nextLine();
                }
            }while (!sucesso);

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do contato: ");
                    nome = sc.nextLine();
                    System.out.println("Digite o telefone do contato: ");
                    telefone = sc.nextLine();
                    System.out.println("Digite o email do contato: ");
                    email = sc.nextLine();

                    contatos.add(new Contato(nome, telefone, email));

                    break;
                case 2:
                    if (contatos.isEmpty()){
                        System.out.println("Agenda vazia!");
                    }else {
                        for (Contato contato : contatos){
                            System.out.printf("Nome: %s, Numero: %s, E-mail: %s%n",contato.getNome(),contato.getTelefone(),contato.getEmail());
                        }
                    }
                    break;
                case 3:
                    boolean encontrarNome = false;

                    System.out.println("Nome para ser buscado: ");
                    nome = sc.nextLine();

                    for (Contato contato : contatos){
                        if (contato.getNome() .equals(nome)){
                            System.out.printf("Nome: %s, Numero: %s, E-mail: %s%n",contato.getNome(),contato.getTelefone(),contato.getEmail());
                            encontrarNome = true;
                        }
                    }
                    if (!encontrarNome){
                        System.out.println("Contato não encontrado!");
                    }
                    break;
                case 4:
                    Contato removerContato = null;

                    System.out.println("Nome do contato para ser removido: ");
                    nome = sc.nextLine();

                    for (Contato contato : contatos){
                        if (contato.getNome() . equals(nome)){
                            removerContato = contato;
                        }
                    }
                    if (removerContato != null){
                        contatos.remove(removerContato);
                        System.out.println("Contato removido!");
                    }else {
                        System.out.println("Contato não encontrado!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }while(opcao != 0);
        sc.close();
    }
}
