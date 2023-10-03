package com.tmbs.ta06_06;

import java.util.Scanner;

/*
 * Crea una aplicaci�n que nos cuente el n�mero de cifras de un n�mero entero positivo
(hay que controlarlo) pedido por teclado. Crea un m�todo que realice esta acci�n, pasando
el n�mero por par�metro, devolver� el n�mero de cifras.*/
public class Main_EJ06 {
	
public static void main(String[] args) {
		
		int positiveNum = aksValueNumeric("Introduzca un n�mero entero: ");
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
