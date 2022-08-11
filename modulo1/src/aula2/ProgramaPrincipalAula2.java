package aula2;

public class ProgramaPrincipalAula2 {

	public static void main(String[] args) {
		
		Cliente c1, c2, c3;
		
		c1 = new Cliente();
		c1.nome="João";
		c1.cpf="001.110.221-10";
		c1.rg="23299281";
		c1.peso=70.0; //Double
		c1.altura=1.70; //Double
		c1.ativado=true;
		
		c2 = new Cliente();
		c2.nome="Rafael";
		c2.cpf="221.112.343-56";
		c2.rg="2123453";
		c2.peso=78.5;
		c2.altura=1.80;
		c2.ativado=false;
		
		c3 = new Cliente();
		c3.nome = "Darley";
		c3.cpf = "999.888.777-22";
		c3.rg = "2221123";
		c3.peso = 70.0;
		c3.altura = 1.71;
		c3.ativado = true;

	}

}
