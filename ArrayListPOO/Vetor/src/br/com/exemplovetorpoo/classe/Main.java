package br.com.exemplovetorpoo.classe;
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        String nome,buscar;
        int matricula,i;
        Aluno[] alunos = new Aluno[10];

        Scanner ler = new Scanner(System.in);
        for(i=0;i<3;i++)   {
            System.out.println("Digite a Matricula");;
            matricula = ler.nextInt();
            System.out.println("Digite o Nome");
            nome = ler.nextLine();
            nome = ler.nextLine();
            alunos[i] = new Aluno(nome, matricula);
            //System.out.println(alunos[i].mostrar());
        }
        /*for(i=0;i<3;i++) {
            System.out.println(alunos[i].mostrar());
        }*/
        // digita um nome para buscar nos objetos
        System.out.println("Digite um nome para buscar");
        buscar = ler.nextLine();
        for(i=0;i<3;i++)    {
            if(alunos[i].getNome().equals(buscar))
                System.out.println("Nome encontrado com Sucesso");
        }
    }
}
