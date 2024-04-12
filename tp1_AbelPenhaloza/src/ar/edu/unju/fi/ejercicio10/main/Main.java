package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pizza pizza;
		//Crear tres objetos de la clase Pizza
		for(int i=1; i<=3; i++) {
						
			pizza = new Pizza();
			
			// Ingreso de datos de la pizza
			int diametro=0;
			boolean diametroValido= false;
			
			while(!diametroValido) {
				try {
					System.out.print("Ingreso el diametro de la Pizza [20,30,40]: ");
					diametro = sc.nextInt();
					if(diametro == 20 || diametro== 30 || diametro == 40) {
						diametroValido= true;
					} else {
						System.out.println("Diametro no valido. Ingrese un DIAMETRO VALIDO");
					}
				}catch (NumberFormatException e) {
					System.out.println("Ingrese un valor entero");
				}
			}
			pizza.setDiametro(diametro);
			System.out.print("¿Lleva ingredientes Especiales? (true / false): ");
			pizza.setIngredienteEspeciales(sc.nextBoolean());
			
			//Calcular precio y area.
			pizza.calcularPrecio();
			pizza.calcularArea();
			//Mostrar los resultados
			System.out.println("** Pizza " + i + " **");
			System.out.println("Diametro= "+(int)pizza.getDiametro());
			System.out.println("Ingredientes Especiales= "+ pizza.isIngredienteEspeciales());
			System.out.println("Precio de la Pizza= $ "+ pizza.getPrecio());
			System.out.println("Area de la Pizza= "+ pizza.getArea());
			
			sc.nextLine();
		}
		
		sc.close();
				
	}

}
