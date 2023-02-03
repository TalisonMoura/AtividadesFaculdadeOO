package br.com.exercicioarraylistfrutalpo;

public class Fruta {
    String nome;
    double preco;

    public Fruta()  {

    }
    public Fruta(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
