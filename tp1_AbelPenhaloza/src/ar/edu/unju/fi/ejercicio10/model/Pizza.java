package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private double diametro;
	private double precio;
	private double area;
	private boolean ingredienteEspeciales;
	public static final double ESPECIAL20 = 500;
	public static final double ESPECIAL30 = 750;
	public static final double ESPECIAL40 = 1000;
	
	public double calcularPrecio() {
		//if(diametro ==20 && !ingredientesEspeciales) {
			precio=4500;
		//}else if(diametro ==20 && ingredientesEspeciales) {
			precio= 4500 + ESPECIAL20;
		//}
		return 0;
	}
}
