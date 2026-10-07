package Excecoes.Exercicio42.Colecoes.Exercicio39;

/*
 * Exercício 39 - ArrayList de objetos com estado
 * Crie a classe Livro (título, autor, ano e disponível), com os métodos
 * emprestar(), que impede emprestar um livro já emprestado, e devolver().
 * No main, empreste um livro digitado pelo usuário (tentando emprestar
 * duas vezes), mostre os livros disponíveis, o mais antigo e todos os
 * livros de um autor buscado.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String livroEmprestado = "";
        String acharAutor = "";
        boolean encontrarAutor = false;


        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro("O Cortiço", "Aluísio Azevedo", 1890));
        livros.add(new Livro("Memorias Postumas de Brás Cubas", "Machado de Assis", 1881));
        livros.add(new Livro("Capitães de Areia", "Jorge Amado", 1937));
        livros.add(new Livro("Vidas Secas", "Graciliano Ramos", 1938));

        Livro maisAntigo = livros.get(0);

        System.out.println("Digite o título do livro que quer emprestar: ");
        livroEmprestado = sc.nextLine();

        for (Livro livro : livros){
            if (livro.getTitulo() .equals(livroEmprestado)){
            livro.emprestar();
            }
        }

        for (Livro livro : livros){
            if (livro.getTitulo() .equals(livroEmprestado)){
                livro.emprestar();
            }
        }

        System.out.println("Livros disponíveis:\n");

        for (Livro livro : livros){
            if (livro.isDisponivel()){
                System.out.println(livro.getTitulo());
            }
        }

        for (Livro livro : livros){
            if (livro.getAno() < maisAntigo.getAno()){
                maisAntigo = livro;
            }
        }
        System.out.printf("%nLivro mais Antigo da biblioteca: %s, ano: %d",maisAntigo.getTitulo(), maisAntigo.getAno());

        System.out.println("\nDigite um autor para ver seus Livros: ");
        acharAutor = sc.nextLine();

        for (Livro livro : livros){
            if (livro.getAutor() .equals(acharAutor)){
                System.out.println(livro.getTitulo());
                encontrarAutor = true;
            }
        }
        if (!encontrarAutor){
            System.out.println("Livro não encontrado!");
        }

        sc.close();

    }
}
