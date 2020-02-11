package controlFlujo;

import java.util.*;

public class NumFactorial {
	/*En este ejercicio, se pide el c�lculo del factorial de un n�mero introducido por el usuario
	desde una ventana JOptionPane. El factorial de un n�mero es igual a ese n�mero multiplicado 
	por todos los que le preceden. Por ejemplo, el factorial de 5 es igual a 5x4x3x2x1, es decir, 120.*/
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num = teclado.nextInt();
		int factorial = num;
		for (int i = num-1; i >0; i--) {

			factorial = factorial * i;

		}

		System.out.println("El factorial de " + num + " es " + factorial);
		teclado.close();
	}

}
