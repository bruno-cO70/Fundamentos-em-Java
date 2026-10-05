package POO.Exercicio35;

/*
 * Exercício 35 - Múltiplas interfaces e método com parâmetro
 * Crie a classe abstrata Dispositivo (nome e mostrarStatus()) e as
 * interfaces Conectavel (conectarWifi()), ControlavelPorVoz
 * (responderComando(String comando)) e Recarregavel (recarregar()).
 * Crie as filhas Celular (as três interfaces), SmartTV e
 * LampadaInteligente (conectáveis e controláveis por voz) e
 * FoneBluetooth (recarregável). No main, crie cada dispositivo uma
 * única vez e use-os em quatro arrays, um de cada tipo.
 * POO - finalizado
 */

public class Main {
    public static void main(String[] args) {

        Celular celular = new Celular("Iphone");
        SmartTV smartTV = new SmartTV("Lg fine");
        LampadaInteligente lampadaInteligente = new LampadaInteligente("Alexa");
        FoneBluetooth foneBluetooth = new FoneBluetooth("AirPods");

        Dispositivo[] dispositivos = new Dispositivo[4];

        dispositivos[0] = celular;
        dispositivos[1] = smartTV;
        dispositivos[2] = lampadaInteligente;
        dispositivos[3] = foneBluetooth;

        for (int i = 0; i < dispositivos.length; i++){
            dispositivos[i].mostrarStatus();
        }

        System.out.println();

        Conectavel[] conectavels = new Conectavel[3];

        conectavels[0] = celular;
        conectavels[1] = smartTV;
        conectavels[2] = lampadaInteligente;

        for (int i =0; i  < conectavels.length; i++){
            conectavels[i].conectarWifi();
        }

        System.out.println();

        ControlavelPorVoz[] controlavelPorVozs = new ControlavelPorVoz[3];

        controlavelPorVozs[0] = celular;
        controlavelPorVozs[1] = smartTV;
        controlavelPorVozs[2] = lampadaInteligente;

        for (int i =0; i < controlavelPorVozs.length; i++){
            controlavelPorVozs[i].responderComando("desligar");
        }

        System.out.println();

        Recarregavel[] recarregavels = new Recarregavel[2];

        recarregavels[0] = celular;
        recarregavels[1] = foneBluetooth;

        for (int i = 0; i < recarregavels.length; i++){
            recarregavels[i].recarregar();
        }
    }
}
