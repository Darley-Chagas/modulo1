package aula5;

import java.util.Scanner;

public class ProgramaPrincipalMaior10 {

	public static void main(String[] args) {
		Scanner leitor= new Scanner(System.in);
		int n ;
		int maior = 0;
		int menor = 0;
		
		//Loop de 10 vezes
		for (int i=0; i<10; i=i+1) {
		
			System.out.println("Digite N"+(i+1)+":");
			n = leitor.nextInt();
			if(i==0) {
				maior = n;
				menor = n;
			}
			
			if(n>maior) {
				maior = n;
			}
			
			if(n<menor) {
				menor = n;
			}
		}
		System.out.println("O maior é: " + maior + " e o menor é: "+ menor);
		leitor.close();
	}

}
