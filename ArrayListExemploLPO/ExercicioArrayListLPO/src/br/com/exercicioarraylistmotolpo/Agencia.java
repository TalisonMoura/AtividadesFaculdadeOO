package br.com.exercicioarraylistmotolpo;

import br.com.exercicioarraylistcarrolpo.Carro;

import java.util.ArrayList;

public class Agencia {
    String nome;
    ArrayList<Moto> ListaMotos = new ArrayList<Moto>();

    public void adicionaMoto(Moto moto) {
        ListaMotos.add(moto);
    }
    public int getQuantidadeMoto()  {
        return ListaMotos.size();
    }
    public double calculaPreco()    {
        double somaValor = 0.0;
        for (int i = 0; i < ListaMotos.size(); i++) {
            Moto moto = (Moto) ListaMotos.get(i);
            somaValor += moto.valor;
        }
        return somaValor;
    }
}
