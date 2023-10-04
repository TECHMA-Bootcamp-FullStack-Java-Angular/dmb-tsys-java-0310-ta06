package com.tmbs.ta06_02;

import java.util.Random;
import java.util.Scanner;

/**
 * 2) Crea una aplicaci�n que nos genere una cantidad de n�meros enteros
 * aleatorios que nosotros le pasaremos por teclado. Crea un m�todo donde
 * pasamos como par�metros entre que n�meros queremos que los genere, podemos
 * pedirlas por teclado antes de generar los n�meros. Este m�todo devolver� un
 * n�mero entero aleatorio. Muestra estos n�meros por pantalla.
 */
public class Main_EJ02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de n�meros enteros aleatorios que desea generar: ");
		int cantidadNumeros = scanner.nextInt();

		System.out.print("Ingrese el n�mero m�nimo: ");
		int numeroMinimo = scanner.nextInt();

		System.out.print("Ingrese el n�mero m�ximo: ");
		int numeroMaximo = scanner.nextInt();

		if (numeroMinimo < numeroMaximo) {
			for (int i = 0; i < cantidadNumeros; i++) {
				int numeroAleatorio = generarNumeroAleatorio(numeroMinimo, numeroMaximo);
				System.out.println("N�mero aleatorio " + (i + 1) + ": " + numeroAleatorio);
			}
		} else {
			System.out.println("El numero m�nimo debe ser menor que el numero m�ximo");
		}
		scanner.close();
	}

	private static int generarNumeroAleatorio(int minimo, int maximo) {
		Random random = new Random();
		return random.nextInt(maximo - minimo + 1) + minimo;
	}

}
