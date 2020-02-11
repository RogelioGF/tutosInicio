package estructuraRepetitivaFor;

import java.util.*;

public class Ejercicio5 {
	/*Realizar un programa que lea los lados de n tri�ngulos, e informar:
	a) De cada uno de ellos, qu� tipo de tri�ngulo es: equil�tero (tres lados iguales), 
	is�sceles (dos lados iguales), o escaleno (ning�n lado igual)
	b) Cantidad de tri�ngulos de cada tipo.
	c) Tipo de tri�ngulo que posee menor cantidad.*/
	public static void main(String[] args) {
		int num, i, lado1, lado2, lado3, conta1 = 0, conta2 = 0, conta3 = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Numero de triangulos?");
		num=teclado.nextInt();
		for(i=0;i<num;i++) {
			System.out.println("Cuanto mide el lado 1?");
			lado1=teclado.nextInt();
			System.out.println("Cuanto mide el lado 2?");
			lado2=teclado.nextInt();
			System.out.println("Cuanto mide el lado 3?");
			lado3=teclado.nextInt();
			
			if(lado1==lado2 && lado1==lado3) {
				System.out.println("Es un triangulo equil�tero");
				conta1++;
			}else if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
				System.out.println("Es un triangulo is�sceles");
				conta2++;
			}else {
				System.out.println("Es un triangulo escaleno");
				conta3++;
			}//else
			
		}//for
		if(conta1<conta2 && conta1<conta3) {
			System.out.println("El tri�ngulo que posee menor cantidad es equil�tero");
		}else if (conta2<conta1 && conta2<conta3) {
			System.out.println("El tri�ngulo que posee menor cantidad es is�sceles");
		}else if(conta3<conta1 && conta3<conta2) {
			System.out.println("El tri�ngulo que posee menor cantidad es escaleno");
		}else {
			System.out.println("Iguales");
		}
		teclado.close();
	}//main

}
