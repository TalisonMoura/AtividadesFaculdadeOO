package br.com.Pooexemrendimento;
public class Rendimento {

	private double investInicial;
	private double taxaRendimento;
	private int numMeses;
	public Rendimento(double investIncicial, double taxaRendimento, int numMeses) {
		super();
		this.investInicial = investIncicial;
		this.taxaRendimento = taxaRendimento;
		this.numMeses = numMeses;
	}
	public double getInvestInicial() {
		return investInicial;
	}
	public void setInvestInicial(double investInicial) {
		this.investInicial = investInicial;
	}
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	public int getNumMeses() {
		return numMeses;
	}
	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
	}
	
	public String RendMes()	{
		System.out.println("Investimento Inicial:  " +getInvestInicial()+"\nPercentual Mensal:  " + getTaxaRendimento());
		for (int i = 0;i<getNumMeses();i++)	{
			this.investInicial *= 1+(this.taxaRendimento/100);
				System.out.printf("\nMes " + (i+1) + " : %.2f" ,getInvestInicial());
		}
		
			return null;
	}
	
	
}
