package POO.Exercicio35;

public class Celular extends  Dispositivo implements Conectavel, ControlavelPorVoz, Recarregavel{
    public Celular(String nome) {
        super(nome);
    }

    @Override
    public void conectarWifi(){
        System.out.println("Celualr "+getNome() + " está conectado ao Wi-Fi");
    }

    @Override
    public void responderComando(String comando){
        System.out.println("Celular "+ getNome() + " executando " + comando);
    }

    @Override
    public void recarregar(){
        System.out.println("Celular "+ getNome() + " recarregando...");
    }

    @Override
    public void mostrarStatus(){
        System.out.println("Celular "+getNome()+ " - tipo: Celular");
    }
}
