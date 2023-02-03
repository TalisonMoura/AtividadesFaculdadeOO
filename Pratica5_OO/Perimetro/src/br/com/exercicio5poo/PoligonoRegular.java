package br.com.exercicio5poo;

public abstract class PoligonoRegular {
	private int numLados;
	private int tamLados;
	public PoligonoRegular(int numLados, int tamLados) {
		super();
		this.numLados = numLados;
		this.tamLados = tamLados;
	}
	public int getNumLados() {
		return numLados;
	}
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	public int getTamLados() {
		return tamLados;
	}
	public void setTamLados(int tamLados) {
		this.tamLados = tamLados;
	}
	public abstract float calcularArea();
	
	public float calcularPerimetro() {
		return (getNumLados()*getTamLados());
	}
	
}
