package br.com.exercicioarraylistfrutalpo;

public class Principal {
    public static void main(String[] args) {
        Fruta f1 = new Fruta();
        Fruta f2 = new Fruta();
        Fruta f3 = new Fruta();

        f1.nome = "Tomate";
        f1.preco = 8.00;
        f2.nome = "Banana";
        f2.preco = 8.00;
        f3.nome = "Abacate";
        f3.preco = 8.00;

        Sacolao sc = new Sacolao();
        sc.nome = "SR.CRUZELINO";
        sc.adicionaFruta(f1);
        sc.adicionaFruta(f2);
        sc.adicionaFruta(f3);

        int qtdFrutas = sc.getQuantidadeFruta();


        System.out.println("A Lista de frutas do Sacolao " + sc.nome + " Possui " + qtdFrutas);
        System.out.println("O valor total da compra e: " + sc.calculaPreco());
    }
}
