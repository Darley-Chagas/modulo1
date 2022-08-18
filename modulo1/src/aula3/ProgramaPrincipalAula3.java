package aula3;

import java.util.Scanner;

import aula2.Calculadora;

public class ProgramaPrincipalAula3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		System.out.println("Digite um número: ");
		boolean r = calc.ehPar(leitor.nextInt());
		
		System.out.println(r);
		
		leitor.close();
	}
}
