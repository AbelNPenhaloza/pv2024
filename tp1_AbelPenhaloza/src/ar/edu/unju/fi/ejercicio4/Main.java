package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Ingrese un número del 0 al 10 para calcular su factorial: ");
	boolean letra = sc.hasNextInt();
	if(letra == false) {
		System.out.println("El número debe estar dentro del rango 0 y 10");
	}else {
	
		int numero = sc.nextInt();
	
	
	//System.out.println(sc.hasNextInt());
	if(numero < 0 || numero > 10) {
		System.out.println("El número debe estar dentro del rango 0 y 10");
		return; // Salir del programa si el numero no esta en el rango valido.
	}
	
	//Calculo del factorial utilizando un bucle while
	int factorial = 1;
	int i= 1;
	while(i <= numero) {
		factorial*= i;
		i++;
	}
	
	//Mostrar el resultado por consola
	System.out.println("El factorial de "+ numero + " es: "+ factorial);

	}
	//Cerrar el scanner
	sc.close();
	}
}
