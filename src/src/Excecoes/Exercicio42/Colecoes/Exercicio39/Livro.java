package Excecoes.Exercicio42.Colecoes.Exercicio39;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel = true;

    public String getTitulo() {
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAno() {
        return ano;
    }
    public boolean isDisponivel() {
        return disponivel;
    }

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void emprestar(){
        if (disponivel){
            System.out.println("Livro emprestado!");
            disponivel = false;
        }else {
            System.out.println("Livro já foi emprestado!\n");
        }
    }

    public void devolver(){
        System.out.println("Livro disponível\n");
        disponivel = true;
    }
}
