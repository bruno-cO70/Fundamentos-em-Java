package Excecoes.Exercicio45;

public class AlunoBasico extends Aluno{
    public AlunoBasico(int idade, String nome) {
        super(idade, nome);
    }
    @Override
    public double calcularMensalidade(){
        return 90;
    }
    @Override
    public String getPlano(){
        return "Plano Básico";
    }
}
