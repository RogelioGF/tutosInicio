package controlFlujo;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String frase;
		char caracter;
		do {
			System.out.println("Dime una frase:");
			frase = teclado.nextLine();
		}while(frase.length()>30);
		
		
		for(int i = 0; i<frase.length(); i++) {
			caracter = frase.charAt(i);
		boolean letra;
		if (frase.charAt(i)==' ')
			letra = Character.isUpperCase(i+1);
		}
		
	}

}
