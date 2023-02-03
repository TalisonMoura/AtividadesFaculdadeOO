package br.com.exercicioarraylistfrutalpo;

import java.util.ArrayList;

public class Sacolao {
    String nome;

    ArrayList<Fruta> ListaFrutas = new ArrayList<Fruta>();

    public void adicionaFruta(Fruta fruta) {
        ListaFrutas.add(fruta);
    }

    public int getQuantidadeFruta() {
        return ListaFrutas.size();
    }
    public double calculaPreco()    {
        double valorTotal = 0;

        for (Fruta fruta: ListaFrutas)  {
            valorTotal += fruta.getPreco();
        }
        return valorTotal;
    }
}
