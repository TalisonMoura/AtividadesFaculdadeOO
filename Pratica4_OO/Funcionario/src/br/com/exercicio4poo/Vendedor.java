package br.com.exercicio4poo;

import java.util.Scanner;

public class Vendedor extends Funcionario {
	private double salarioBase;
	private int percentual;
	private double vendas;
	Scanner ler = new Scanner(System.in);

	public Vendedor(String nome, String rg, double salarioBase, int percentual, double vendas) {
		super(nome, rg);
		this.salarioBase = salarioBase;
		this.percentual = percentual;
		this.vendas = vendas;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(int percentual) {
		this.percentual = percentual;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public String calculaVendas() {
		this.vendas = ler.nextDouble();
		double totalV = (getPercentual() / 100 * getVendas());
		return "O salario total final é: " + getSalarioBase() + totalV;
	}

}