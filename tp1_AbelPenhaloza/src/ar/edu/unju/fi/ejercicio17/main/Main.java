package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio17.model.Posicion;

public class Main {
	private static final Scanner sc = new Scanner(System.in);
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static void main(String[] args) {
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
		int opcion;
		
		do {
			mostrarMenu();
			opcion = obtenerOpcionValida();
			switch (opcion) {
			case 1:
				altaJugador(jugadores);
				break;
			case 2:
				mostrarDatosJugador(jugadores);
				break;
			case 3:
				mostrarJugadoresOrdenadosApellido(jugadores);
				break;
			case 4:
				modificarDatosJugador(jugadores);
				break;
			case 5:
				eliminarJugador(jugadores);
				break;
			case 6: 
				mostrarCantidadTotalJugadores(jugadores);
				break;
			case 7:
				mostrarCantidadJugadoresNacionalidad(jugadores);
				break;
			case 8:
				System.out.println("Hasta luego!");
				break;
			default:
				System.out.println("Opción inválida. Por favor, ingrese un opcián válida.");
				break;
			}
		}while(opcion !=8);

	}
	//Metodo para mostrar el menu.
	private static void mostrarMenu() {
		System.out.println("Menú de opciones.");
		System.out.println();
        System.out.println("1 - Alta de Jugador");
        System.out.println("2 - Mostrar los datos del Jugador Requerido");
        System.out.println("3 - Mostrar todos los Jugadores ordenados por Apellido");
        System.out.println("4 - Modificar los datos de un Jugador");
        System.out.println("5 - Eliminar un Jugador");
        System.out.println("6 - Mostrar la cantidad total de Jugadores");
        System.out.println("7 - Mostrar la cantidad de Jugadores de una Nacionalidad");
        System.out.println("8 - Salir");
	}
	
	//Metodo para validar la entrada del usuario.
	private static int obtenerOpcionValida() {
		int opcion =0;
		boolean opcionValida = false;
		do {
			try {
				System.out.print("Ingrese una opción: ");
				opcion = sc.nextInt();
				opcionValida = true;
			}catch (InputMismatchException e) {
				System.out.println("Por favor, ingrese un número válido.");
				sc.next(); //Limpia el buffer del scanner
			}
		}while(!opcionValida);
		return opcion;
	}
	//1- Metodo para dar alta a un Jugador.
	private static void altaJugador(ArrayList<Jugador> jugadores) {
		System.out.print("Ingrese el Nombre: ");
		String nombre = sc.next();
		System.out.print("Ingrese el Apellido: ");
		String apellido = sc.next();
		LocalDate fechaNacimiento= obtenerFechaNacimientoValida();
		System.out.print("Ingrese la Nacionalidad: ");
		String nacionalidad = sc.next();
		System.out.print("Ingrese la Estatura: ");
		double estatura = sc.nextDouble();
		System.out.print("Ingrese la Peso: ");
		double peso = sc.nextDouble();
		Posicion posicion = obtenerPosicionValida();
		
		Jugador jugador = new Jugador(nombre,apellido,fechaNacimiento,nacionalidad,estatura,peso,posicion);
		jugadores.add(jugador);
		System.out.println("Jugador agregado correctamente.");
		
	}
		
