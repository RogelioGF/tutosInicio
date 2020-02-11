package estructurasCondicionales;

import java.util.*;

public class CondicionesCompuestas2 {
	/*Se ingresan tres valores por teclado, 
	si todos son iguales se imprime la suma del primero con el segundo
	y a este resultado se lo multiplica por el tercero.*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, resultado1, resultado2 = 0;
		System.out.println("Dime el primer numero");
		num1=teclado.nextInt();
		System.out.println("Dime el segundo numero");
		num2=teclado.nextInt();
		System.out.println("Dime el tercer numero");
		num3=teclado.nextInt();

		if(num1==num2 && num1==num3) {
			resultado1 = (num1 + num2) * num3;
			System.out.println("El resultado es " + resultado1);
		}else {
			resultado2 = (num1 + num2) * num3;
			System.out.println("El resultado es " + resultado2);
		}


		teclado.close();
	}

}
