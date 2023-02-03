package br.com.exercicio4poo;

import java.util.Scanner;

public class Administrativo extends Funcionario {
	private double salarioFixo;
	private double horasExtras;
	Scanner ler = new Scanner(System.in);

	public Administrativo(String nome, String rg, double salarioFixo, double horasExtras) {
		super(nome, rg);
		this.salarioFixo = salarioFixo;
		this.horasExtras = horasExtras;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public double getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}

	public String calculaHoraExtra() {
		this.horasExtras = ler.nextDouble();
		double totalH = (getSalarioFixo() / 220) / 0.100;
		return "O salario a receber é: " + ((totalH) + getSalarioFixo());
	}
}