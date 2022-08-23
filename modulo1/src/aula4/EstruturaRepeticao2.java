package aula4;

import java.util.Scanner;

public class EstruturaRepeticao2 {

	public static void main(String[] args) {
		
		
		
		double n, media, soma = 0;//declaração
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Média de quantos números?");
		int qtd = leitor.nextInt();
						
		for (int i = 0; i<qtd; i=i+1) {//substituindo i<3 por i<qtd
			//Entrada
			System.out.println("Digite N: ");
			n = leitor.nextDouble();
			soma = soma + n; //Soma atual com o n digitado
		}
		//Processamento
		media = soma /qtd;//substituindo 3 por qtd
		
		//Saída
		System.out.println("Média: " + media);
		

	}

}
