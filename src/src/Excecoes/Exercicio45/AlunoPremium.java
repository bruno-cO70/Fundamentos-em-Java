package Excecoes.Exercicio45;

public class AlunoPremium extends Aluno{
    public AlunoPremium(int idade, String nome) {
        super(idade, nome);
    }
    @Override
    public double calcularMensalidade(){
        return 150;
    }
    @Override
    public String getPlano(){
        return "Plano Premium";
    }
}
