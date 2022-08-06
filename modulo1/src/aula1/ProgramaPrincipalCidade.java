package aula1;

public class ProgramaPrincipalCidade {

	public static void main(String[] args) {
		Cidade cidade1 = new Cidade();
		cidade1.nome = "Rondonópolis";
		cidade1.uf = "MT";
		
		System.out.println("A cidade de " + cidade1.nome + " fica localizado no estado de " + cidade1.uf);

	}

}
