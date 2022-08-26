package aula5;

import java.util.Scanner;

import aula2.Calculadora;

public class ProgramaPrincipalMaior10_2 {

	public static void main(String[] args) {
		
		//Leitura
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números: ");
		int qtd = leitor.nextInt();
		
		Calculadora calc = new Calculadora();
		calc.maiorMenor(qtd);
		
		

}
}
