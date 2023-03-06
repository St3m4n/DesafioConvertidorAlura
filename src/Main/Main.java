package Main;

import javax.swing.*;

import ConvertidorMonedas.OpcionesMonedas;
import ConvertidorTemperatura.OpcionesTemperatura;

public class Main {
	
	public static void main(String[] args){
		
		OpcionesMonedas conversion = new OpcionesMonedas();
		OpcionesTemperatura conversionT = new OpcionesTemperatura();
		boolean continuar = true;
		
		while (continuar) {
			String opciones = JOptionPane.showInputDialog(null, " Seleccione una opción de conversión", "Menu", 
					JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			switch(opciones) {
			case "Conversor de Monedas":
				boolean valido = false;
				while (!valido) {
					try {
						String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
						double valorRecibido = Double.parseDouble(input);
						conversion.ConvertirMonedas(valorRecibido);
						valido = true;
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "No se aceptan caracteres no numericos");
					}
					
				}							
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {
					continuar = true;
				}else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					continuar = false;
				}break;				
			
			case "Conversor de Temperatura":
				boolean valido2 = false;
				while (!valido2) {
					try {
						String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
						double valorRecibido = Double.parseDouble(input);
						conversionT.ConvertirTemperatura(valorRecibido);
						valido2 = true;
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "No se aceptan caracteres no numericos");
					}
					
				}							
				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuestaT) {
					continuar = true;
				}
				if (JOptionPane.CANCEL_OPTION == respuestaT){
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					continuar = false;
				}else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					continuar = false;					
				}
				break;
			}
		}
	}

}
