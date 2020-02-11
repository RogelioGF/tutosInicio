package controlFlujo;

import java.util.*;

/*Debes crear un programa que permita calcular el peso ideal de una persona teniendo en cuenta lo siguiente:
� Si la persona es una mujer, el peso ideal ser� igual a la altura en cm -120
� Si la persona es un hombre, el peso ideal ser� igual a la altura en cm -110
El programa pedir� al usuario mediante una ventana emergente de tipo JOptionPane dos datos:
1. La altura en cm
2. El g�nero, pudiendo ser este hombre o mujer.
En funci�n de los datos introducidos, el programa imprimir� en consola el peso ideal.*/

public class CalculoPeso {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int peso_ideal = 0, altura;
		String genero;
		//pedimos la altura
		System.out.println("Dime tu altura en centimetros:");
		altura=teclado.nextInt();
		//a�adimos nextline para que no haga el salto de linea doble
		teclado.nextLine();
		//pedimos el genero
		System.out.println("Dime si eres hombre (H) o mujer (M):");
		genero=teclado.nextLine();
		//calculamos el peso ideal
		if(genero.equalsIgnoreCase("M")) peso_ideal= altura - 120;
		else if (genero.equalsIgnoreCase("H")) peso_ideal=altura - 110;
		//Devolvemos el valor del string completo para que lo imprima en el syso
		if (genero.equalsIgnoreCase("M")) genero="Mujer";
		else if (genero.equalsIgnoreCase("H")) genero="Hombre";
		//imprimimos en consola el resultado
		System.out.println("Siendo " + genero + " tu peso ideal es: " + peso_ideal + "kg");
		//cerramos la entrada por teclado
		teclado.close();
	}

}
