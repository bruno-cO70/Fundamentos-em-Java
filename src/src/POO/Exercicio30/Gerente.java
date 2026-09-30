package POO.Exercicio30;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario){
        super(nome, salario);
    }
    @Override
    public double calcularSalario(){
        return getSalario() + (getSalario() * 0.20);
    }
}
