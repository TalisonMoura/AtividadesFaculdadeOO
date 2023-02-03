package br.com.exercicio4poo;

public class Funcionario {
	private String nome;
	private String rg;

	public Funcionario(String nome, String rg) {
		super();
		this.nome = nome;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void salario(double valor) {

	}

}
