package estructurasCondicionales;

import java.util.Scanner;

public class CondicionesCompuestas7 {
	/*Escribir un programa en el cual: dada una lista de tres valores numéricos distintos 
	se calcule e informe su rango de variación (debe mostrar el mayor y el menor de ellos)*/
	public static void main(String[] args) {
//		Scanner teclado = new Scanner(System.in);
//		int num1, num2, num3;
//		System.out.println("Dime el primer numero");
//		num1=teclado.nextInt();
//		System.out.println("Dime el segundo numero");
//		num2=teclado.nextInt();
//		System.out.println("Dime el tercer numero");
//		num3=teclado.nextInt();
//		
//		if (num1>num2 && num1>num3)System.out.println("El mayor es " + num1);
//		if (num1<num2&&num1<num3)System.out.println("El menor es " + num1);
//		if (num2>num1&&num2>num3)System.out.println("El mayor es " + num2);
//		if (num2<num1&&num2<num3)System.out.println("EL menor es " + num2);
//		if (num3>num1&&num3>num2)System.out.println("El mayor es " + num3);
//		if (num3<num1&&num3<num2)System.out.println("El menos es " + num3);
//		if (num1==num2&&num1==num3)System.out.println("Son iguales ");
//		
//		teclado.close();
		
		
		//ALTERNATIVA
		Scanner teclado=new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Ingrese primer valor:");
        num1=teclado.nextInt();
        System.out.print("Ingrese segundo valor:");
        num2=teclado.nextInt();
        System.out.print("Ingrese tercer valor:");
        num3=teclado.nextInt();
        System.out.print("Rango de valores:");
        if (num1<num2 && num1<num3) {
            System.out.print(num1);
        } else {
            if (num2<num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
        System.out.print("-");
        if (num1>num2 && num1>num3) {
            System.out.print(num1);
        } else {
            if (num2>num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
        teclado.close();
	}
	
}
