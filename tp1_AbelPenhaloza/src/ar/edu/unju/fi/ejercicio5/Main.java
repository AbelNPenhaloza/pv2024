package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número entre 1 y 9 para mostrar su tabla de multiplicar: ");
		int numero = sc.nextInt();
		// Verificar si el numero esta dentro del rango valido.
		if(numero < 1 || numero > 9) {
			System.out.println("El número debe estar dentro del rango [1, 9]");
			return;
		}
		
		//Mostrar la tabla de multiplicar utilizando un bucle for.
		System.out.println("----------------------------------------------");
		System.out.println("Tabla de multiplicar del número "+ numero+ ":");
		
		for(int i=1; i<= 10; i++) {
			System.out.println(numero + " x " + i + "= " + (numero*i));
		}
		//Cerrar el scanner
		sc.close();

	}

}
