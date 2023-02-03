package br.com.exercicio5poo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int opcao;
		int numLados;
		int tamLados;
		do {

			opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Triangulo\n<2> Quadrado\n<3> Sair"));

			switch (opcao) {

			case 1:
				 numLados = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de Lados"));
				 tamLados = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho dos lados"));
				Triangulo tri = new Triangulo(numLados, tamLados, 0);
				JOptionPane.showMessageDialog(null, tri.calcularArea(), "Mensagem", JOptionPane.DEFAULT_OPTION);
				break;
			case 2:
				 numLados = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de Lados"));
				 tamLados = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho dos lados"));
				Quadrado qua = new Quadrado(numLados, tamLados, 0);
				JOptionPane.showMessageDialog(null, qua.calcularArea(), "Mensagem", JOptionPane.DEFAULT_OPTION);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Sair");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida", "Mensagem", JOptionPane.ERROR_MESSAGE);

			}
		} while (opcao != 3);

	}
}