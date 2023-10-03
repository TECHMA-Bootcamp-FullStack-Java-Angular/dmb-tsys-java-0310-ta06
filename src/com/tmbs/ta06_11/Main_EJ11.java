package com.tmbs.ta06_11;

import java.util.Arrays;
import java.util.Scanner;

/* Crea dos arrays de n�meros con la dimensi�n pasada por teclado.
Uno de ellos estar� rellenado con n�meros aleatorios y el otro apuntara al array anterior,
reasigna los valores del segundo array con valores aleatorios.

Despu�s, crea un m�todo que tenga como par�metros, los dos arrays y devuelva uno nuevo
con la multiplicaci�n de la posici�n 0 del array1 con el del array2 y as� sucesivamente.

Por �ltimo, muestra el contenido de cada array.*/
public class Main_EJ11 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el tama�o de la lista: ");
		Integer num = sc.nextInt();

		while (num <= 0) {
			System.out.print("Introduce un tama�o de la lista correcto: ");
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
