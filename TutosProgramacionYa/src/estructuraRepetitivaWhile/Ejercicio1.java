package estructuraRepetitivaWhile;

import java.util.*;

public class Ejercicio1 {
	/*Escribir un programa que solicite ingresar 10 notas de alumnos
	y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.*/
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int x,nota,conta1,conta2;
		x=1;
		conta1=0;
		conta2=0;
		while (x<=10) {
			System.out.print("Ingrese nota: ");
			nota=teclado.nextInt();
			if (nota>=7) {
				conta1++;
			}else {
				conta2++;
			}
			x++;
		}
		System.out.print("Cantidad de alumnos con notas mayores o iguales a 7: ");
		System.out.println(conta1);
		System.out.print("Cantidad de alumons con notas menores a 7: ");
		System.out.print(conta2);


	}

}
