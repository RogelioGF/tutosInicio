package estructurasCondicionales;

import java.util.Scanner;

public class CondicionesCompuestas4 {
	/*Se ingresan por teclado tres números, 
	si al menos uno de los valores ingresados es menor a 10,
	imprimir en pantalla la leyenda "Alguno de los números es menor a diez".*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Dime el primer numero");
		num1=teclado.nextInt();
		System.out.println("Dime el segundo numero");
		num2=teclado.nextInt();
		System.out.println("Dime el tercer numero");
		num3=teclado.nextInt();

		if (num1<10 || num2<10 || num3<10) {
			System.out.println("Alguno de los números es menor a diez");
		}

		teclado.close();
	}

}
