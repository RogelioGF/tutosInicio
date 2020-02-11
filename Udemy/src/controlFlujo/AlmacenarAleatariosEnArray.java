package controlFlujo;


public class AlmacenarAleatariosEnArray {
	/*En este ejercicio debes crear un array de 100 elementos que guarde
	en cada una de las posiciones un nº aleatorio entre 1 y 100. 
	El programa debe imprimir en consola todos los valores almacenados en el array. 
	Utiliza un bucle for-each para leer los valores almacenados. 
	(Debes utilizar el método random() de la clase Math).*/
	public static void main(String[] args) {
		int []num=new int [100];
		
		for (int i=0; i<num.length;i++) {
			num[i]= (int) (Math.random()*100)+1;
		}
		
		for(int valores:num) {
			System.out.print(valores + " ");
		}
	}

}
