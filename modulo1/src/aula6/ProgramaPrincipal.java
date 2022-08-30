package aula6;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n;
		System.out.println("0 - Sair");
		do {
			System.out.println("Digite um número: ");
			n = leitor.nextInt();
			
		}while(n!=0);
			
		System.out.println("Programa Encerrado!");
		leitor.close();
			
			
		
		

	}

}
