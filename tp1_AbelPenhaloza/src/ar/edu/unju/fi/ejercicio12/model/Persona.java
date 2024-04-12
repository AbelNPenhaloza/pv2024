package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;
	
	/**
	 * Constructor por defecto
	 */
	public Persona() {}
	//Metodos para obtener la edad de la persona
	public int getEdad() {
		Calendar fechaActual = Calendar.getInstance();
		int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
		//Comprobar si cumplio a;os o no.
		if (fechaActual.get(Calendar.DAY_OF_YEAR)< fechaNacimiento.get(Calendar.DAY_OF_YEAR)){
			edad--;
		}
			
		return edad;
	}
	public String getSignoZodiaco() {
		int mes = fechaNacimiento.get(Calendar.MONTH)+ 1;
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		
		String []signos = {"Capricornio", "Acuario", "Piscis", "Aries", "Tauro"
				, "Géminis", "Cáncer", "Leo", "Virgo", "Libra", "Escorpio"
				, "Sagitario"};
		//Día limite de cada signo zodiacal.
		int [] limites = {21,20,20,20,20,20,21,22,23,23,24,22};
		
		int signoIndice = mes -1; // Índice en el arreglo de signos.
		
		if (dia >= limites[signoIndice]) {
			signoIndice = (signoIndice + 1) % 12; // Si pasamos del ultimo signo zodiacal.
		}
		return signos[signoIndice];
	}	
	
	public String getEstacionAnio(){
		int diaDelAño = fechaNacimiento.get(Calendar.DAY_OF_YEAR);
		
		//Definir los limites del día del año para cada estación.
		int[] limites = {80,172,264,356};
		
		String[] estaciones = {"Verano", "Otoño","Invierno", "Primavera"};
		
		// Iterar sobre los limites y verificar en que estación cae el día del año.
		
		for (int i = 0; i < limites.length; i++) {
			if(diaDelAño < limites[i]) {
				return estaciones[i];
			}
		}
		//Si el dia del año no esta dentro de ninguno de los límites anteriores.
		return "Desconocida";
	}
	 // Método para mostrar los datos de la persona y el resultado de cada método
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento.get(Calendar.DAY_OF_MONTH) + "/" +
                (fechaNacimiento.get(Calendar.MONTH) + 1) + "/" +
                fechaNacimiento.get(Calendar.YEAR)); // Se suma 1 porque en Calendar los meses van de 0 a 11
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Signo del zodiaco: " + getSignoZodiaco());
        System.out.println("Estación del Año: " + getEstacionAnio());
    }
	
	//Metodos Accesores
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
}
