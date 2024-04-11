package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientesEspeciales;
	
	//Constantes para los adicionales de ingredientes especiales.
	
	public static final double ESPECIAL20 = 500;
	public static final double ESPECIAL30 = 750;
	public static final double ESPECIAL40 = 1000;
	
	/**
	 * Constructor por defecto
	 */
	public Pizza() {}
	
	// Metodo para calcular el precio de la pizza
	public void calcularPrecio() {
		switch (diametro) {
			case 20:
				precio= 4500;
				if (ingredientesEspeciales) {
					precio+= ESPECIAL20;
				}
				break;
			case 30:
				precio= 4800;
				if(ingredientesEspeciales) {
					precio += ESPECIAL30;
				}
				break;
			case 40:
				precio = 5500;
				if(ingredientesEspeciales) {
					precio += ESPECIAL30;
				}
				break;
			default:
				System.out.println("Diametro de la pizza no valido.");
				break;
		}
		
	}
	
	//Metodo que actualiza el valor del atributo area.
	public void calcularArea() {
		area = Math.PI * Math.pow((diametro/2.0), 2);		
	}
	//Metodos accesores
		
	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredienteEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredienteEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	
}
