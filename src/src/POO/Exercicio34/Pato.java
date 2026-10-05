package POO.Exercicio34;

public class Pato extends Animal implements Voador, Nadador{
    public Pato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("O "+getNome()+ " faz Quá Quá");
    }

    @Override
    public void nadar(){
        System.out.println("O "+ getNome()+ " está nadando");
    }

    @Override
    public void voar(){
        System.out.println("O "+ getNome()+ " está voando.");
    }
}
