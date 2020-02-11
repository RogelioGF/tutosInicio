package estructuraRepetitivaFor;

import java.util.*;

public class Ejercicio4 {
	/*Confeccionar un programa que permita ingresar un valor del 1 al 10 
	y nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
	Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.*/
	public static void main(String[] args) {
		int num, i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero del 1 al 10");
		num=teclado.nextInt();
		for(i=1;i<=12;i++) {
			int resultado = num * i;
			System.out.println(num + " x " + i + " = " + resultado);
		}
			
		teclado.close();
	}

}
