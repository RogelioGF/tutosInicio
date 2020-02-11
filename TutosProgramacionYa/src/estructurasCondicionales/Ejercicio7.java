package estructurasCondicionales;

import java.util.*;

public class Ejercicio7 {
	/*
	Un postulante a un empleo, realiza un test de capacitación, 
	se obtuvo la siguiente información: cantidad total de preguntas 
	que se le realizaron y la cantidad de preguntas que contestó correctamente. 
	Se pide confeccionar un programa que ingrese los dos datos por teclado 
	e informe el nivel del mismo según el porcentaje de respuestas correctas 
	que ha obtenido, y sabiendo que:
		Nivel máximo:	Porcentaje>=90%.
		Nivel medio:	Porcentaje>=75% y <90%.
		Nivel regular:	Porcentaje>=50% y <75%.
		Fuera de nivel:	Porcentaje<50%.
	 */
	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			int totalPreguntas, preguntasCorrectas, porcentajeCorrectas;
			
			System.out.println("Cantidad total de preguntas que se le realizaron");
			totalPreguntas = teclado.nextInt();
			System.out.println("Cantidad de preguntas que contestó correctamente");
			preguntasCorrectas=teclado.nextInt();
			
			porcentajeCorrectas = preguntasCorrectas*100 / totalPreguntas;
			
			System.out.println("Tu porcentaje de preguntas correctas es del: " + porcentajeCorrectas + "%" );
			if (porcentajeCorrectas >= 90 && porcentajeCorrectas <=100) System.out.println("Has alcanzado el Nivel Máximo ");
			else if(porcentajeCorrectas >=75 && porcentajeCorrectas <90) System.out.println("Has alcanzado un Nivel Medio ");
			else if (porcentajeCorrectas >=50 && porcentajeCorrectas <75) System.out.println("Has alcanzado un Nivel Regular ");
			else System.out.println("Estas Fuera de Nivel");
			
			teclado.close();
	}//main
	

}//class
