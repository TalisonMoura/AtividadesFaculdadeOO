package br.com.exercicioArquivos;

import java.io.IOException;
import java.util.ArrayList;

public class MainNomSob {
	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\talis\\Downloads\\nomes.txt";
		String path2 = "C:\\Users\\talis\\Downloads\\Sobrenome.txt";
		String path3 = "C:\\Users\\talis\\Downloads\\nomeSobre.txt";
		ArrayList<String> nomes = new ArrayList<String>(ArquivoNome.leitor(path1));
		ArrayList<String> sobrenome = new ArrayList<String>(ArquivoSobrenome.leitor(path2));

		NomSob.escritor(path3, nomes, sobrenome);

	}
}
