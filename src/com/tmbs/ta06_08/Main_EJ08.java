package com.tmbs.ta06_08;

import javax.swing.JOptionPane;

/* Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y
otro para mostrar.*/
public class Main_EJ08 {

	public static void main(String[] args) {

		int[] userArray = new int[10];

		showArray(fillArray(userArray));

	}

	// Funcion que rellena la array
	public static int[] fillArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			String num = JOptionPane.showInputDialog("\nIntroduce el " + (10 - i) + "º numero.");
			int numInt = Integer.parseInt(num);
			array[i] = numInt;
		}

		return array;

	}

	// Funcion que muestra los numeros introducidos
	public static void showArray(int[] array) {

		System.out.println("\n-- Numeros introducidos en el array --\n");

		for (int i = 0; i < array.length; i++) {
			System.out.println("Indice " + (i) + ": " + array[i] + " ");
		}

	}

}
