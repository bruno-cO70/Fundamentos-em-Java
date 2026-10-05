package POO.Exercicio34;

public class Peixe extends Animal implements Nadador{
    public Peixe(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("O "+getNome()+ " faz Psh Psh");
    }

    @Override
    public void nadar(){
        System.out.println("O "+ getNome()+ " está nadando");
    }
}
