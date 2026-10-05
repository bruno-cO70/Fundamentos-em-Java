package POO.Exercicio34;

public class Cachorro extends Animal implements Nadador{
    public Cachorro(String nome) {
        super(nome);
    }
    @Override
    public void emitirSom(){
        System.out.println("O "+getNome()+ " faz AU AU.");
    }

    @Override
    public void nadar(){
        System.out.println("O "+ getNome() + " está nadando.");
    }
}
