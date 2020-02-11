package estructuraRepetitivaWhile;

import java.util.*;

public class Ejercicio6 {
	/*Desarrollar un programa que permita cargar n números enteros y 
	luego nos informe cuántos valores fueron pares y cuántos impares.
	Emplear el operador ?%? en la condición de la estructura condicional:*/
	public static void main(String[] args) {

		int num, x = 1, contPares = 0, contImpares = 0;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in); 
		System.out.print("Hasta que numero quieres cargar?");
		num=teclado.nextInt();

		while (x<=num) {
			System.out.println("Dime un valor");
			int valor = teclado.nextInt();
			if(valor%2 == 0) {
				System.out.println("El numero " + valor + " es un numero par");
				contPares++;
			}else {
				System.out.println("El numero " + valor + " es un numero impar");
				contImpares++;
			}
			x++;
		}//while

		System.out.println("Tenemos un total de " + contPares + " numeros pares");
		System.out.println("Tenemos un total de " + contImpares + " numeros impares");

	}

}
