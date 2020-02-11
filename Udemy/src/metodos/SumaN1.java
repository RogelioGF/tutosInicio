package metodos;

import java.util.*;

public class SumaN1 {
	/*
	Crear una función que me devuelva la suma del 1 al numero pasado 
	por parámetro (este incluido). 
	Ejemplo, pasamos por teclado el 5 y suma todos los numeros anteriores y el 5 incluidos.
	 */
	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero:");
		num=teclado.nextInt();
		//realiza la suma del numero que le pasamos por teclado
		//en la primera forma almacenamos el valor en una variable llamada resultado
		//1 forma de llamada
		int resultado = sumaN1(num);
		System.out.println(resultado);
		//En la segunda forma imprime directamente el valor en consola 
		//sin almacenar previamente la suma como hicimos en el anterior.
		//2 forma de llamada
		System.out.println(sumaN1(num));
		teclado.close();
	}

	public static int sumaN1(int n) {

		int suma = 0;
		for (int i = 0; i <=n; i++) {
			suma+=i;
		}
		return suma;
	}

}
