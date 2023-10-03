package com.tmbs.ta06_10;

import java.util.Scanner;

/* Crea un array de números de un tamaño pasado por teclado, el array contendrá
números aleatorios primos entre los números deseados, por último nos indicar cual es el
mayor de todos.

Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo
métodos que necesites.
*/
public class Main_EJ10 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Integer  num, valueMax, valueMin;
		
		do {
			num = askValueNumeric("Introduce el tamaño del array: ");
		} while (num < 0);
		
		do {
			valueMin = askValueNumeric("Introduce el valor minimo aleatorio: ");
		} while (valueMin < 0);
		
		do {
			valueMax = askValueNumeric("Introduce el valor máximo aleatorio: ");
		} while (valueMax < valueMin);
		
		 
		sc.close();

		int array[] = new int[num];

		fillArrayNumPrimes(array, valueMin, valueMax);

		System.out.println("\n********************** NUMEROS PRIMOS ******************");
		showArrayNumPrimes(array);

	}

	public static void fillArrayNumPrimes(int array[], int min, int max) {
		
		int i = 0, numPrimo = 0;
			
		while (i < array.length) {		
			numPrimo = (int) ((Math.random() * ((max - min) + 1)) + min);	
			if (isPrime(numPrimo)) {	
				array[i] = numPrimo;				
				i++;				
			}
		}
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void showArrayNumPrimes(int array[]) {
		int numMayor = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(" ["+ array[i]+ "] ");
			if (array[i] > numMayor) {
				numMayor = array[i];
			} 
		}
		System.out.println("\n\n  NUMERO MAYOR: " + numMayor);
	} 
	
	private static Integer askValueNumeric(String txt) {
		Integer res = 0;
		 
		while (res == 0) {
			
			System.out.print(txt);
			String resString = sc.next();
			 
			try {
				res = Integer.valueOf(resString);
			} catch (Exception e) {
				System.err.println("Debes introducir un Numero");
			} 
		}   	
		return res;
	}

}
