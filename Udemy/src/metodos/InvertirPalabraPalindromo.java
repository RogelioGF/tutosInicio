package metodos;

import java.util.*;

public class InvertirPalabraPalindromo {
	/*
    Crea una función que indique si una frase o palabra pasada 
    por parámetro es un palindromo. Usa las funciones adicionales 
    que consideres adicionales.
	 */

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una palabra");
		String palabra = teclado.nextLine();
		
		String invertida = invertirString(palabra);
		System.out.println("La frase invertida es: " + invertida);
		
        if (esPalindromo(palabra)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
        teclado.close();
    }

    public static String invertirString(String frase) {

        String invertida = "";

        char caracter;
        for (int i = frase.length() - 1; i >= 0; i--) {
            caracter = frase.charAt(i);
            invertida += caracter;
        }
//        System.out.println("Frase invertida " + invertida);
        return invertida;

    }

    public static boolean esPalindromo(String frase) {

        frase = frase.toLowerCase().trim();
        
        String invertida = invertirString(frase);

        if (frase.equals(invertida)) {
            return true;
        } else {
            return false;
        }
    }
}
