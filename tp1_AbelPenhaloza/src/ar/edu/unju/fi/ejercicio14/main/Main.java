package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int tamanio= 0;
		boolean entradaValida= false;
		
		//Solicitar al usuario que ingrese un numero entero en el rango [3,10]
		
		while(!entradaValida) {
			
			System.out.print("Ingrese un numero entero en el rango [3, 10]: ");
			
			if(sc.hasNextInt()) {
				
				tamanio = sc.nextInt();
				
				if(tamanio >=3 && tamanio <= 10) {
					entradaValida = true;
					
				}else {
					System.out.println("El numero ingresado esta fuera del rango.");
				}
			}else {
				System.out.println("Por favor, ingrese un numero entero valido.");
				sc.nextLine(); //Limpia el buffer del scanner
			}
		}
		int [] numeros = new int [tamanio];
		//Solicitar al usuario que ingrese valores para completar el array.
		for(int i=0; i < tamanio; i++) {
			boolean numeroValido = false;
			
			while(!numeroValido) {
				System.out.println("");
				System.out.print("Ingrese un numero entero para la posicion "+i+": ");
				if(sc.hasNextInt()) {
					numeros[i] = sc.nextInt();	
					numeroValido=true;
				}else {
					System.out.println("Ingrese un numero entero valido.");
					sc.nextLine();
				}
			}
		}
		//Mostrar los valores de cada posicion en el arreglo u la suma de todos los valores.
		mostrarValores(tamanio, numeros);

	}
	private static void mostrarValores(int tamanio, int[] numeros) {
		System.out.println("");
		System.out.println("Valores del arreglo");
		int suma=0;
		for(int i =0; i< tamanio; i++) {
			System.out.println("Posicion "+i+": "+ numeros[i]);
			suma+= numeros[i];
		}
		System.out.println("La Suma de todos los valores del arreglo: "+ suma);
		sc.close();
	}
}
