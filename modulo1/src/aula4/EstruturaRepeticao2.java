package aula4;

import java.util.Scanner;

import aula2.Calculadora;

public class EstruturaRepeticao2 {

	public static void main(String[] args) {
		
		
		
		double n, mediaResposta, soma = 0;//declaração
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Média de quantos números?");
		int qtd = leitor.nextInt();
		
		Calculadora calc = new Calculadora();
		mediaResposta = calc.media(qtd);
		
		
		//Saída
		System.out.println("Média: " + mediaResposta);
		

	}

}
