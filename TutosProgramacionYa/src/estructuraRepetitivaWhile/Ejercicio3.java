package estructuraRepetitivaWhile;

import java.util.*;

public class Ejercicio3 {
	/*
	En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, 
	realizar un programa que lea los sueldos que cobra cada empleado 
	e informe cu�ntos empleados cobran entre $100 y $300 y cu�ntos cobran m�s de $300. 
	Adem�s el programa deber� informar el importe que gasta la empresa en sueldos al personal.
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n, x=1, contaSueldo1 = 0, contaSueldo2 = 0;
		System.out.print("Introduce el numero de empleados de la empresa: ");
		n=teclado.nextInt();
		int sueldo1, totalSalarios = 0;
		while(x<=n){
			System.out.print("Sueldo mensual (entre $100 y $500) \nempleado n� " + x +": ");
			sueldo1=teclado.nextInt();

			if(sueldo1>=100 && sueldo1<=300) {
				contaSueldo1++;
			}else 
				if(sueldo1>300) {
					contaSueldo2++;
				}
			totalSalarios += sueldo1;
			x++;
		}//while
		
		System.out.print("\nEmpleados que cobran entre $100 y $300 = " + contaSueldo1);
		System.out.print("\nEmpleados que cobran m�s de $300 = " + contaSueldo2);
		System.out.print("\nImporte que gasta la empresa en sueldos del personal: " + totalSalarios + "�");
		
	}//main

}//class
