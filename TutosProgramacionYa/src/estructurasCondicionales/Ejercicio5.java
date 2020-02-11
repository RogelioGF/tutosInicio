package estructurasCondicionales;

import java.util.*;

public class Ejercicio5 {
	//	Se ingresa por teclado un valor entero, 
	//	mostrar una leyenda que indique si el número es positivo, nulo o negativo.
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Dime un numero");
		num = teclado.nextInt();

		if(num >=0) System.out.println("El numero es positivo");
		else System.out.println("El numero es negativo");

		teclado.close();
	}

}
