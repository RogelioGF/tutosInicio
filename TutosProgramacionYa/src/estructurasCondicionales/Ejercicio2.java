package estructurasCondicionales;

import java.util.*;

public class Ejercicio2 {
	/*Se ingresan tres notas de un alumno, 
	si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Dime un numero");
		num1 = teclado.nextInt();
		System.out.println("Dime otro numero");
		num2 = teclado.nextInt();
		System.out.println("Dime un numero mas");
		num3 = teclado.nextInt();
		
		int promedio = 0, suma = 0;
		
		suma = num1+num2+num3;
		promedio= suma/3;
		
		if(promedio>=7) System.out.println("Promocionado");
		else System.out.println("Tu nota es inferior a 7, NO estas promocionado");
		teclado.close();
	}

}
