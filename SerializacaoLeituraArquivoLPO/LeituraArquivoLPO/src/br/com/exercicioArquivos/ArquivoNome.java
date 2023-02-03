package br.com.exercicioArquivos;

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ArquivoNome {
	public static ArrayList<String> leitor(String path1) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path1));
		String linha = "";
		int i=0;
		ArrayList<String> nomes = new ArrayList<String>();
		for (i = 0; i < 10; i++) {
			if (linha != null) {
				linha = buffRead.readLine();
				System.out.println(linha);
				nomes.add(linha);
			}
		}
		buffRead.close();
		return nomes;
	}

	public static void escritor(String path1) throws IOException {
		/*
		 * BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path1)); String
		 * linha = ""; Scanner in = new Scanner(System.in);
		 * System.out.println("Escreva Algo: "); linha = in.nextLine();
		 * buffWrite.append(linha + "\n"); buffWrite.close();
		 */
	}

}