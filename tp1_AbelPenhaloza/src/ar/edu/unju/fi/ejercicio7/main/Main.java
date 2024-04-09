package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Solicitar datos al Usuario
		
		System.out.print("Ingrese el nombre del Empleado: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese el legajo del Empleado: ");
		Integer legajo = sc.nextInt();
		
		System.out.print("Ingrese el salario del Empleado: ");
		Double salario = sc.nextDouble();
		//Crear el objeto Empleado utilizando constructor parametrizado
		Empleado empleado = new Empleado(nombre,legajo,salario);
		System.out.println("-------------------------------------");
		System.out.println("Datos del empleado antes del aumento:");
		empleado.mostrarDatos();
		
		empleado.aumentarSalario();
		System.out.println("\nDatos del empleado después del aumento:");
		empleado.mostrarDatos();
		
		sc.close();
		
		
		

	}

}
