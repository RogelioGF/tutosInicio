package controlFlujo;

import java.util.*;

public class AlmacenarEnArray {
	/*En este ejercicio se pide al usuario que introduzca 10 números enteros por consola.
	Los números introducidos se almacenarán en un array. 
	El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.*/
	public static void main(String[] args) {
		int []num=new int [10];
		int conta1=0, conta2=0, conta3=0;
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i<num.length;i++) {
			System.out.println("Dime un numero");
			num[i]=teclado.nextInt();
			System.out.println("El numero introducido es el: " + num[i]);
			if(num[i]<0) {
				System.out.println("El numero es negativo ");
				conta1++;
			}else if(num[i]>0){
				System.out.println("El numero es positivo ");
				conta2++;
			}else {
				System.out.println("El valor es un 0 ");
				conta3++;
			}//else

		}//for
		System.out.println("Total de valores: " + Arrays.toString(num)); 
		System.out.println("Valores negativos: " + conta1);
		System.out.println("Valores positivos: " + conta2);
		System.out.println("Valores 0: " + conta3);
		teclado.close();
	}//main

}
