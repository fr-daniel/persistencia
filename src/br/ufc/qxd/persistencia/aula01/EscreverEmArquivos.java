package br.ufc.qxd.persistencia.aula01;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class EscreverEmArquivos {

	public static final String ARQUIVO = "/home/daniel/ufc/persistencia/aula1/teste.txt";
	
	public static void main(String[] args) {
		
		try {
			OutputStream outputStream = new FileOutputStream(ARQUIVO, true);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			bufferedWriter.write("Java");
			bufferedWriter.newLine();
			
			bufferedWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			PrintStream printStream = new PrintStream(ARQUIVO);
			
			printStream.println("Sistemas de Informação");
			printStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
				
	}
	
}
