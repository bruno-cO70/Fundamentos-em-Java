package POO.Exercicio35;

public class FoneBluetooth extends Dispositivo implements Recarregavel{
    public FoneBluetooth(String nome) {
        super(nome);
    }
    @Override
    public void recarregar(){
        System.out.println("Fone "+ getNome() + " recarregando...");
    }
    @Override
    public void mostrarStatus(){
        System.out.println("Fone "+getNome()+ " - tipo: Fone Bluetooth");
    }
}
