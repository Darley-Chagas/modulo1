package aula2;

public class Calculadora {
	
	double somar (double n1, double n2) {
		return n1+n2;
	}
	
	double subtrair (double n1, double n2) {
		return n1 - n2;
	}
	
	public Double dividir (double n1, double n2) {
		Double divisao=null;
		if(n1>0 && n2>0) {
			divisao = n1/n2;
		}
		return divisao;
		
	}
	
	double multiplicar (double n1, double n2) {
		return n1 * n2;
	}
	
	public Double calcular(Double n1, Double n2, Integer operacao) {
		Double calculo = null;
		
		if(operacao==1) {
			calculo = somar(n1, n2);
		}else {
			
			if(operacao==2) {
				calculo = subtrair(n1, n2);
			}else {
				
				if(operacao==3) {
					calculo = dividir(n1, n2);
				}else {
					
					calculo = multiplicar(n1, n2);
				}
			}
		}
		
		return calculo;
	}
	
	
	public boolean ehPar(int n) {
		if(n%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
