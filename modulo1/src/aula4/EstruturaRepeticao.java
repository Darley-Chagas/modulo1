package aula4;

import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {
		
		/*for (int i = 0 ; i<3 ; i = i+1) {
		System.out.println("oi " + i);
		}*/
		
		double n1, n2, n3, media;//declaração
		
		Scanner leitor = new Scanner(System.in);
		//Entrada
		System.out.println("Digite N1: ");
		n1 = leitor.nextDouble();
		
		System.out.println("Digite N2: ");
		n2 = leitor.nextDouble();
		
		System.out.println("Digite N2: ");
		n3 = leitor.nextDouble();
		
		//Processamento
		media = (n1+n2+n3)/3;
		
		//Saída
		System.out.println("Média "+ media);

	}

}
