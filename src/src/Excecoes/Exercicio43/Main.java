package Excecoes.Exercicio43;

/*
 * Exercício 43 - Lançando exceções (throw)
 * Crie a classe Produto com validações no construtor (nome em branco,
 * preço menor ou igual a zero e quantidade negativa) e o método
 * vender(), que lança exceção para quantidade inválida ou estoque
 * insuficiente. No main, teste cada caso com try/catch, mostrando
 * a mensagem do erro com e.getMessage().
 */

public class Main {
    public static void main(String[] args) {
        Produto teclado = null;

        try {
            teclado = new Produto("Teclado", 150, 10);
            System.out.println("Produto criado: "+teclado.getNome());
        }catch (IllegalArgumentException e){
            System.out.println("Erro: "+e.getMessage());
        }

        try {
            new Produto("Teclado", -150, 10);
            System.out.println("Produto criado");
        }catch (IllegalArgumentException e){
            System.out.println("Erro: "+e.getMessage());
        }

        try {
            new Produto("", 150, 10);
            System.out.println("Produto criado");
        }catch (IllegalArgumentException e){
            System.out.println("Erro: "+e.getMessage());
        }

        try {
            teclado.vender(3);
            System.out.println("Quantidade em estoque: "+teclado.getQuantidade());
        }catch (IllegalArgumentException e){
            System.out.println("Erro: "+e.getMessage());
        }

        try {
            teclado.vender(20);
            System.out.println("Quantidade em estoque: "+teclado.getQuantidade());
        }catch (IllegalArgumentException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
