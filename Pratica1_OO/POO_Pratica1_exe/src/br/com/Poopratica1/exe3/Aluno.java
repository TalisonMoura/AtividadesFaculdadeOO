package br.com.Poopratica1.exe3;

public class Aluno {

	private String nome;
	private String curso;
	private int matricula;
	private int periodo;
	private double notaAV1,notaAV2,notaAE;
	
	// crtl + 3 gcuf para gerar novo construtor.
	public Aluno(String curso, String nome, int matricula, int periodo, double notaAV1, double notaAV2, double notaAE) {
		super();	//a classe super não irá interferir no processo quando houver apenas uma classe.
		this.curso = curso;
		this.nome = nome;
		this.matricula = matricula;
		this.periodo = periodo;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
	}
	public void alteraNotaAV1(double nota)	{
		this.notaAV1 = nota;
	}
	public void alteraNotaAV2(double nota) {
		this.notaAV2 = nota;
	}
	public void alteraNotaAE(double nota) {
		this.notaAE = nota;
	}
	
	public String avaliarAluno()	{
		if((this.notaAV1+this.notaAV2)>60)	
			return "Aprovado";
		else
			return "Recuperacao";
	}
	public String avaliarRecuperacao()	{
		if	((this.notaAV1+this.notaAV2+this.notaAE)/2>=60)
			return	"Aprovado";
		else
			return	"Reprovado";
	}
		
}
