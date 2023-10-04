package com.tmbs.ta06_03;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Crea una aplicaci�n que nos pida un n�mero por teclado y con un m�todo se
 * lo pasamos por par�metro para que nos indique si es 0 no un n�mero primo,
 * debe devolver true si es primo sino false.
 * 
 * Un n�mero primo es aquel solo puede dividirse entre 1 y si mismo. Por
 * ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
public class Main_EJ03 {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		String num = JOptionPane.showInputDialog(frame, "Introduzca un n�mero entero", "De Entero a Binario",
				JOptionPane.QUESTION_MESSAGE);

		if (num != null && Integer.valueOf(num) > 0) {

			JOptionPane.showMessageDialog(null,
					" A la consultoa de si " + num + " es primo \n la respuesta es " + esPrimo(Integer.valueOf(num)));
		}
	}

	static boolean esPrimo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
