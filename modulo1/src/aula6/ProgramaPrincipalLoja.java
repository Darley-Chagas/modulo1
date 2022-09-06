package aula6;

import java.util.Scanner;

public class ProgramaPrincipalLoja {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Loja lojinhaDaMaria = new Loja();
		
		System.out.println("Quantidade de cliente: ");
		int qtd = leitor.nextInt();
		
		lojinhaDaMaria.setQuantidadeClientes(qtd);
		
		
		Cliente jao =  new Cliente();
		jao.nome = "Jão";
		jao.sexo = 'M';
		jao.idade = 50;
		
		Cliente maria = new Cliente();
		maria.nome = "Maria";
		maria.sexo = 'F';
		maria.idade = 30;
		
		
		lojinhaDaMaria.adicionarCliente(jao);
		lojinhaDaMaria.adicionarCliente(maria);
		
		lojinhaDaMaria.imprimirTodos();
		

	}

}
