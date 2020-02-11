package estructurasCondicionales;

import java.util.*;

public class Ejercicio1 {
	/*
	Realizar un programa que lea por teclado dos números, 
	si el primero es mayor al segundo informar su suma y diferencia, 
	en caso contrario informar el producto y la división del primero respecto al segundo.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();

		int suma = 0, diferencia = 0, producto = 0, division = 0;

		if(num1 > num2) {
			suma = num1 + num2;
			diferencia = num1 - num2;
			System.out.println("La suma del " + num1 + " y el " + num2 + " = " + suma);
			System.out.println("La resta del " + num1 + " y el " + num2 + " = " + diferencia);
		}else {
			producto = num1 * num2;
			division = num1 / num2;
			System.out.println("El producto del " + num1 + " y el " + num2 + " = " + producto);
			System.out.println("La division del " + num1 + " y el " + num2 + " = " + division);
		}
		teclado.close();
	}

}
