package br.com.exercicio4poo;

public class Automovel {
	private String abs;
	private String airBag;
	private String alarme;
	private String som;
	private String conjEletrico;
	private String cpuEletrico;
	private double preçoBaseAutomovel=30.000;

	public Automovel(String abs, String airBag, String alarme, String som, String conjEletrico, String cpuEletrico,double preçoBaseAutomovel) {
		super();
		this.abs = abs;
		this.airBag = airBag;
		this.alarme = alarme;
		this.som = som;
		this.conjEletrico = conjEletrico;
		this.cpuEletrico = cpuEletrico;
		this.preçoBaseAutomovel = preçoBaseAutomovel;
	}

	public String getAbs() {
		return abs;
	}

	public void setAbs(String abs) {
		this.abs = abs;
	}

	public String getAirBag() {
		return airBag;
	}

	public void setAirBag(String airBag) {
		this.airBag = airBag;
	}

	public String getAlarme() {
		return alarme;
	}

	public void setAlarme(String alarme) {
		this.alarme = alarme;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getConjEletrico() {
		return conjEletrico;
	}

	public void setConjEletrico(String conjEletrico) {
		this.conjEletrico = conjEletrico;
	}

	public String getCpuEletrico() {
		return cpuEletrico;
	}

	public void setCpuEletrico(String cpuEletrico) {
		this.cpuEletrico = cpuEletrico;
	}

	public double getPreçoBaseAutomovel() {
		return preçoBaseAutomovel;
	}

	public void setPreçoBaseAutomovel(double preçoBaseAutomovel) {
		this.preçoBaseAutomovel = preçoBaseAutomovel;
	}
	public void calcularPrecoFinal()	{
			
		if (this.preçoBaseAutomovel*15/100)	{
			return abs;
		}
	
	
	
	
	
	
	
	
	
	
	}
}
