package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private Integer legajo;
	private Double salario;

	private static final double SALARIO_MINIMO = 21000.00;
	private static final double AUMENTO_POR_MERITOS = 20000.00;

	// Constructor parametrizado
	public Empleado(String nombre, Integer legajo, Double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		// Lógica para asignar el salario
		if (salario >= SALARIO_MINIMO) {
			this.salario = salario;
		} else {
			this.salario = SALARIO_MINIMO;
		}
	}
	// Metodo para mostrar los datos del Empleado
	public void mostrarDatos() {
		
		System.out.println("Nombre del Empleado: " + nombre);
		System.out.println("Legajo: " + legajo);
		System.out.println("Salario $: "+ salario);
	}
	// Metodo para dar aumento de Salario
	public void aumentarSalario() {
		salario+= AUMENTO_POR_MERITOS;
	}
	// Generacion de los Setters and Getter
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
