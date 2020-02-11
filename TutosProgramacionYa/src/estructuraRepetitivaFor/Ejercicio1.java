package estructuraRepetitivaFor;

import java.util.*;

public class Ejercicio1 {
	/*Confeccionar un programa que lea n pares de datos, 
	cada par de datos corresponde a la medida de la base y la altura de un triángulo.
	El programa deberá informar:
	a) De cada triángulo la medida de su base, su altura y su superficie.
	b) La cantidad de triángulos cuya superficie es mayor a 12.*/
	public static void main(String[] args) {
		int base, altura, superficie, i, nTriangulos, contaMayor12 = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime cuantos triangulos quieres crear ");
		nTriangulos=teclado.nextInt();

		for(i=1;i<=nTriangulos;i++) {
			System.out.println("Dime la base");
			base=teclado.nextInt();
			System.out.println("Dime la altura");
			altura=teclado.nextInt();

			System.out.println("Trialgulo " + i + " Base " + base + " Altura " + altura + " Superfifice " + (superficie=base*altura/2));
			if (superficie>12) {
				contaMayor12++;
			}//if
		}//for
		System.out.println("Cantidad de triángulos cuya superficie es mayor a 12: " + contaMayor12);
		teclado.close();
	}

}
