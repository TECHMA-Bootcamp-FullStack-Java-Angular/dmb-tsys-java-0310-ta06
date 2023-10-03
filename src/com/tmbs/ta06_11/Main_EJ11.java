package com.tmbs.ta06_11;

import java.util.Arrays;
import java.util.Scanner;

/* Crea dos arrays de números con la dimensión pasada por teclado.
Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior,
reasigna los valores del segundo array con valores aleatorios.

Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo
con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente.

Por último, muestra el contenido de cada array.*/
public class Main_EJ11 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el tamaño de la lista: ");
		Integer num = sc.nextInt();

		while (num <= 0) {
			System.out.print("Introduce un tamaño de la lista correcto: ");
			num = sc.nextInt();
		}
		int array1[] = new int[num];

		System.out.print("\n\n****** ARRAY 1 con valores random *******\n");
		addRandomValues(array1);
		showArray(array1);

		System.out.print("\n\n****** ARRAY 2 apuntado a ARRAY 1 *******\n");
		int array2[] = array1;
		showArray(array2);

		System.out.print("\n\n****** ARRAY 2 con valores random *******\n");
		addRandomValues(array2);
		showArray(array2);
		System.out.print("\nEl array1 tambien cambia ya que el array 2 apunta al el\n");
		showArray(array1);

		int array3[] = multiplicarArray(array1, array2);
		System.out.print("\n\n************* Nuevo ARRAY 3 **************\n");
		showArray(array3);

		sc.close();
	}

	private static void addRandomValues(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
		}
	}

	private static void showArray(int array[]) {

		System.out.print(Arrays.toString(array));

	}

	private static int[] multiplicarArray(int array1[], int array2[]) {

		int array3[] = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i] * array2[i];
		}
		return array3;
	}

}
