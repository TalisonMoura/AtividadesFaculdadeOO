package br.com.exercicio5poo;

public class Triangulo extends PoligonoRegular {
	private float calcularArea;

	public Triangulo(int numLados, int tamLados, float calcularArea) {
		super(numLados, tamLados);
		this.calcularArea = calcularArea;
	}
	public float calcularArea()	{
		return calcularPerimetro()/2;
	}
}
