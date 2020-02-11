package estructuraRepetitivaDoWhile;

import java.util.*;

public class Ejercicio1 {
	/*Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 
	(no sumar dicho valor, indica que ha finalizado la carga).
	Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.*/
	public static void main(String[] args) {
		int suma = 0, num;
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("Dime valores numericos (9999 para salir) ");
			num=teclado.nextInt();
			if(num!=9999) {
				suma+=num;
			}


		}while (num!=9999);
		System.out.println("Ha finalizado la carga");

		System.out.println("El valor acumulado es: " + suma);

		if(suma==0) System.out.println("Su valor es CERO ");
		else if (suma>0)System.out.println("Su valor es MAYOR A CERO ");
		else System.out.println("Su valor es MENOR A CERO ");
		teclado.close();
	}

}
