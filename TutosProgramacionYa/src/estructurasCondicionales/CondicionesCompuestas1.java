package estructurasCondicionales;

import java.util.*;

public class CondicionesCompuestas1 {
	/*Realizar un programa que pida cargar una fecha cualquiera, 
	luego verificar si dicha fecha corresponde a Navidad.*/
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int dia, mes;
		System.out.println("Dime un dia");
		dia=teclado.nextInt();
		System.out.println("Dime un mes");
		mes=teclado.nextInt();
		
		
		if (dia==25 && mes==12)System.out.println("Es navidad!");
		else System.out.println("No es navidad");
		
		teclado.close();
	}

}
