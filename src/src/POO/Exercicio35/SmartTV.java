package POO.Exercicio35;

public class SmartTV extends Dispositivo implements Conectavel, ControlavelPorVoz{
    public SmartTV(String nome) {
        super(nome);
    }

    @Override
    public void conectarWifi(){
        System.out.println("SmartTV "+getNome() + " está conectado ao Wi-Fi");
    }

    @Override
    public void responderComando(String comando){
        System.out.println("SmartTV "+ getNome() + " executando " + comando);
    }

    @Override
    public void mostrarStatus(){
        System.out.println("SmartTV "+getNome()+ " - tipo: SmartTv");
    }
}
