package controlFlujo;

import java.util.*;
//En este ejercicio se pide al usuario que introduzca su direcci�n de email con ayuda de la clase JOptionPane.
//Una vez introducido el email, el programa debe decir si la direcci�n de email es correcta o no teniendo en cuenta los siguientes requisitos:
//1. Debe tener una @
//2. No debe tener m�s de una @
//3. Debe tener un punto
//4. La direcci�n de email debe tener al menos 4 caracteres.
//El programa pedir� introducir indefinidamente la direcci�n de email si no es correcta o si tienes menos de 4 caracteres.
public class ValidacionEmail {

	public static void main(String[] args) {

		boolean valido = false;

		do {

			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
			String email;
			System.out.println("Introduce tu email: ");
			email=teclado.nextLine();
			int arroba=0;
			boolean punto = false;
			for (int i = 0; i < email.length(); i++) {

				if (email.charAt(i)=='@')arroba++;
				if (email.charAt(i)=='.')punto=true;

			}

			if(arroba==1 && punto==true && email.length()>=4) valido=true;
			else System.out.println("Email no valido");

		}while(valido==false);

		System.out.println("Email correcto!");
		
	}//main

}//class
