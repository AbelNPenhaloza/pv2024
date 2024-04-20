package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Solicitamos al usuario que ingrese un numero en el rango [5,10]
		int tamanio = 0;
		
		boolean entradaValida = false;
		
		do {
			System.out.print("Ingrese un numero entero el el rango[5,10]: ");
			try {
				tamanio = Integer.parseInt(sc.nextLine());
				if(tamanio >= 5 && tamanio <= 10) {
					entradaValida = true;					
				}else {
					System.out.println("El numero ingresado esta fuera de rango permitido.");
				}
			}catch (NumberFormatException e){
				System.out.println("Error. Por favor, ingrese un numero entero valido.");					
			}
				
		}while(!entradaValida);
		
		// Crear el arreglo de tipo String con el tamanio ingresado por el usuario
		String [] nombres = new String[tamanio];
		
		//Solicitar al usuario que ingrese nombres de personas para guardar en el arreglo.
		for(int i = 0; i < nombres.length; i++) {
			boolean nombreValido = false;
			do {
				try {
					System.out.print("Ingrese el nombre de la Persona: "+ (i + 1)+": ");
					nombres[i] = sc.nextLine();
					if(nombres[i].matches("[a-zA-ZáéíóúñÑ\\s]+")) {// valida que solo contenga letras y espacios.
						nombreValido = true;
					} else { throw new
						  Exception("El nombre ingresado contiene caracteres no validos."); }
						 
				}catch (Exception e) {
					System.out.println("Error: "+ e.getMessage());
				}
			}while(!nombreValido);
			
		}
		System.out.println("");
		//Mostrar el contenido del array comenzando desde el primer indice 0.
		System.out.println("Contenido del arreglo comenzando desde el primer indice(0).");
		System.out.println("");
		for(int i = 0; i < nombres.length; i++) {
			System.out.println("Posicion: "+ i + " = " + nombres[i]);
		}
		System.out.println("");
		//Mostrar el contenido del arreglo comenzando desde el ultimo indice.
		System.out.println("Contenido del arreglo comenzando desde el ultimo indice: ");
		System.out.println("");
		for(int i = nombres.length -1; i >=0; i--) {
			System.out.println("Posicion: "+ i + " = " + nombres[i]);
		}
	}

}
