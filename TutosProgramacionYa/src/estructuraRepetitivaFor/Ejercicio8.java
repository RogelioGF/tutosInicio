package estructuraRepetitivaFor;

import java.util.*;

public class Ejercicio8 {
	/*Se cuenta con la siguiente información:
	Las edades de 50 estudiantes del turno mañana.
	Las edades de 60 estudiantes del turno tarde.
	Las edades de 110 estudiantes del turno noche.
	Las edades de cada estudiante deben ingresarse por teclado.
	a) Obtener el promedio de las edades de cada turno (tres promedios)
	b) Imprimir dichos promedios (promedio de cada turno)
	c) Mostrar por pantalla un mensaje que indique cual de los tres turnos tiene un promedio de edades mayor.*/
	public static void main(String[] args) {
		int edad, promedio1 = 0, promedio2 = 0, promedio3 = 0; 
		Scanner teclado = new Scanner(System.in);
		for (int i = 1; i<=220; i++) {			
			if (i<=50) {
				System.out.println("Dime las edades de los alumnos del turno de Mañana");
				edad=teclado.nextInt();
				promedio1+=edad/50;
			}//if
			if (i>50 && i<=110) {
				System.out.println("Dime las edades de los alumnos del turno de Tarde");
				edad=teclado.nextInt();
				promedio2+=edad/60;
			}//if
			if (i>110 && i <=220) {
				System.out.println("Dime las edades de los alumnos del turno de Noche");
				edad=teclado.nextInt();
				promedio3+=edad/110;
			}//if
		}//for
		System.out.println("Promedio del turno de Mañana: " + promedio1 + " años ");
		System.out.println("Promedio del turno de Tarde: " + promedio2 + " años ");
		System.out.println("Promedio del turno de Noche: " + promedio3 + " años ");

		if (promedio1>promedio2 && promedio1>promedio3) {
			System.out.println("El turno de Mañana tiene un promedio mayor del: " + promedio1 + " años ");
		}else if (promedio2>promedio3) {
			System.out.println("El turno de Tarde tiene un promedio mayor del: " + promedio2 + " años ");
		}else {
			System.out.println("El turno de Noche tiene un promedio mayor del: " + promedio3 + " años ");
		}//else
		teclado.close();
	}//main

}//class
