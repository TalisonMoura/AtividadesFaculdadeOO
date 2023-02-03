package br.com.exercicioArquivos;

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class ArquivoSobrenome {
	public static ArrayList<String> leitor(String path2) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path2));
		int i=0;
		String linha = "";
		ArrayList<String> sobrenome = new ArrayList<String>();
		for ( i = 0; i < 10; i++) {
			if (linha != null) {
				linha = buffRead.readLine();
				System.out.println(linha);
				sobrenome.add(linha);
			}
		}
		buffRead.close();
		return sobrenome;
	}

	public static void escritor(String path2) throws IOException {
		/*
		 * BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path2)); String
		 * linha = ""; Scanner in = new Scanner(System.in); linha = in.nextLine();
		 * System.out.println("Escreva Algo: "); buffWrite.append(linha + "\n");
		 * buffWrite.close();
		 */
	}

}
