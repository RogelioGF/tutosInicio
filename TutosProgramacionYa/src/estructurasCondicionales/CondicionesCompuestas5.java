package estructurasCondicionales;

import java.util.Scanner;

public class CondicionesCompuestas5 {
	/*Escribir un programa que pida ingresar la coordenada de un punto en el plano,
	es decir dos valores enteros x e y (distintos a cero).
	Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. 
	(1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numX, numY;
		System.out.println("Dime coordenada X");
		numX=teclado.nextInt();
		System.out.println("Dime coordenada Y");
		numY=teclado.nextInt();

		if(numX > 0 && numY > 0) {
			System.out.println("Estas en el primer cuadrante " + numX + " " + numY);
		}else if (numX < 0 && numY > 0) {
			System.out.println("Estas en el segundo cuadrante " + numX + " " + numY);
		}else if (numX < 0 && numY < 0) {
			System.out.println("Estas en el tercer cuadrante " + numX + " " + numY);
		}else {
			System.out.println("Estas en el cuarto cuadrante " + numX + " " + numY);
		}

		teclado.close();

	}

}
