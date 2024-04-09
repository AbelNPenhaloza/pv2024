package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimineto;
	private String provincia;
	
	
	/**
	 * 
	 */
	public Persona() {
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param fechaNacimineto
	 */
	public Persona(String dni, String nombre, LocalDate fechaNacimineto) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimineto = fechaNacimineto;
		this.provincia = "Jujuy";
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param fechaNacimineto
	 * @param provincia
	 */
	public Persona(String dni, String nombre, LocalDate fechaNacimineto, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimineto = fechaNacimineto;
		this.provincia = provincia;
	}
	// Metodos
	public int calcularEdad() {
		int edad= 0;
		return edad;
	}
	
	public boolean verificarEdad() {
		boolean bandera= true;
		return bandera;
	}
	
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

	public LocalDate getFechaNacimineto() {
		return fechaNacimineto;
	}

	public void setFechaNacimineto(LocalDate fechaNacimineto) {
		this.fechaNacimineto = fechaNacimineto;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", fechaNacimineto=" + fechaNacimineto + ", provincia="
				+ provincia + "]";
	}
	
	
	
}
