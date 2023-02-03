package br.com.exercicio5poo;

public class Quadrado extends PoligonoRegular{
	private float calcularArea;

	public Quadrado(int numLados, int tamLados, float calcularArea) {
		super(numLados, tamLados);
		this.calcularArea = calcularArea;
	}
	public float calcularArea()	{
		return  (getNumLados()*getTamLados());
	}
}
