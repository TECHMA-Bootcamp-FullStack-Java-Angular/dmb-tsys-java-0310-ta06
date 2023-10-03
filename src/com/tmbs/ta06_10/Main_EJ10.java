package com.tmbs.ta06_10;

import java.util.Scanner;

/* Crea un array de n�meros de un tama�o pasado por teclado, el array contendr�
n�meros aleatorios primos entre los n�meros deseados, por �ltimo nos indicar cual es el
mayor de todos.

Haz un m�todo para comprobar que el n�mero aleatorio es primo, puedes hacer todos lo
m�todos que necesites.
*/
public class Main_EJ10 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Integer  num, valueMax, valueMin;
		
		do {
			num = askValueNumeric("Introduce el tama�o del array: ");
		} while (num < 0);
		
		do {
			valueMin = askValueNumeric("Introduce el valor minimo aleatorio: ");
		} while (valueMin < 0);
		
		do {
			valueMax = askValueNumeric("Introduce el valor m�ximo aleatorio: ");
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
