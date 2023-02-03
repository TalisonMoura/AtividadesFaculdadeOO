package br.com.exercicioArquivos;

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class NomSob {
	public static void leitor(String path3) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path3));
		/*
		 * ArrayList<String> nomSob = new ArrayList<String>(); for (int i = 0; i < 10;
		 * i++) { String linha = ""; if (linha != null) { linha = buffRead.readLine();
		 * System.out.println(linha);
		 * 
		 * } } buffRead.close();
		 */
	}

	public static void escritor(String path3, ArrayList<String> nomes, ArrayList<String> sobrenome) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path3));
		int i = 0;
		
			String linha = "";
			for (i = 0; i < 10; i++) {	
			linha = nomes.get(i) + " " + sobrenome.get(i);
			buffWrite.append(linha + "\n");
			}
			buffWrite.close();
	}
}