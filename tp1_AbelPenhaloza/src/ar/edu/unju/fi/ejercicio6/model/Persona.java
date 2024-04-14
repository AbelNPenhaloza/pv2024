package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	/**
	 * Constructor por defecto
	 */
	public Persona() {}

	/**
	 * Constructor parametrizado con el atributo provincia inicializado en Jujuy.
	 * @param dni de la persona
	 * @param nombre de la persona
	 * @param fechaNacimineto de la persona
	 */
	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}

	/**
	 * Constructor parametrizado completo
	 * @param dni de la persona
	 * @param nombre de la persona
	 * @param fechaNacimineto de la persona
	 * @param provincia de donde es la persona
	 */
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	// Metodos de la clase
	
	public int getEdad() {
		
		return LocalDate.now().getYear() - fechaNacimiento.getYear();
	}
	
	public boolean esMayorDeEdad() {
		return getEdad()> 18;
	}
	public void mostrarDatos() {
		//Formatear de fecha
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("DNI: "+ dni);
		System.out.println("Nombre: "+ nombre);
		System.out.println("Fecha de Nacimiento: "+ fechaNacimiento.format(formatter));
		System.out.println("Provincia: "+ provincia);
		if(esMayorDeEdad()) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("No es mayor de edad");
		}
	}
	
	//Metodos accesos
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimineto(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	
	
}
