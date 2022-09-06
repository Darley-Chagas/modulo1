package aula6;

import java.util.Scanner;

public class ProgramaPrincipalLoja {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Loja lojinhaDaMaria = new Loja();
		
		System.out.println("Quantidade de cliente: ");
		int qtd = leitor.nextInt();
		
		lojinhaDaMaria.setQuantidadeClientes(qtd);
		
		for(int i = 0; i<qtd; i++) {
		Cliente cli =  new Cliente();
			System.out.println("Nome: ");
			cli.nome = leitor.next();
			
			System.out.println("Sexo: ");
			cli.sexo = leitor.next().charAt(0);
			
			System.out.println("Idade: ");
			cli.idade = leitor.nextInt();
		
			lojinhaDaMaria.adicionarCliente(cli);
		}
		
		lojinhaDaMaria.imprimirTodos();
		
		leitor.close();
		
	}
		
}
		


