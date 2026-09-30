package POO.Exercicio29;

/*
 * Exercício 29 - Classes e métodos abstratos
 * Crie uma classe abstrata Forma com o método abstrato calcularArea()
 * e o método mostrarArea(). Crie as filhas Retangulo e Circulo, e no
 * main percorra um array de Forma mostrando a área de cada uma.
 */

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[4];
        formas[0] = new Retangulo(10, 4);
        formas[1] = new Retangulo(20, 8);
        formas[2] = new Circulo(5);
        formas[3] = new Circulo(10);

        for (int i =0; i < formas.length; i++){
            formas[i].mostrarArea();
        }
    }
}