	//2- Metodo para Mostrar datos del jugador solicitado
	private static void mostrarDatosJugador(ArrayList<Jugador> jugadores) {
		System.out.print("Ingrese el nombre del jugador Requerido: ");
		String nombre = sc.next();
		System.out.print("Ingrese el apellido del jugador Requerido: ");
		String apellido = sc.next();
		
		for(Jugador jugador: jugadores) {
			if(jugador.getNombre().equalsIgnoreCase(nombre)&& jugador.getApellido().equalsIgnoreCase(apellido)) {
				System.out.println("Datos del Jugador Seleccionado.");
				System.out.println();
				System.out.println("Nombre: " + jugador.getNombre());
				System.out.println("Apellido: " + jugador.getApellido());
				System.out.println("Fecha de Nacimiento: " + jugador.getFechaNacimiento());
				System.out.println("Nacionalidad: " + jugador.getNacionalidad());
				System.out.println("Estatura: " + jugador.getEstatura());
				System.out.println("Peso: " + jugador.getPeso());
				System.out.println("Posición: " + jugador.getPosicion());
				return;
				
			}
		}
		System.out.println("Jugador no Encontrado.");
	}
	//3- Metodo mostrar jugadores por apellido.
	private static void mostrarJugadoresOrdenadosApellido(ArrayList<Jugador> jugadores) {
		if(jugadores.isEmpty()) {
			System.out.println("No hay Jugadores Registrados.");
			return;
		}
		
		ArrayList<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
		Collections.sort(jugadoresOrdenados, Comparator.comparing(Jugador::getApellido));
		System.out.println("Listado de los jugadores ordenados por Apellido.");
		
		for(Jugador jugador: jugadoresOrdenados) {
			System.out.println(jugador.getApellido() + " , " + jugador.getNombre());
		}
		
	}
	//4- Metodo para modificar los datos de un jugador
	private static void modificarDatosJugador(ArrayList<Jugador> jugadores) {
		if(jugadores.isEmpty()) {
			System.out.println("No hay jugadores registrados");
			return;
		}
		
		System.out.print("Ingrese el Nombre del jugador a modificar: ");
		String nombre = sc.next();
		System.out.print("Ingrese el Apellido del jugador a modificar: ");
		String apellido = sc.next();
		
		boolean encontrado = false;
		
		for(Jugador jugador: jugadores) {
			if(jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
				encontrado = true;
				
				System.out.println("¿Qué dato desea modificar?");
				System.out.println("1 - Nombre");
	            System.out.println("2 - Apellido");
	            System.out.println("3 - Fecha de Nacimiento");
	            System.out.println("4 - Nacionalidad");
	            System.out.println("5 - Estatura");
	            System.out.println("6 - Peso");
	            System.out.println("7 - Posición");
	            
	            int opcion = sc.nextInt();
	            //sc.next();//Limpiar el buffer del Scanner
	            
	            switch(opcion) {
	            case 1:
	            	System.out.print("Ingrese el nuevo Nombre: ");
	            	String nuevoNombre = sc.next();
	            	jugador.setNombre(nuevoNombre);
	            	break;
	            case 2:
	            	System.out.print("Ingrese el nuevo Apellido: ");
	            	String nuevoApellido = sc.next();
	            	jugador.setApellido(nuevoApellido);
	            	break;
	            case 3:
	            	LocalDate nuevaFechaNacimiento = obtenerFechaNacimientoValida();
	            	jugador.setFechaNacimiento(nuevaFechaNacimiento);
	            	break;
	            case 4:
	            	System.out.print("Ingrese la nueva Nacionalidad: ");
	            	String nuevaNacionalidad = sc.next();
	            	jugador.setNacionalidad(nuevaNacionalidad);
	            	break;
	            case 5:
	            	System.out.print("Ingrese la nueva Estatura: ");
	            	double nuevaEstatura = sc.nextDouble();
	            	jugador.setEstatura(nuevaEstatura);
	            	break;
	            case 6:
	            	System.out.print("Ingrese el nuevo Peso: ");
	            	double nuevoPeso = sc.nextDouble();
	            	jugador.setPeso(nuevoPeso);
	            	break;
	            case 7:
	            	Posicion nuevaPosicion = obtenerPosicionValida();
	            	jugador.setPosicion(nuevaPosicion);
	            	break;
	            default:
	            	System.out.println("Opcion invalida.");
	            	break;
	            }
	            System.out.println("Datos del jugador modificados correctamente.");
	            break;
			}
		}
		if(!encontrado) {
			System.out.println("Jugador no encontrado.");
		}
		
	}
	//5- Metodo para eliminar un jugador de la lista.
	private static void eliminarJugador(ArrayList<Jugador> jugadores) {
		if (jugadores.isEmpty()) {
			System.out.println("No hay jugadores registrados.");
			return;
		}
		System.out.print("Ingrese el Nombre del Jugador a eliminar: ");
		String nombre = sc.next();
		System.out.print("Ingrese el Apellido del Jugador a eliminar: ");
		String apellido = sc.next();
		
		boolean encontrado = false;
		for(Jugador jugador: jugadores) {
			if(jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
				jugadores.remove(jugador);
				System.out.println("Jugador eliminado correctamente.");
				encontrado = true;
				break;
			}
		}
		if(!encontrado) {
			System.out.println("Jugador no encontrado.");
		}
	}
	//6- Metodo que muestra la cantidad total de jugadores
	private static void mostrarCantidadTotalJugadores(ArrayList<Jugador> jugadores) {
		System.out.println("Cantidad total de Jugadores: " + jugadores.size());
	}
	//7-Metodo que muesta la cantidad de Jugadores por Nacionalidad.
	private static void mostrarCantidadJugadoresNacionalidad(ArrayList<Jugador> jugadores) {
		System.out.print("Ingrese la Nacionalidad: ");
		String nacionalidad = sc.next();
		int contador = 0;
		for(Jugador jugador: jugadores) {
			if(jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
				contador++;
			}
		}
		System.out.println("Cantidad de jugadores de la Nacionalidad: " + nacionalidad + ": "+ contador );
	}
	//Metodo que valida la Fecha de Nacimiento del Jugador.
	private static LocalDate obtenerFechaNacimientoValida() {
		LocalDate fechaNacimiento = null;
		boolean fechaValida = false;
		do {
			System.out.print("Ingrese la fecha de Nacimiento (dd/MM/yyyy): ");
			String fechaCadena = sc.next();
			try {
				fechaNacimiento = LocalDate.parse(fechaCadena, formatter);
				fechaValida = true;
				
			}catch (DateTimeParseException e) {
				System.out.println("Por favor, ingrese una fecha valida en el formato dd/MM/yyyy");
			}
		}while(!fechaValida);
		return fechaNacimiento;
	}
	//Metodo que valida la entrada de la posicion de un jugador.
	private static Posicion obtenerPosicionValida() {
		
		Posicion posicion = null;
		boolean posicionValida = false;
		do {
			System.out.print("Ingrese la posición del jugador(DELANTERO, MEDIO, DEFENSA, ARQUERO):");
			String posicionCadena = sc.next().toUpperCase();
			
			try {
				posicion = Posicion.valueOf(posicionCadena);
				posicionValida = true;
			}catch(IllegalArgumentException e) {
				System.out.println("Por favor, ingrese una posición válida.");
			}
		}while(!posicionValida);
		return posicion;
	}
}
