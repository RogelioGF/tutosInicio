package estructurasCondicionales;

import java.util.*;

public class Ejercicio6 {
	/*
	Confeccionar un programa que permita cargar un número entero positivo 
	de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
	Mostrar un mensaje de error si el número de cifras es mayor.
	*/
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Dime un numero");
		num = teclado.nextInt();
		
		if(num >=0 && num <10 ) System.out.println("El numero " + num + " tiene un digito");
		else if(num>=10 && num < 100)System.out.println("El numero " + num + " tiene dos digitos");
		else if (num>=100 && num<1000)System.out.println("El numero " + num + " tiene tres digitos");
		else System.out.println("ERROR el numero de cifras es mayor");
		
		teclado.close();
	}

}
