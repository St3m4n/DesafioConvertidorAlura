package ConvertidorMonedas;

import javax.swing.JOptionPane;

public class OpcionesMonedas {

	ConvertirMonedas moneda = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
	
		String opcion = JOptionPane.showInputDialog(null,"Elije la moneda que quieras convertir ", "monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"De CLP a Dolar", "De CLP a Euro", "De CLP a Libra Esterlina", "De CLP a Yen Japonés", "De CLP a Yen sul-coreano", 
						"De Dolar a CLP","De Euro a CLP", "De Libra Esterlina a CLP", "De Yen Japonés a CLP", "De Yen sul-coreano a CLP" }, "Seleccion").toString();
		
		switch (opcion) {
		case "De CLP a Dolar":
			moneda.ConvertirClpADolar(valor);
			break;
		case "De Dolar a CLP":
			moneda.ConvertirDolarAClp(valor);
			break;
		case "De CLP a Euro":
			moneda.ConvertirClpAEuro(valor);
			break;
		case "De Euro a CLP":
			moneda.ConvertirEuroAClp(valor);
			break;
		case "De CLP a Libra Esterlina":
			moneda.ConvertirClpALibraEsterlina(valor);
			break;
		case "De Libra Esterlina a CLP":
			moneda.ConvertirLibraEsterlinaAClp(valor);
			break;
		case "De CLP a Yen Japonés":
			moneda.ConvertirClpAYenJap(valor);
			break;
		case "De Yen Japonés a CLP":
			moneda.ConvertirYenJapAClp(valor);
			break;
		case "De CLP a Yen sul-coreano":
			moneda.ConvertirClpAWonSulCoreano(valor);
			break;
		case "De Yen sul-coreano a CLP":
			moneda.ConvertirWonSulCoreanoAClp(valor);
			break;
	
	}
	}

}
