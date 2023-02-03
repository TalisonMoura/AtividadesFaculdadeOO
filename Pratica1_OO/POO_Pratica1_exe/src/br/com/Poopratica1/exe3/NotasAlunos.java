package br.com.Poopratica1.exe3;

public class NotasAlunos {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ads","Ana",123,3,20,30,0);
		System.out.println(a1.avaliarAluno());
		System.out.println(a1.avaliarRecuperacao());
		a1.alteraNotaAE(70);
		System.out.println("Altera nota da Prova Especial");
		System.out.println(a1.avaliarRecuperacao());
	}

}
