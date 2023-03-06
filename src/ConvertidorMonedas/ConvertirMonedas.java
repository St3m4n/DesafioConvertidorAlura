package ConvertidorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

		// Tipo de cambio a la fecha 02/03/2023 
	public void ConvertirClpADolar(double valor) {
		double monedaDolar = valor/812.88;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Dolares");
	}
	public void ConvertirDolarAClp(double valor) {
		double monedaDolar = valor*812.88;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Pesos Chilenos");
	}
	public void ConvertirClpAEuro(double valor) {
		double monedaDolar = valor/861.41;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Euros");
	}
	public void ConvertirEuroAClp(double valor) {
		double monedaDolar = valor*861.41;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Pesos Chilenos");
	}
	public void ConvertirClpALibraEsterlina(double valor) {
		double monedaDolar = valor/971.39;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Libras Esterlinas");
	}
	public void ConvertirLibraEsterlinaAClp(double valor) {
		double monedaDolar = valor*971.39;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Pesos Chilenos");
	}
	public void ConvertirClpAYenJap(double valor) {
		double monedaDolar = valor/5.95;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Yenes Japoneces");
	}
	public void ConvertirYenJapAClp(double valor) {
		double monedaDolar = valor*5.95;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Pesos Chilenos");
	}
	public void ConvertirClpAWonSulCoreano(double valor) {
		double monedaDolar = valor/0.62;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Wones Sul-Coreanos");
	}
	public void ConvertirWonSulCoreanoAClp(double valor) {
		double monedaDolar = valor*0.62;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Pesos Chilenos");
	}
}
