package br.com.exercicio4poo;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int opcao;
		String rg;
		String nome;
		double horasExtras;
		double salarioFixo;
		double salarioBase;
		double percentual;
		double vendas=0;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Vendedor\n<2> Administrativo\n<3> Sair"));
			nome = JOptionPane.showInputDialog("Nome do funcionario: ");
			rg = JOptionPane.showInputDialog("RG do funcionario: ");
			switch (opcao) {
			case 1:
				salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Salário Base"));
				percentual = Double.parseDouble(JOptionPane.showInputDialog("Percentual"));
				Vendedor vd = new Vendedor(nome,rg,salarioBase,5,vendas);
				for (int i = 0; i < 3; i++)	{
				vendas = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de Vendas diarias "+(i+1)+" :"));
				}
				JOptionPane.showMessageDialog(null, vd.calculaVendas(), "Mensagem", JOptionPane.DEFAULT_OPTION);
				break;
			case 2:
				salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Salario Fixo"));
				horasExtras = Double.parseDouble(JOptionPane.showInputDialog("Horas Acumuladas"));
				Administrativo admin = new Administrativo(nome, rg, salarioFixo, horasExtras);
				JOptionPane.showMessageDialog(null, admin.calculaHoraExtra(),"Mensagem",JOptionPane.DEFAULT_OPTION);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Obrigado!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida", "Mensagem", JOptionPane.ERROR_MESSAGE);
			}

		} while (opcao != 3);
	}
}
