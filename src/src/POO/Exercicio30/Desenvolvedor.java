package POO.Exercicio30;

public class Desenvolvedor extends Funcionario {

    private double horas;

    public Desenvolvedor(String nome,double salario, double horas) {
        super(nome, salario);
        this.horas = horas;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + (horas * 50);
    }
}
