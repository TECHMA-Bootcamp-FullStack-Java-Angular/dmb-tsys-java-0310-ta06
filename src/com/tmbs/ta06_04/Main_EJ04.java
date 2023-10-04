package com.tmbs.ta06_04;

import java.util.Scanner;

/*
* Crea una aplicación que nos calcule el factorial de un número pedido por teclado, lo
* realizara mediante un método al que le pasamos el número como parámetro. Para calcular
* el factorial, se multiplica los números anteriores hasta llegar a uno. Por ejemplo,
* si introducimos un 5, realizara esta operación 5*4*3*2*1=120
* */
public class Main_EJ04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");

		int numero = sc.nextInt();
		int factorial = calculateFactorial(numero);

		System.out.println("El factorial de " + numero + " es: " + factorial);

		sc.close();
	}

	// funcion recursiva calcuala factorial
	public static int calculateFactorial(int num) {
		return num == 0 ? 1 : num * calculateFactorial(num - 1);
	}

}
