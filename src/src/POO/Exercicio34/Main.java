package POO.Exercicio34;

/*
 * Exercício 34 - Herança com múltiplas interfaces
 * Crie a classe abstrata Animal (nome e emitirSom()) e as interfaces
 * Nadador (nadar()) e Voador (voar()). Crie as filhas Pato (nada e
 * voa), Peixe (nada), Aguia (voa) e Cachorro (nada). No main, crie um
 * animal de cada tipo e coloque os mesmos objetos em três arrays:
 * Animal, Voador e Nadador.
 */

public class Main{
    public static void main(String[] args) {

        Pato pato = new Pato("Donald");
        Peixe peixe = new Peixe("Ronaldo");
        Aguia aguia = new Aguia("Eduardo");
        Cachorro cachorro = new Cachorro("Bob");

        Animal[] animals = new Animal[4];

        animals[0] = pato;
        animals[1] = peixe;
        animals[2] = aguia;
        animals[3] = cachorro;

        for (int i =0; i < animals.length; i++){
            animals[i].emitirSom();
        }

        Voador[] voadores = new  Voador[2];

        voadores[0] = pato;
        voadores[1] = aguia;

        for (int i = 0; i < voadores.length; i++){
            voadores[i].voar();
        }

        Nadador[] nadadors = new Nadador[3];

        nadadors[0] = pato;
        nadadors[1] = cachorro;
        nadadors[2] = peixe;

        for (int i = 0; i < nadadors.length; i++){
            nadadors[i].nadar();
        }

    }
}
