package com.tmbs.ta06_12;

import javax.swing.JOptionPane;

/*  Crea un array de n�meros de un tama�o pasado por teclado, el array contendr�
n�meros aleatorios entre 1 y 300 y mostrar� aquellos n�meros que acaben en un d�gito que
nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto),
estos deben guardarse en un nuevo array.

Por ejemplo, en un array de 10 posiciones le indicamos mostrar los n�meros acabados en 5,
podr�a salir 155, 25, etc.*/
public class Main_EJ12 {

	public static void main(String[] args) {

		int sizeArray = 0;

		// Pide longitud del array al usuario y comprueba que sea correcta
		try {

			do {
				String inputSize = JOptionPane.showInputDialog("Introduce la longitud del array a generar");
				sizeArray = Integer.parseInt(inputSize);

				if (sizeArray < 1) {
					JOptionPane.showMessageDialog(null,"Por favor, introduce un n�mero entero porsitivo");
				}

			} while (sizeArray < 1);

			// Crea el array con la longitud especificada
			int[] array = new int[sizeArray];

			// Rellena el array con numeros del 1 al 300
			array = fillArray(array);

			// Muestra los numeros con numero final especificado
			showArray(array);

		} catch (Exception e) {
			System.out.println("El dato introducido no es correcto");
		}

	}

	// Funcion que rellena arrays con numeros aleatorios del 1 al 300
	public static int[] fillArray(int[] array) {
		int min = 1;
		int max = 300;
		int range = max - min;
		
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * (range + 1)) + min);
		}
		return array;
	}

	// Metodo para mostrar contenidos del array finalizados en el numero determinado
	public static void showArray(int[] array) {

		int num = 10;
		do {
			String numStr = JOptionPane.showInputDialog("Introduce el digito final");
			num = Integer.parseInt(numStr);
			if (num > 9 || num < 0) {
				JOptionPane.showMessageDialog(null, "Error, el numero tiene que ser entre 0 y 9");
			}

		} while (num > 9 || num < 0);

		System.out.println("Estos son los numeros generados que terminan en " + num);

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == num) {
				System.out.print(array[i] + "\t");
			}
		}
	}

}
