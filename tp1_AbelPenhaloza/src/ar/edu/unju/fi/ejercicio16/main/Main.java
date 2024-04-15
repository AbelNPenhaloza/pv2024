package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {
	//Se declara scanner como variable global.
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String [] nombres = new String[5];
		
		//Pedir al usuario que ingrese los nombres por consola.
		System.out.println("Ingrese 5 nombres.");
		
		for(int i = 0; i < nombres.length; i++) {
			nombres[i] = obtenerNombre();
		}
		
		//Mostrar el contenido del arreglo.
		System.out.println("\nValores guardados en el arreglo.");
		mostrarNombresYIndices(nombres);
				
		// Mostrar el tamanio del arreglo
		System.out.println("Tamaño del arreglo: " + nombres.length);
		
		// Solicitar al usuario que ingrese el indice de un elemento a eliminar.
		byte indiceEliminar;
		
		do {
			indiceEliminar = obtenerIndiceEliminar();
			
		}while(indiceEliminar <0 || indiceEliminar >= nombres.length);
		
		//Eliminar el elemento del arreglo y realizar el desplazamiento si es necesario.
		
		eliminarElemento(nombres, indiceEliminar);
		
		//Mostrar nuevamente el arreglo
		System.out.println("Arreglo despues de eliminar el elemento.");
		mostrarNombresYIndices(nombres);
		//Cerrar el Scanner
		sc.close();

	}
	// Metodo para obtener un nombre del usuario, con manejo de excepciones.
	private static String obtenerNombre() {
		String nombre ="";
		boolean nombreValido = false;
		
		do {
			try {
				System.out.print("Nombre: ");
				nombre = sc.nextLine();
				if(nombre.matches("[a-zA-ZáéíóúñÑ\\s]+")) {// Valida que solo contenga letras y espacios
					nombreValido = true;
				}else {
					throw new Exception("El nombre ingresado contiene caracteres no validos.");
				}
			}catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				sc.nextLine();//Limpiar el buffer del scanner
			}
		}while(!nombreValido);
		return nombre;
	}
	//Metodo para obtener un nombre del usuario, con manejo de excepciones.
	private static byte obtenerIndiceEliminar() {
		byte indice = 0;
		boolean entradaInvalida = true;
		do {
			try {
				System.out.print("Ingrese el indice del elemento a eliminar (0-4): ");
				indice = sc.nextByte();
				entradaInvalida= false;
			}catch (Exception e) {
				System.out.println("Error: Se esperaba un numero entre 0 y 4.");
				sc.nextLine();//Limpiar el buffer del scanner
			}
		}while(entradaInvalida);
		return indice;
	}
	//Metodo para mostrar los valores guardados en el arreglo
	private static void mostrarNombresYIndices(String[] nombres) {
		int indice =0;
		while(indice < nombres.length) {
			System.out.print(nombres[indice]+"\t");
			indice++;
		}
		System.out.println();//Salto de linea
		
		//Mostrar los indices del arreglo
		indice = 0;
		while(indice < nombres.length) {
			System.out.print(indice+ "\t");
			indice++;
		}
		System.out.println();//Salto de linea
	}
	//Metodo para eliminar un elemento del arreglo y realizar el desplazamiento si es necesario.
	private static void eliminarElemento(String[] arreglo, int indice) {
		for(int i = 0; i < arreglo.length -1; i++) {
			arreglo[i] = arreglo[i +1];
		}
		arreglo[arreglo.length -1]= ""; //Asignar espacio en blanco al ultimo elemento
	}
}
