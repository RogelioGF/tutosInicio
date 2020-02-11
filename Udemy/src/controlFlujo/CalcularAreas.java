package controlFlujo;

import java.util.*;

/*programa que permita calcular las áreas de cuatro figuras geométricas 
 *con datos introducidos por consola*/

public class CalcularAreas {

	public static void main(String[] args) {

		int figura;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Elige una figura para calcular su área:");
		System.out.printf("\n 1.Cuadrado\n 2.Rectángulo\n 3.Tríangulo\n 4.Círculo");
		figura=teclado.nextInt();

		switch (figura) {
		case 1:
			System.out.println("Vamos a calcular el área de un Cuadrado (Lado al cuadrado)");
			System.out.println("Dime cuanto mide el lado:");
			int lado;
			lado=teclado.nextInt();
			System.out.println("El resultado del área del Cuadrado es: " + Math.pow(lado, 2));
			break;
		case 2:
			System.out.println("Vamos a calcular el área de un Rectángulo (Base por la Altura)");
			System.out.println("Dime la Base:");
			int base;
			base=teclado.nextInt();
			System.out.println("Dime la Altura");
			int altura;
			altura=teclado.nextInt();
			System.out.println("El ára del Rectángulo es: " + (base*altura));
			break;
		case 3:
			System.out.println("Vamos a calcular el ára de un Triángulo (base por altura partido por 2)");
			System.out.println("Dime la base");
			base=teclado.nextInt();
			System.out.println("Dime la Altura");
			altura=teclado.nextInt();
			System.out.println("El ára del Triángulo es: " + (base*altura/2));
			break;
		case 4:
			System.out.println("Vamos a calcular el área de un Círculo (A = π r²)");
			System.out.println("Dime el radio:");
			int radio;
			radio=teclado.nextInt();
			System.out.printf("El área del Círculo es: %1.2f" , Math.PI*(Math.pow(radio, 2)));			
			break;
		}//switch
		teclado.close();

	}//main

}//class
