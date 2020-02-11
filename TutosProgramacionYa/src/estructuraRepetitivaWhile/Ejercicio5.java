package estructuraRepetitivaWhile;

public class Ejercicio5 {
	//	Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.
	public static void main(String[] args) {
		int x=1, resultado=0;
		
		while(x<=500) {
			int num=8;
			resultado = num *= x;
			System.out.println(resultado);
			x++;
		}
		
	}

}
