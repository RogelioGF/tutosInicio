package estructurasCondicionales;

import java.util.*;

public class Ejercicio3 {
	/*Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) 
	mostrar un mensaje indicando si el número tiene uno o dos dígitos.
	(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)*/
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Dime un numero");
		num = teclado.nextInt();
		do {

			if(num>=10 && num<100) {
				System.out.println("El numero tiene dos digitos");
			}
			else if (num>=1 && num<10) {
				System.out.println("El numero tiene un digito");
			}

		}while (num <=0 && num>=100);



	}

}
