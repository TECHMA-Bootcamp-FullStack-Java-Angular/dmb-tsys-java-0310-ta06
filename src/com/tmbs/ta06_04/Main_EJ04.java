package com.tmbs.ta06_04;

import java.util.Scanner;

/*
* Crea una aplicaci�n que nos calcule el factorial de un n�mero pedido por teclado, lo
* realizara mediante un m�todo al que le pasamos el n�mero como par�metro. Para calcular
* el factorial, se multiplica los n�meros anteriores hasta llegar a uno. Por ejemplo,
* si introducimos un 5, realizara esta operaci�n 5*4*3*2*1=120
* */
public class Main_EJ04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un n�mero: ");

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
