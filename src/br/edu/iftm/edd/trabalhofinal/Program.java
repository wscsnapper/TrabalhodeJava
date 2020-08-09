package br.edu.iftm.edd.trabalhofinal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Instanciar dicionario
		Dicionario dicionario = new Dicionario();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Dicionario!");
		System.out.println("Lista de palavras cadastradas:\n" + String.join(", ", dicionario.palavras()) + "\n\n");
		
		while(true) {
			// Receber entrada
			System.out.print("Insira um texto para pesquisar (-1 para parar): ");
			String linha = scanner.nextLine();
			
			// Validar
			if(linha.contentEquals("-1"))
				break;
			else if(linha.length() == 0)
				continue;
			
			// Procurar
			Palavra[] palavras = dicionario.procurar(linha);
			if(palavras.length > 0) {
				System.out.println("Palavras encontradas: ");
				for(int i = 0; i < palavras.length; i++)
					System.out.println((i + 1) + ": " + palavras[i].getPalavra());
				System.out.println("ou 0 para Sair");
				
				System.out.print("Escolha uma opcão: ");
				linha = scanner.nextLine();
				
				try {
					int op = Integer.parseInt(linha);
					if(op == 0)
						continue;
					
					op--;
					System.out.println("\n" + palavras[op].toString() + "\n\n");
				}
				catch(Exception e) {
					 System.out.println("Opção não encontrada.\n");
				}
			}
			else {
				System.out.println("Nenhuma palavra encontrada.\n");
			}
		}		
		
		scanner.close();
	}

}
