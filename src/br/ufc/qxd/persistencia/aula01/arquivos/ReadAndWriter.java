package br.ufc.qxd.persistencia.aula01.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadAndWriter {

	public static final String ARQUIVO = "/home/daniel/ufc/persistencia/aula1/read_writer.txt";
	
	public static void main(String[] args) {		
		
		try {
			InputStream inputStream = System.in;
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			OutputStream outputStream = new FileOutputStream(ARQUIVO, true);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			String s = bufferedReader.readLine();
			
			while (!s.isEmpty()) {
				bufferedWriter.write(s + "\n");
				s = bufferedReader.readLine();
			}
			
			bufferedReader.close();
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void exemploLerDoTecladoEEscreverEmArquivo() {
		Scanner scanner = new Scanner(System.in);
		try {
			PrintStream printStream = new PrintStream(ARQUIVO);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
