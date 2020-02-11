package estructuraRepetitivaWhile;

import java.util.*;

public class Ejercicio2 {
	/*Se ingresan un conjunto de n alturas de personas por teclado. 
	Mostrar la altura promedio de las personas.*/
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n,x;
        float altura,suma,promedio;
        System.out.print("Cuantas personas hay:");
        n=teclado.nextInt();
        x=1;
        suma=0;
        while (x<=n) {
            System.out.print("Ingrese la altura:");
            altura=teclado.nextFloat();
            suma=suma + altura;
            x++;
        }
        promedio=suma/n;
        System.out.print("Altura promedio:");
        System.out.print(promedio);
	}

}
