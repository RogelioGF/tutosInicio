package controlFlujo;

import java.util.*;

public class MediaEnPosicionesParesDelArray {
	/*En este ejercicio, se pide al usuario que introduzca 10 n�meros enteros por consola. 
	Los n�meros se almacenar�n en un array y el programa calcular� la media 
	de los n�meros introducidos en las posiciones pares del array.
	(Debes utilizar el operador m�dulo �%�).*/
	public static void main(String[] args) {
		int []num = new int [10];
		Scanner teclado = new Scanner(System.in);	
		int contaPares=0, suma = 0;
		for (int i = 0; i<num.length;i++) {
			System.out.println("Dime numeros: ");
			num[i]=teclado.nextInt();
			if (i%2==0 && i!=0) {
				contaPares++;
				System.out.println("Numero en posicion par: " + num[i]);
				suma+=num[i];
			}//if

		}//for

		System.out.println("Total de valores del array: " + Arrays.toString(num));
		System.out.println("Media de los valores en las posiciones pares: " + suma/contaPares);
		teclado.close();
	}//main

}
