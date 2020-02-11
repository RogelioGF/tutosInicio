package estructurasCondicionales;

import java.util.*;

public class CondicionesCompuestas6 {
	/*De un operario se conoce su sueldo y los años de antigüedad. 
	Se pide confeccionar un programa que lea los datos de entrada e informe:
	a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años,
	otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
	b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, 
	otorgarle un aumento de 5 %.
	c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int sueldo, antiguedad;
		double total;
		System.out.println("Salario mensual");
		sueldo=teclado.nextInt();
		System.out.println("Antiguedad en la empresa (años)");
		antiguedad=teclado.nextInt();
		
		if (sueldo < 500 && antiguedad >=10) {
			total= (sueldo * 0.20) + sueldo;
			System.out.println("Sueldo a pagar = " + total + "€");
		}else if (sueldo < 500 && antiguedad < 10) {
			total= (sueldo * 0.05) + sueldo;
			System.out.println("Sueldo a pagar = " + total + "€");
		}else if (sueldo >= 500) {
			System.out.println("Sueldo a pagar = " + sueldo + "€");
		}
		
		teclado.close();
	}
}
