package com.tmbs.ta06_02;

import java.util.Random;
import java.util.Scanner;

/**
 * 2) Crea una aplicación que nos genere una cantidad de números enteros
 * aleatorios que nosotros le pasaremos por teclado. Crea un método donde
 * pasamos como parámetros entre que números queremos que los genere, podemos
 * pedirlas por teclado antes de generar los números. Este método devolverá un
 * número entero aleatorio. Muestra estos números por pantalla.
 */
public class Main_EJ02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de números enteros aleatorios que desea generar: ");
		int cantidadNumeros = scanner.nextInt();

		System.out.print("Ingrese el número mínimo: ");
		int numeroMinimo = scanner.nextInt();

		System.out.print("Ingrese el número máximo: ");
		int numeroMaximo = scanner.nextInt();

		if (numeroMinimo < numeroMaximo) {
			for (int i = 0; i < cantidadNumeros; i++) {
				int numeroAleatorio = generarNumeroAleatorio(numeroMinimo, numeroMaximo);
				System.out.println("Número aleatorio " + (i + 1) + ": " + numeroAleatorio);
			}
		} else {
			System.out.println("El numero mínimo debe ser menor que el numero máximo");
		}
		scanner.close();
	}

	private static int generarNumeroAleatorio(int minimo, int maximo) {
		Random random = new Random();
		return random.nextInt(maximo - minimo + 1) + minimo;
	}

}
