package tests;

import java.util.Scanner;

import source.LogWriter;

public class TesteInicial {

	public static void main(String args[]){
		
		LogWriter logger = new LogWriter("log_de_teste");

		// SCANNER = CLASSE DE ENTRADA DE DADOS
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite seu nome!");
		String nome = entrada.nextLine();
		
		logger.write(nome);
		
		System.out.println("Digite sua idade!");
		int idade = entrada.nextInt();
		
		logger.write(String.valueOf(idade));
		
		System.out.println("Digite sua nota na prova de JAVA");
		double nota = entrada.nextDouble();
		
		logger.write(String.valueOf(nota));
		
	}
	
}
