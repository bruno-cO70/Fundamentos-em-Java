package POO.Exercicio30;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void mostraSalario(){
        System.out.printf(nome + ", seu salario final é: %.2f%n", calcularSalario());
    }
    public   abstract double calcularSalario();
}
