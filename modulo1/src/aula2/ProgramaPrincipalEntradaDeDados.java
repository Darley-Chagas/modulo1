package aula2;

import java.util.Scanner;

public class ProgramaPrincipalEntradaDeDados {

	public static void main(String[] args) {
			
			//Entrada de dados pelo teclado
			Scanner leitor = new Scanner(System.in);
			
			//Saída
			System.out.println("Nome: ");
			
			//Entrada
			String textoDigitado = leitor.next();
			
			
			//Saída
			System.out.println("Você digitou " + textoDigitado);
			
			Calculadora calc = new Calculadora();
			
			System.out.println("Digite n1:");
			int n1 = leitor.nextInt();//leitura(entrada)
			
			System.out.println("Digite n2: ");
			int n2 = leitor.nextInt();//leitura(entrada)
			
			int s = calc.somar(n1, n2);//calculo(processamento)
			
			System.out.println("A soma é: " + s);//impressão (saída)
			
			leitor.close();//encerramento
			
		

	}	

}
