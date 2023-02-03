package br.com.exercicioarraylistcarrolpo;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.concurrent.SubmissionPublisher;

public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.nome = "Palio";
        c1.cor = "Cinza";
        c1.valor = 100.00;

        Carro c2 = new Carro();
        c2.nome = "Gol";
        c2.cor = "Preto";
        c2.valor = 200.00;

        Carro c3 = new Carro();
        c3.nome = "C3";
        c3.cor = "Azul";
        c3.valor = 300.00;

        Agencia ag = new Agencia();
        ag.nome = "RodaVariavel";
        ag.adicionaCarro(c1);
        ag.adicionaCarro(c2);
        ag.adicionaCarro(c3);

        int qtdCarros = ag.getQuantidadeCarro();


        System.out.println("A Lista de carro da Agencia " + ag.nome + " Possui " + qtdCarros);
        System.out.println("O valor total do Carro e: " + ag.calculaPreco());
    }
}
