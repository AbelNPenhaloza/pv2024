package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// crfear persona 1
		Persona persona1= new Persona();
		
		// crear persona 1
		Persona persona2= new Persona("23456789","Jose", LocalDate.of(2000, 2, 24), "Salta");
		
		// crear persona 1
		Persona persona3= new Persona("23456456","Jose", LocalDate.of(2001, 3, 23));
		
	}

}
