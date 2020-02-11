package controlFlujo;

import java.util.*;

public class CalculoNumAleatorio {

	public static void main(String[] args) {
		//numero aleatorio entre el 1 y el 100
		int aleatorio = (int)(Math.random()*100);
		//pedimos el numero por teclado
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero entre el 1 y el 100");
		int num = teclado.nextInt();
		//para almacenar los intentos
		int intentos = 0;
		//mientras el numero aleatorio sea distinto del numero por teclado
		//se repetira el bucle hasta que se acierte el numero
		while(aleatorio!=num) {
			//contador de intentos
			intentos++;
			//condicional si es mayor o menor 
			if(aleatorio>num) System.out.println("El numero es mayor");
			else System.out.println("El numero es menor");
			//volvemos a pedir el numero
			System.out.println("Dime otro numero entre el 1 y el 100");
			num = teclado.nextInt();
		}//while
		//imprimimos por consola el resultado y el numero de intentos
		System.out.println("Correcto! acertaste el numero " + aleatorio + " lo hiciste en " + intentos + " intentos");
		//cerramos la entrada por teclado
		teclado.close();
	}//main

}//class
