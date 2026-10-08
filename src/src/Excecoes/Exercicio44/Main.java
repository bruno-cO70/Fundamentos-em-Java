package Excecoes.Exercicio44;

/*
 * Exercício 44 - Integrador: sistema de hotel
 * Crie a classe abstrata Quarto (número e diária, validando a diária)
 * com o método abstrato calcularHospedagem(noites), e as filhas
 * QuartoStandard, QuartoLuxo (10% de taxa) e Suite (R$ 50 de café por
 * noite), que validam as noites. A interface Promocional aplica 15% de
 * desconto ao Standard e ao Luxo. No main, use os mesmos objetos em
 * listas de Quarto e de Promocional, mostre as hospedagens, o
 * faturamento total, os descontos e teste os erros com try/catch.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Quarto> quartos = new ArrayList<>();
        ArrayList<Promocional> promocionals = new ArrayList<>();
        double faturamentoTotal = 0;

        QuartoStandard quartoStandard = new QuartoStandard(101,200);
        QuartoLuxo quartoLuxo = new QuartoLuxo(201, 400);
        Suite suite = new Suite(301,700);

        promocionals.add(quartoStandard);
        promocionals.add(quartoLuxo);

        quartos.add(quartoStandard);
        quartos.add(quartoLuxo);
        quartos.add(suite);

        for (Quarto quarto : quartos){
            faturamentoTotal = faturamentoTotal + quarto.calcularHospedagem(3);
            quarto.mostrarHospedagem(3);
        }
        System.out.printf("%nFaturamento total: %.2f%n",faturamentoTotal);

        System.out.println("Quartos promocionais:\n");

        for (Promocional promocional : promocionals){
            System.out.printf("Numero do Quarto: %d, Desconto: %.2f%n",promocional.mostrarNumero(), promocional.calcularComDesconto(3));
        }

        try {
            new QuartoStandard(102, 0);
        }catch (IllegalArgumentException e){
            System.out.println("\nErro: "+e.getMessage() );
        }

        try {
            quartoStandard.calcularHospedagem(0);
        }catch (IllegalArgumentException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
