package Excecoes.Exercicio42.Colecoes.Execicio36;

/*
 * Exercício 36 - ArrayList
 * Crie uma lista de compras com ArrayList de String. Leia itens até o
 * usuário digitar "fim", mostre a quantidade e todos os itens com
 * for-each, peça um item para remover (avisando se não for encontrado)
 * e mostre a lista final.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> itens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String item = "";

       do {
           System.out.println("(digite fim para encerrar) Nome do item : ");
           item = sc.nextLine();
           if (!item .equals("fim")){
            itens.add(item);
           }
       }while(!item .equals("fim"));

        System.out.println("Quantidade de itens: "+itens.size());

        for (String itemLista : itens){
            System.out.println(itemLista);
        }

        System.out.println("Nome do item que quer remover: ");
        String remover = sc.nextLine();

        if (itens.contains(remover)){

            itens.remove(remover);
            System.out.println("Item removido");
        }else {
            System.out.println("Item não encontrado");
        }

        System.out.println("Lista final:");

        for (String itemLista : itens){
            System.out.println(itemLista);
        }

        sc.close();

    }
}
