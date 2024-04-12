package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {
	//Variables globales
	private static Scanner sc = new Scanner(System.in);
	private static Calendar fechaNacimiento = Calendar.getInstance();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona persona = new Persona();
		System.out.println("Ingrese los datos de la persona");
		System.out.println("");
		
		System.out.print("Ingrese el nombre de la persona: ");
		persona.setNombre(sc.nextLine());
		
		System.out.print("Ingrese el día de Nacimiento: ");
		int dia= sc.nextInt();
		System.out.print("Ingrese el mes de Nacimiento: ");
		int mes= sc.nextInt()- 1;// Se resta 1 porque en Calendar los meses van desde 0 a 11.
		System.out.print("Ingrese el año de Nacimiento: ");
		int anio= sc.nextInt();
		//Crea objeto Calendar con los datos ingresados.
		fechaNacimiento.set(anio, mes, dia);
		persona.setFechaNacimiento(fechaNacimiento);
		
		//Mostar los datos de la persona y el el resultado de cada metodo
		persona.mostrarDatos();
		sc.close();
		
	}
	
	
}
