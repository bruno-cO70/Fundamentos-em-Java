package POO.Exercicio34;

public class Aguia extends Animal implements Voador{
    public Aguia(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("O "+getNome()+ " faz Pra Pra");
    }

    @Override
    public void voar(){
        System.out.println("O "+getNome()+" está voando.");
    }
}
