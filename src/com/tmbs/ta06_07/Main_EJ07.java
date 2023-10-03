package com.tmbs.ta06_07;

import javax.swing.JOptionPane;

/*
 * Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra
moneda, estas pueden ser a dolares, yenes o libras. El método tendrá como parámetros, la
cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor,
mostrara un mensaje indicando el cambio (void).

El cambio de divisas son:

* 0.86 libras es un 1€
* 1.28611 es un 1€
* 129.852 yenes es un 1€*/
public class Main_EJ07 {
	


	private final static Double DOLAR = 1.28611;
	private final static Double LIBRA = 0.86;
	private final static Double YEN = 129.854;
	
	public static void main(String[] args) {
			
	String[] currencies = { "Dolares", "Libras", "Yenes" }; //monedas
	double euros= 0;
	int currencyOptions = -1;
	
		do {
			
			String inputCantidad = JOptionPane.showInputDialog("Introduce la cantidad de euros\nque deseas a convertir.");
			euros = isAmountOfEurosValidated(inputCantidad);

		} while (euros == 0);

	
	
		if (euros != JOptionPane.CLOSED_OPTION) {
			
			System.out.println(JOptionPane.CLOSED_OPTION);
			currencyOptions = JOptionPane.showOptionDialog(null, "A que moneda desa cambiar", "Cambio de EUROS",
					JOptionPane.DEFAULT_OPTION, 
					JOptionPane.QUESTION_MESSAGE,
					null,
					currencies,
					currencies[0]);
							
		}
		
		if (currencyOptions != JOptionPane.CLOSED_OPTION) {
			conversorDivisas( euros, currencies[currencyOptions]);
		}
		
		JOptionPane.showMessageDialog(null, "EXIT APP GRACIAS POR SU CONFIANZA","Cambio de EUROS", -1);

	}



// Metodo que convierte y muestra por pantalla la cantidad de euros pasada por parametro a la divisa indicada
	public static void conversorDivisas(double eur, String tipoDivisa) {
		
		String res = null;

		switch (tipoDivisa) {

		case "Dolares": res = eur + "€ euros \n" + (eur * DOLAR ) + "$ Dolares.";break;
		case "Libras": res = eur + "€ euros \n " + (eur * LIBRA) + "£ Libras."; break;
		case "Yenes": res = eur + "€ euros\n " + (eur * YEN) + "¥ Yenes."; break;
		}
		
		JOptionPane.showMessageDialog(null, res , "Cambio de EUROS a " + tipoDivisa.toUpperCase() , 1);
	}
	
	private static double isAmountOfEurosValidated(String inputCantidad) {
		try {
			return Double.parseDouble(inputCantidad);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Tienes que introducir una cantidad valida." ,"Cambio de EUROS", 2);
			return 0;
		} catch (NullPointerException npe) {
			return -1;
		}
	}

}
