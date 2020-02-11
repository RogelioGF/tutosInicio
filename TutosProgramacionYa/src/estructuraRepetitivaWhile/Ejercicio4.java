package estructuraRepetitivaWhile;

public class Ejercicio4 {
	/*Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc.
	(No se ingresan valores por teclado)*/
	public static void main(String[] args) {

		int num = 11, x = 1;
		
		while (x<=25) {
			System.out.println(num);
			num +=11;
			x++;
		}//while
		
	}//main

}//class
