package Excecoes.Exercicio45;

public class AlunoEstudante extends Aluno{
    public AlunoEstudante(int idade, String nome) {
        super(idade, nome);
    }
    @Override
    public double calcularMensalidade(){
        return 90 * 0.70;
    }
    @Override
    public String getPlano(){
        return "Plano Estudante";
    }
}
