package com.tmbs.ta06_09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*  Crea un array de números donde le indicamos por teclado el tamaño del array,
rellenaremos el array con números aleatorios entre 0 y 9. Al final muestra por pantalla el
valor de cada posición y la suma de todos los valores.

Tareas a realizar: Haz un método para rellenar el array(que tenga como parámetros los
números entre los que tenga que generar) y otro para mostrar el contenido y la suma del
array.*/
public class Main_EJ09 {

	static Scanner sc = new Scanner(System.in);
	
	static Integer[] userArray;
	
	public static void main(String[] args) {

		System.out.print("Introduzca el tamaño del array: ");
		
		userArray = new Integer[sc.nextInt()];
		
		sc.close();

		showAndSum(fillRandomArray(userArray));
		
	} 

	// Funcion que rellena array y lo retorna
	private static  Integer[] fillRandomArray(Integer[] array ) {		
			for (int i = 0; i < array.length; i++) {
				array[i] = randomNumberGenerator(0, 9);
			}
			return array;
	}
	
	// Función que genera el numero Random entre un rango maximo y minimo
	private static int randomNumberGenerator(int minRank, int maxRank) {
	    Random random = new Random();
	    return random.nextInt(maxRank - minRank + 1) + minRank;
	}

	// Funcion que muestra el contenido del array junto a la suma de todos los
	// numeros
	private static void showAndSum(Integer[] array) {	
		int sumValuesArry =  Arrays.stream(array).reduce(0, (a,b) -> a+b);
		
		System.out.println(Arrays.toString(array)); 
		System.out.println("\nLa suma de todos los numeros es de: " + sumValuesArry);
		
	}
}
