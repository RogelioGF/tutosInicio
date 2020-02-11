package estructuraRepetitivaFor;

import java.util.*;

public class Ejercicio2 {
	/*Desarrollar un programa que solicite la carga de 10 números 
	e imprima la suma de los últimos 5 valores ingresados.*/
	public static void main(String[] args) {
		int num, suma=0;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i<10; i++) {
			System.out.println("Dime un numero");
			num=teclado.nextInt();
			if(i>=5) {
				suma+=num;
			}//if
		}//for
		System.out.println("La suma de los últimos 5 valores ingresados es: " + suma);
		teclado.close();
	}

}
