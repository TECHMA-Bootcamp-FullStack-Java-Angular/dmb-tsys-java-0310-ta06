package com.tmbs.ta06_05;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/* Crea una aplicaci�n que nos convierta un n�mero en base decimal a binario. Esto lo
realizara un m�todo al que le pasaremos el numero como par�metro, devolver� un String
con el numero convertido a binario. Para convertir un numero decimal a binario, debemos
dividir entre 2 el numero y el resultado de esa divisi�n se divide entre 2 de nuevo hasta que
no se pueda dividir mas, el resto que obtengamos de cada divisi�n formara el numero
binario, de abajo a arriba.*/

public class Main_EJ05 {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		String dato = JOptionPane.showInputDialog(frame, "Introduzca un n�mero entero", "De Entero a Binario",
				JOptionPane.QUESTION_MESSAGE);

		if (dato != null) {

			int decimal = Integer.parseInt(dato);

			String binary = decimalToBinary(decimal);

			JOptionPane.showMessageDialog(null, " El n�mero " + decimal + "\n En binario es: " + binary);
			System.exit(0);
		}

	}

	public static String decimalToBinary(int decimal) {
		StringBuilder binary = new StringBuilder();

		while (decimal > 0) {
			int remainder = decimal % 2;
			binary.insert(0, remainder);
			decimal = decimal / 2;
		}

		return binary.toString();
	}

}
