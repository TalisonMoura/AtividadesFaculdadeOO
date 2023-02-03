package br.com.exercicioarraylistcarrolpo;

import java.util.ArrayList;

public class Agencia {
    String nome;
    ArrayList<Carro> ListaCarros = new ArrayList<Carro>();

    // CRIANDO UM MÉTODO SEM RETORNO PARA, INLCLUIR TIPOS DE CARRO DENTRO DA LISTA DE CARROS
    public void adicionaCarro(Carro carro) {
        ListaCarros.add(carro);
    }

    // UTILIZANDO A PROPIEDADE SIZE PARA CONTAR A QUANTIDADE DE CARROS NA LISTA
    public int getQuantidadeCarro() {
        return ListaCarros.size();
    }

    public double calculaPreco() {
        double somaValor = 0.0;
        for (int i = 0; i < ListaCarros.size(); i++) {
            Carro carro = (Carro) ListaCarros.get(i);
            somaValor += carro.valor;
        }
        return somaValor;
    }
}
