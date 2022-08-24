package aula5;
/*
 * Faça um programa que leia 
 * 3 números inteiros e imprima 
 * qual é o maior entre eles
 * 
 * */

import java.util.Scanner;

public class ProgramaPrincipalMaior3 {

	public static void main(String[] args) {
		
		//Objeto para leitura de dados
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite n1: ");
		int n1 = leitor.nextInt();
		
		System.out.println("Digite n2: ");
		int n2 = leitor.nextInt();
		

		System.out.println("Digite n3: ");
		int n3 = leitor.nextInt();
		
		int maior;
		
		if(n1>n2 && n1>n3) {
			maior = n1;
		}else if (n2>n1 && n2>n3){
			maior = n2;
		}else {
			maior = n3;
		}
			
		
		System.out.println("O maior é: " + maior);
		
		leitor.close();
	}

}
