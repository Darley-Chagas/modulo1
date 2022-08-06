package aula1;

public class ProjetoCarro {

	public static void main(String[] args) {
		
		
			Carro carro1 = new Carro();//Cópia da ficha em branco
			carro1.marca="volks";//Preenchendo os campos
			carro1.modelo="gol";
			carro1.cor="branco";
			carro1.ano=2019;
			
			//Imprimindo os dados do objeto 
			System.out.println(" Marca: " + carro1.marca + " Modelo: " + carro1.modelo + " Cor: " + carro1.cor + " Ano: " + carro1.ano);
			
			Carro carro2 = new Carro();//Cópia da ficha
			carro2.marca="Chevrolet";//Preenchendo os campos
			carro2.modelo="Prisma";
			carro2.cor="Vermelho";
			carro2.ano=2020;
			
			System.out.println("Marca: " + carro2.marca + " Modelo: " + carro2.modelo + " Cor: " + carro2.cor + " Ano: " + carro2.ano);

	}

}
