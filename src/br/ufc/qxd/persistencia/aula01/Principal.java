package br.ufc.qxd.persistencia.aula01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Principal {
	
	public static final String ARQUIVO = "/home/daniel/ufc/persistencia/aula1/teste.txt";
	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		try {
			InputStream inputStream = new FileInputStream(ARQUIVO);
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			StringBuilder stringBuilder = new StringBuilder();
			
			while(bufferedReader.ready()) {
				stringBuilder.append(bufferedReader.readLine() + "\n");
			}
			
//			int b = inputStream.read();
			
//			System.out.println(b);
			
//			char buffer[] = new char[1000];
//			inputStreamReader.read(buffer);
			
//			
//			String s = new String(buffer);
//			System.out.println(s);
			
			System.out.println(stringBuilder);
			
			bufferedReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// Lendo arquivo com um objeto Scanner
		try {
			InputStream inputStream = new FileInputStream(ARQUIVO);
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			StringBuilder stringBuilder = new StringBuilder();
			
			while(bufferedReader.ready()) {
				stringBuilder.append(bufferedReader.readLine() + "\n");
			}
			
//			int b = inputStream.read();
			
//			System.out.println(b);
			
//			char buffer[] = new char[1000];
//			inputStreamReader.read(buffer);
			
//			
//			String s = new String(buffer);
//			System.out.println(s);
			
			System.out.println(stringBuilder);
			
			bufferedReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Utilizando o InputStram para ler dados do teclado
		
		try {
			InputStream inputStream = System.in;
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			StringBuilder stringBuilder = new StringBuilder();
			
			while(stringBuilder.length() <= 10) {
				stringBuilder.append(bufferedReader.readLine() + "\n");
			}
			
			System.out.println(stringBuilder);
			
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
