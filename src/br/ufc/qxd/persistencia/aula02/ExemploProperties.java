package br.ufc.qxd.persistencia.aula02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ExemploProperties {

	public static final String ARQUIVO = "/home/daniel/ufc/persistencia/aula1/teste.txt";


	public static void main(String[] args) {
		try {
			exemploProperties();
			exemploLerProperties();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void exemploProperties() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.setProperty("aluno", "daniel");
		properties.setProperty("faculdade", "UFC");
		properties.setProperty("salario", "11");
		
		String aluno = properties.getProperty("aluno");
		String faculdade = properties.getProperty("faculdade");
		double salario = Double.parseDouble(properties.getProperty("salario"));
			
	}
	
	public static void exemploEscreverProperties() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.setProperty("aluno", "daniel");
		properties.setProperty("faculdade", "UFC");
		properties.setProperty("salario", "11");
		
		String aluno = properties.getProperty("aluno");
		String faculdade = properties.getProperty("faculdade");
		double salario = Double.parseDouble(properties.getProperty("salario"));
		
		properties.store(new FileOutputStream(ARQUIVO), null);
	}
	
	public static void exemploLerProperties() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileOutputStream(ARQUIVO));
		
		String aluno = properties.getProperty("aluno");
		String faculdade = properties.getProperty("faculdade");
		double salario = Double.parseDouble(properties.getProperty("salario"));
		
		System.out.println("Aluno: " + aluno);
		System.out.println("Faculdade: " + faculdade);
		System.out.println("Salário: " + salario);
	}
}
