package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		Persona persona1= new Persona();
		crearPersonaPorDefecto("Va a crear a la Persona 1", persona1);
		System.out.println("---------------------------");
		persona1.mostrarDatos();
		
		
		Persona persona2 = crearPersonaConDniNombreFechaNacimiento("Va a crear a la Persona 2");
		System.out.println("---------------------------");
		persona2.mostrarDatos();
		
		Persona persona3 = crearPersonaParametrizada("Va a crear a la Persona 3");
		System.out.println("---------------------------");
		persona3.mostrarDatos();
		
		sc.close();
	}
	
	private static Persona crearPersonaPorDefecto(String mensaje, Persona persona1) {
		System.out.println(mensaje);
		System.out.println("***************************");
		System.out.print("Ingrese el DNI:");
        String dni = sc.nextLine();
        System.out.print("Ingrese el Nombre:");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la Fecha de Nacimiento (dd/MM/yyyy):");
        LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Ingrese la Provincia:");
        String provincia = sc.nextLine();
        
        persona1.setDni(dni);
        persona1.setNombre(nombre);
        persona1.setFechaNacimiento(fechaNacimiento);
        persona1.setProvincia(provincia);
        
        return persona1;
	}
	
	private static Persona crearPersonaConDniNombreFechaNacimiento(String mensaje) {
		
		System.out.println("-----------------------------");
		System.out.println(mensaje);
		System.out.println("*****************************");
		System.out.print("Ingrese DNI: ");
		String dni = sc.nextLine();
		System.out.print("Ingrese Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese fecha de Nacimiento(dd/MM/yyyy): ");
		LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return new Persona(dni,nombre, fechaNacimiento);
	}
	
	  private static Persona crearPersonaParametrizada(String mensaje) {
	  System.out.println("-----------------------------");
	  System.out.println(mensaje);
	  System.out.println("*****************************");
	  System.out.print("Ingrese DNI: "); String dni = sc.nextLine();
	  System.out.print("Ingrese Nombre: "); String nombre = sc.nextLine();
	  System.out.print("Ingrese fecha de Nacimiento(dd/MM/yyyy): "); LocalDate
	  fechaNacimiento = LocalDate.parse(sc.nextLine(),
	  DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	  System.out.print("Ingrese la Provincia: "); String provincia= sc.nextLine();
	  return new Persona(dni,nombre, fechaNacimiento, provincia);
	  
	  }
	 
	

}
