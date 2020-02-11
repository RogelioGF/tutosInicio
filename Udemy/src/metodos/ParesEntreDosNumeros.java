package metodos;

import java.util.*;

public class ParesEntreDosNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		System.out.println("Dime el primer numero");
		num1=teclado.nextInt();
		System.out.println("Dime el segundo numero");
		num2=teclado.nextInt();
		//le pasamos los valores porm teclado
		paresEntre(num1,num2);

		teclado.close();
	}//main

	public static void paresEntre(int inicio, int fin) {

		//en caso de que inicio sea mayor que fin cambiamos los valores
		if (inicio>fin) {
			int aux = inicio;
			inicio = fin;
			fin = aux;
		}//if

		for (int i = inicio; i<=fin;i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}//if
		}//for

	}//paresEntre

}//class
