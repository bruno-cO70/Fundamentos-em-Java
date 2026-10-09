package Excecoes.Exercicio45;

public abstract class Aluno {
    private String nome;
    private int idade;

    public Aluno(int idade, String nome) {
        if (nome.isBlank()){
            throw new IllegalArgumentException("O nome não pode estar em branco!");
        }
        if (idade < 14 || idade >100){
            throw new IllegalArgumentException("A idade deve estar entre 14 e 100");
        }
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract double calcularMensalidade();

    public abstract String getPlano();
}
