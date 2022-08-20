package aula3;

public class FiguraGeometrica {
	
public String identificarTriangulo(int a, int b, int c) {
		
		if(a!=b && b!=c && c!=a) {
			return "Escaleno";
		}else {
			
			if(a==b && b==c && c==a) {
				return "Equilatero";
			}else {
				return "Isosceles";
			}
		}
	}

}
