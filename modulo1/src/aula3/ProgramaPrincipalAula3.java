package aula3;

import java.util.Scanner;

import aula2.Calculadora;

public class ProgramaPrincipalAula3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		/*System.out.println("Digite um número: ");
		boolean r = calc.ehPar(leitor.nextInt());
		
		System.out.println(r);*/
		
		//leitor.close();
		
		System.out.println("Digite A: ");
		Double a = leitor.nextDouble();
		
		System.out.println("Digite B: ");
		Double b = leitor.nextDouble();
		
		System.out.println("Operação (1=Soma, 2=Subtração, 3=Divisão, 4=multiplicação)");
		Integer op = leitor.nextInt();
		
		Double r = calc.calcular (a, b, op);
		System.out.println("A divisão é " + r);
		
		leitor.close();
	}
	

}
