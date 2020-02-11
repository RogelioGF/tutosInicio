package estructuraRepetitivaDoWhile;

import java.util.*;

public class Ejercicio2 {
	/*En un banco se procesan datos de las cuentas corrientes de sus clientes. 
	De cada cuenta corriente se conoce: número de cuenta y saldo actual. 
	El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.
	Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
	a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
	Estado de la cuenta	
	'Acreedor' si el saldo es >0.
	'Deudor' si el saldo es <0.
	'Nulo' si el saldo es =0.
	b) La suma total de los saldos acreedores.*/
	public static void main(String[] args) {
		int numCuenta;
		float saldo = 0, sumAcreedores = 0;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Dime el numero de cuenta ");
			numCuenta=teclado.nextInt();
			if(numCuenta>=0) {
				System.out.println("Dime su saldo ");
				saldo=teclado.nextFloat();
			}if(saldo>0) {
				System.out.println("Saldo Acreedor.");
				sumAcreedores+=saldo;
			}else if(saldo<0) {
				System.out.println("Saldo Deudor.");
			}else System.out.println("NULO");

		}while(numCuenta>=0);

		System.out.println("Suma total acreedores " + sumAcreedores);
		teclado.close();
	}

}
