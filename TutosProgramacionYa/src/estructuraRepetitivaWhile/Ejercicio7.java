package estructuraRepetitivaWhile;

import java.util.*;

public class Ejercicio7 {
	/*Realizar un programa que permita cargar dos listas de 15 valores cada una.
	Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor 
	(mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
	Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.*/
	public static void main(String[] args) {
		int contaLista1= 0, contaLista2 = 0, x=1, y=1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valores de la primera lista");
		
		while (x<=15) {
			System.out.println("ingrese un valor");
			int valor = teclado.nextInt();
			contaLista1+=valor;
			x++;
		}//while
		System.out.println("Valores para la segunda lista");
		while (y<=15) {
			System.out.println("ingrese un valor");
			int valor = teclado.nextInt();
			contaLista2+=valor;
			y++;
		}//while
		if(contaLista1>contaLista2) {
			System.out.println("Lista 1 mayor");
		}else if(contaLista2>contaLista1){
			System.out.println("Lista 2 mayor");
		}else {
			System.out.println("Listas iguales");
		}
		
		teclado.close();
	}

}
