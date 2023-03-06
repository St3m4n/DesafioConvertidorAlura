package ConvertidorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesTemperatura {

	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double valor) {
		
		String opcion = JOptionPane.showInputDialog(null,"Elije a la escala de Temperatura que quieras convertir ", "temperatura", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Celsius", 
						"De Kelnvin a Fahrenheit"}, "Seleccion").toString();
		
		switch (opcion) {
		case "De Celsius a Fahrenheit":
			temperatura.ConvertirCelsiusAFahrenheit(valor);
			break;
		case "De Celsius a Kelvin":
			temperatura.ConvertirCelsiusAKelvin(valor);
			break;
		case "De Fahrenheit a Celsius":
			temperatura.ConvertirFahrenheitACelsius(valor);
			break;
		case "De Fahrenheit a Kelvin":
			temperatura.ConvertirFahrenheitAKelvin(valor);
			break;
		case "De Kelvin a Celsius":
			temperatura.ConvertirKelvinACelsius(valor);
			break;
		case "De Kelvin Fahrenheit":
			temperatura.ConvertirKelvinAFahrenheit(valor);
			break;	
		}
	}

}
