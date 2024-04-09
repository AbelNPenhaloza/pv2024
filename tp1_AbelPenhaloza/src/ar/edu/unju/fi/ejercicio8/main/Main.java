package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Solicitar al usuario el ingreso de un numero
		System.out.print("Ingrese el valor de n: ");
		int n = sc.nextInt();
		
		//Crear el objeto de la clase CalculadorEspecial
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		calculadora.setN(n);

		// Calcular y mostrar la sumatoria
        System.out.println("La sumatoria es: " + calculadora.calcularSumatoria());
        
        // Calcular y mostrar la productoria
        System.out.println("La productoria es: " + calculadora.calcularProductoria());
        
        sc.close();
		
	}

}
