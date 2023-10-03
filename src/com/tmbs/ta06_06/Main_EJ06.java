package com.tmbs.ta06_06;

import java.util.Scanner;

/*
 * Crea una aplicación que nos cuente el número de cifras de un número entero positivo
(hay que controlarlo) pedido por teclado. Crea un método que realice esta acción, pasando
el número por parámetro, devolverá el número de cifras.*/
public class Main_EJ06 {
	
public static void main(String[] args) {
		
		int positiveNum = aksValueNumeric("Introduzca un número entero: ");
		System.out.println( positiveNum + " contiene " + totaNumlDigits(positiveNum) + " cifras.");
	} 

	public static int totaNumlDigits(int num) {  		
		return Integer.toString(num).length();
	}
	
	private static int aksValueNumeric(String txt) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while (num <= 0) {
			
			System.out.print(txt);
			
			try {
				num = Integer.valueOf(sc.next());
			} catch (NumberFormatException nfe) {
				System.err.println("El valor no es un numero" );
			}			
			
		}
		
		sc.close();
		return num;
	}

}
