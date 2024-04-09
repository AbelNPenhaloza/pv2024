package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;

	
	
	/**
	 * Constructor por defecto
	 */
	public CalculadoraEspecial() {}
	
	// Metodo para calcular la Sumatoria.
	public double calcularSumatoria() {
		double sumatoria=0;
		for(int i=1; i<= n; i++) {
			sumatoria += Math.pow(i * (i + 1)/2, 2);
			
		}
		return Math.round(sumatoria * 100.0)/ 100.0;
	}
	// Metodo para calcular la Productoria
	
	public double calcularProductoria() {
		double productoria= 1;
		for(int p= 1; p<= n; p++) {
			productoria*= p * (p + 4);
			
		}
		return Math.round(productoria * 100.0) / 100.0;
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	
}
