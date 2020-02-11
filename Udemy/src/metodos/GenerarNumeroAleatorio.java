package metodos;

import java.util.*;

public class GenerarNumeroAleatorio {
	/*
    Crea una función que genere un número aleatorio entre dos números 
    pasados por parámetro.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		System.out.println("Dime el primer numero");
		num1=teclado.nextInt();
		System.out.println("Dime el segundo numero");
		num2=teclado.nextInt();
		//genera 10 numeros aleatorios de los pasados por teclado
		for (int i = 1; i<=10; i++) {
			System.out.println(generaNumeroAleatorio(num1, num2));
		}

		teclado.close();

	}//main

	public static int generaNumeroAleatorio(int minimo,int maximo){

		int num=(int) (Math.random()*(maximo-minimo+1)+(minimo));
		return num;
	}
}
