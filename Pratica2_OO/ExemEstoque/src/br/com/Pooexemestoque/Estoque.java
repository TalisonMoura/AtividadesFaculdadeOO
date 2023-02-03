package br.com.Pooexemestoque;

public class Estoque {

	private String nome;			///////
	private int qtdAtual;				//////	Atributos da classe;
	private int qtdMinima;			///////
	public Estoque()	{
				
	}
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		//super();
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
			// o operador "this" referência os atributos da própia classe;
			// o "SET" é um metodo para alterar o valor do conteúdo;
			// o "GET" é um metodo para retornar um conteúdo do Atributo;
	}
		// Para gerar os metodos GETTERS AND SETTERS, comando ctrl + 3 "GGAS", e selecionar os atributos ;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getQtdAtual() {
			return qtdAtual;
		}
		public void setQtdAtual(int qtdAtual) {
			this.qtdAtual = qtdAtual;
		}
		public int getQtdMinima() {
			return qtdMinima;
		}
		public void setQtdMinima(int qtdMinima) {
			this.qtdMinima = qtdMinima;
		}
	
		public void darBaixa(int qtde)	{
			//this.qtdAtual -= qtde;
			if	(qtde<=this.qtdAtual)
			this.qtdAtual-=qtde;
			else
				System.out.println("Estoque com saldo insuficiente");
		}		
		public boolean precisaRepor()	{
			if (this.qtdAtual<=this.qtdMinima)
				return true;
			else
				return false;
		}
		public String mostra()	{
			return	"Produto: " + getNome() + "\nEstoque Atual: " + getQtdAtual() + "\nEstoque Minimo: " + getQtdMinima();
		}





}
