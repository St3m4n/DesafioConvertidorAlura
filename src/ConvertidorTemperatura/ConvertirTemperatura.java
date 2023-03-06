package ConvertidorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public void ConvertirCelsiusAFahrenheit(double valor) {
		// TODO Auto-generated method stub
		double temperaturaCon = (valor * 1.8f) + 32;
		temperaturaCon = (double)Math.round(temperaturaCon * 100d) /100;
		JOptionPane.showMessageDialog(null, valor + "°C equivalen a " + temperaturaCon + "°F");
		
	}

	public void ConvertirCelsiusAKelvin(double valor) {
		// TODO Auto-generated method stub
		double temperaturaCon = valor + 273.15;
		temperaturaCon = (double)Math.round(temperaturaCon * 100d) /100;
		JOptionPane.showMessageDialog(null, valor + "°C equivalen a " + temperaturaCon + "°K");
		
	}

	public void ConvertirFahrenheitACelsius(double valor) {
		// TODO Auto-generated method stub
		double temperaturaCon = (valor - 32) / 1.8f;
		temperaturaCon = (double)Math.round(temperaturaCon * 100d) /100;
		JOptionPane.showMessageDialog(null, valor + "°F equivalen a " + temperaturaCon + "°C");
		
	}

	public void ConvertirFahrenheitAKelvin(double valor) {
		// TODO Auto-generated method stub
		double temperaturaCon = ((valor - 32) / 1.8f) + 273.15;
		temperaturaCon = (double)Math.round(temperaturaCon * 100d) /100;
		JOptionPane.showMessageDialog(null, valor + "°F equivalen a " + temperaturaCon + "°K");
		
		
	}

	public void ConvertirKelvinACelsius(double valor) {
		// TODO Auto-generated method stub
		double temperaturaCon = valor - 273.15;
		temperaturaCon = (double)Math.round(temperaturaCon * 100d) /100;
		JOptionPane.showMessageDialog(null, valor + "°K equivalen a " + temperaturaCon + "°C");
		
		
	}

	public void ConvertirKelvinAFahrenheit(double valor) {
		// TODO Auto-generated method stub
		double temperaturaCon = ((valor - 273.15) * 1.8f) + 32;
		temperaturaCon = (double)Math.round(temperaturaCon * 100d) /100;
		JOptionPane.showMessageDialog(null, valor + "°K equivalen a " + temperaturaCon + "°F");
		
	}
}
