package estructuraRepetitivaFor;

import java.util.*;

public class Ejercicio7 {
	/*Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
	a) La cantidad de valores ingresados negativos.
	b) La cantidad de valores ingresados positivos.
	c) La cantidad de múltiplos de 15.
	d) El valor acumulado de los números ingresados que son pares.*/
	public static void main(String[] args) {
		int num, negativos = 0, positivos = 0, mult15 = 0, contaPares = 0;
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			System.out.println("Dime un numero");
			num=teclado.nextInt();
			if (num<0) {
				negativos++;
			}else if (num>0) {
				positivos++;
			}else if(num%2==0) {
				contaPares++;
			}else if (num%15==0) {
				mult15++;
			}//else
		}//for
		System.out.println("Cantidad de valores ingresados negativos " + negativos);
		System.out.println("Cantidad de valores ingresados positivos " + positivos);
		System.out.println("Cantidad de múltiplos de 15 " + mult15 );
		System.out.println("Números ingresados que son pares " + contaPares);
		teclado.close();
	}//main

}
