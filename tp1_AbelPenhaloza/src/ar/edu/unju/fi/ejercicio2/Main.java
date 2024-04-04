package ar.edu.unju.fi.ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		String nombrePais="Argentina";
		int edadPersona=30;
		double alturaEdificio=150.0;
		double precioProducto= 1200.50;
		String numeroTelefono= "3886078945";
		double coseno= Math.round(Math.cos(0.5)*100.0)/100.0;
		
		// Mostrar las variables por consola
        System.out.println("Nombre del país: " + nombrePais);
        System.out.println("Edad de la persona: " + edadPersona + " años");
        System.out.println("Altura del edificio: " + alturaEdificio + " metros");
        System.out.println("Precio del producto: $" + precioProducto);
        System.out.println("Número de teléfono: " + numeroTelefono);
        System.out.println("Cálculo del coseno de 0.5 es: " + coseno);
		
		

	}

}
