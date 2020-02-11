package estructurasCondicionales;

import java.util.*;

public class Ejercicio4 {
	//	Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Dime el primer numero");
		num1=teclado.nextInt();
		System.out.println("Dime el segundo numero");
		num2=teclado.nextInt();
		System.out.println("Dime el tercer numero");
		num3=teclado.nextInt();


		if(num1>num2 && num1>num3)System.out.println("El numero mayor es: " + num1);
		else if (num2>num1 && num2>num3) System.out.println("El numero mayor es: " + num2);
		else System.out.println("El numero mayor es: " + num3);
		teclado.close();
	}

}
