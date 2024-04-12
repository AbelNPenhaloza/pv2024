package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int [] numeros = new int[8];
		//Pedir al usuario que ingrese los numeros para cargar el arreglo.
		for(int i = 0; i<numeros.length; i++) {
			System.out.print("Ingrese el valor para el arreglo en la posicion "+ i + ":");
			numeros[i]= sc.nextInt();
		}
		
		//Mostrar por consola en indice y el valor almacenado en el arreglo.
		System.out.println("Elementos del arreglo");
		System.out.println("***************************");
		for(int i=0; i < numeros.length; i++) {
			System.out.println("Indice "+i+ " = "+ numeros[i]);
		}
		sc.close();
		
	}
	
	
}
