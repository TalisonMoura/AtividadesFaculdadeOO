package br.com.exercicioLeituraArquivos;

import java.io.IOException;

public class MainArquivo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\12114853\\Downloads\\teste.txt";
        ManipuladorArquivos.escritor(path);
        ManipuladorArquivos.leitor(path);
    }
}