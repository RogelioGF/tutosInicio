package estructurasCondicionales;

import java.util.*;

public class Ejercicio3 {
	/*Se ingresa por teclado un n�mero positivo de uno o dos d�gitos (1..99) 
	mostrar un mensaje indicando si el n�mero tiene uno o dos d�gitos.
	(Tener en cuenta que condici�n debe cumplirse para tener dos d�gitos, un n�mero entero)*/
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
