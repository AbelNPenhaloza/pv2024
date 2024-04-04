package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitar al usuario que ingrese un número entero.
		System.out.print("Por favor ingrese un número entero: ");
		int numero= sc.nextInt();
		
		//Verificar si el número ingresado es par o impar y realizar el calculo correspondiente.
		
		if(numero == 0) {
			System.out.println("El número ingresado es 0");
		}else if(numero % 2 == 0) {
			System.out.println("El número ingresado "+ numero +" es par.");
			int resultado= numero *3;
			System.out.println("El triple del numero es: "+ resultado);
		}else {
			// El numero es impar, debe mostrar el doble
			System.out.println("El número ingresado "+ numero + " es impar.");
			int resultado = numero *2;
			System.out.println("El doble del número es: "+ resultado);
		}
		// Cerramos el Scanner para liberar recursos.
		sc.close();
		
		}

}
