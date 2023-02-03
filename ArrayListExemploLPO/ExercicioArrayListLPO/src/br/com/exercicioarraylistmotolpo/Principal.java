package br.com.exercicioarraylistmotolpo;

public class Principal {
    public static void main(String [] args) {

        Moto m1 = new Moto();
        Moto m2 = new Moto();

        m1.nome = "CG";
        m1.cor = "Vermelha";
        m1.valor = 100.00;

        m2.nome = "Tyger";
        m2.cor = "Cinza";
        m2.valor = 100.00;

        Agencia ag = new Agencia();
        ag.nome = "TalisonCabuloso";
        ag.adicionaMoto(m1);
        ag.adicionaMoto(m2);

        int qtdMoto = ag.getQuantidadeMoto();

        System.out.println("A Lista de motos da Agencia " + ag.nome + " Possui " + qtdMoto);
        System.out.println("O valor total das Motos e: " + ag.calculaPreco());
    }
}
