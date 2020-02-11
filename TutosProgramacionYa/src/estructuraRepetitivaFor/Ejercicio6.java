package estructuraRepetitivaFor;

import java.util.*;

public class Ejercicio6 {
	/*Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
	Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante. 
	Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.
	(1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, x, y, i, conta1 = 0, conta2 = 0, conta3 = 0, conta4 = 0;
		System.out.println("Cantidad de puntos a procesar?");
		num=teclado.nextInt();
		for(i=0; i<num;i++) {
			System.out.println("Coordenada X");
			x=teclado.nextInt();
			System.out.println("Coordenada Y");
			y=teclado.nextInt();
			if(x>0 && y>0) {
				conta1++;
			}else if (x<0 && y>0) {
				conta2++;
			}
			else if (x<0 && y<0) {
				conta3++;
			}else if (x>0 && y<0){
				conta4++;
			}//else

		}//for
		System.out.println("Puntos ingresados en el primer cuadrante: " + conta1);
		System.out.println("Puntos ingresados en el segundo cuadrante: " + conta2);
		System.out.println("Puntos ingresados en el tercer cuadrante: " + conta3);
		System.out.println("Puntos ingresados en el cuarto cuadrante: " + conta4);
		teclado.close();
	}//main

}//class
