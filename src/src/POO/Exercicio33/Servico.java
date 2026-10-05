package POO.Exercicio33;

public class Servico implements Tributavel{
    private String descricao;
    private double valorHora;
    private double hora;

    public Servico(String descricao, double valorHora, double hora) {
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.hora = hora;
    }

    @Override
    public double calcularImposto(){
        return (valorHora * hora) * 0.05;
    }

    @Override
    public String mostrarItem(){
        return descricao;
    }
}
