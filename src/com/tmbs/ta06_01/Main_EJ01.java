package com.tmbs.ta06_01;

import javax.swing.JOptionPane;

/** 1) Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. Pediremos
que figura queremos calcular su área y según lo introducido pedirá los valores necesarios
para calcular el área. Crea un método por cada figura para calcular cada área, este devolverá
un número real. Muestra el resultado por pantalla.
 * */
public class Main_EJ01 {
	
	public static void main(String[] args) {

		String[] options = { "Circulo", "Triangulo", "Cuadrado", "Salir" };

		int i = JOptionPane.showOptionDialog(null, "El area de que figura quieres calcular?",
				"Calculadora de area", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
				options[3]);
		
		if (i == JOptionPane.CLOSED_OPTION) i = 3; // Controla el cierre del JOPane
	
		JOptionPane.showMessageDialog(null, calculadorArea(options[i]));
		
	}
	

	private static  String calculadorArea(String opciones) {		
			
			if (opciones.equals("Circulo"))return areaCirculo();				
			if (opciones.equals("Triangulo"))return areaTriangulo();				
			if (opciones.equals("Cuadrado")) return areaCuadrado();				
			if (opciones.equals("Salir")) return "EXIT APP";				  
			
			return opciones; 

	}
	
	private static  String areaCirculo() {
		
		double radio = aksValue("Introduce el radio del circulo");
		return "El area del circulo es de " + ( Math.pow(radio, 2) * Math.PI) ;
	}
	
	private static String areaTriangulo() {
		
		double base = aksValue("Introduce la base del triangulo");
		double altura = aksValue("Y su altura");
		return "El area del Triangulo es de " + (base * altura)/2;

	}
	
	private static String areaCuadrado() {
		
		double lado = aksValue("Introduce el lado del cuadrado");
		return "El area del cuadrado es de " +  Math.pow(lado, 2);
	}
	
	private static double aksValue(String text) {
		return Double.parseDouble(JOptionPane.showInputDialog(text) );

	}

}
