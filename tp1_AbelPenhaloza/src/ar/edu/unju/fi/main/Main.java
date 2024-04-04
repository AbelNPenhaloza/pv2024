package ar.edu.unju.fi.main;

import ar.edu.unju.fi.teoria1.ConversorDeMonedas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double montoAconvertir = 100;
		double montoConvertidoD = ConversorDeMonedas.convertirDolarApesos(montoAconvertir);
		double montoConvertidoP = ConversorDeMonedas.convertirPesosAdolar(montoAconvertir);
		System.out.println("El monto convertido es: " + montoConvertidoD);
	}

}
