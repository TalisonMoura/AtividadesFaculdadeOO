package br.com.Poopratica1.exe2;

public class EmpregoFaculdade {
		private String nome;
		private double salario;
		private int horasAula;
		
		EmpregoFaculdade(String nome, double salario, int horasAula)	{
			this.nome = nome;
			this.salario = salario;
			this.horasAula = horasAula;
		}
		
		double getGastos(){	
			double bonus = 40*horasAula;
			return this.salario + bonus;
		}
		String getInfo(){
		return "nome:" + this.nome + " com salário " + this.getGastos();
		}
	
}
