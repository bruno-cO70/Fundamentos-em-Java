package POO.Exercicio35;

public class LampadaInteligente extends Dispositivo implements Conectavel, ControlavelPorVoz{
    public LampadaInteligente(String nome) {
        super(nome);
    }

    @Override
    public void conectarWifi(){
        System.out.println("Lâmpadas "+getNome() + " está conectado ao Wi-Fi");
    }

    @Override
    public void responderComando(String comando){
        System.out.println("Lãmpada "+ getNome() + " executando " + comando);
    }

    @Override
    public void mostrarStatus(){
        System.out.println("Lâmpada  "+getNome()+ " - tipo: Lampada Inteligente");
    }

}
