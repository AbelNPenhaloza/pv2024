package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	
	private static ArrayList<DestinoTuristico> destinos = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Pais> paises = new ArrayList<>();
		paises.add(new Pais(1, "Argentina"));
		paises.add(new Pais(2, "Chile"));
		paises.add(new Pais(3, "Argentina"));
		paises.add(new Pais(4, "Brasil"));
		paises.add(new Pais(5, "España"));
		paises.add(new Pais(6, "Italia"));
		paises.add(new Pais(7, "Mexico"));
		paises.add(new Pais(8, "Peru"));
		paises.add(new Pais(9, "Suiza"));
		
		int opcion;
		do {
			mostrarMenu();
			opcion = leerEntero("Ingrese una opción: ");
			try {
				switch (opcion) {
				case 1:
					altaDestinoTuristico(paises);
					break;
				case 2:
					mostrarDestinos();
					break;
				case 3:
					modificarPais();
					break;
				case 4:
					limpiarDestinos();
					break;
				case 5:
					eliminarDestino();
					break;
				case 6:
					mostrarDestinosOrdenados();
					break;
				case 7:
					mostrarPaises(paises);
					break;
				case 8:
					mostrarDestinosPorPais();
					break;
				case 9:
					System.out.println("Saliendo.....");
					break;
				default:
						System.out.println("Opción Invalida.");
						
				}
			}catch (InputMismatchException e) {
				System.out.println("Error: Ingrese un número entero.");
				sc.next();//Limpia el buffer del scanner
				
			}catch(Exception e) {
				System.out.println("Error: "+ e.getMessage());
			}
		}while(opcion !=9);

	}
	//Metodo para mostrar el Menu Principal
	private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1 – Alta de destino turístico");
        System.out.println("2 – Mostrar todos los destinos turísticos");
        System.out.println("3 – Modificar el país de un destino turístico");
        System.out.println("4 – Limpiar el ArrayList de destino turísticos");
        System.out.println("5 – Eliminar un destino turístico");
        System.out.println("6 – Mostrar los destinos turísticos ordenados por nombre");
        System.out.println("7 – Mostrar todos los países");
        System.out.println("8 – Mostrar los destinos turísticos que pertenecen a un país");
        System.out.println("9 – Salir");
    }
	//1-Metodo de Alta del Destino Turistico
	private static void altaDestinoTuristico(ArrayList<Pais> paises) {
		System.out.println("Ingrese los datos del destino Turistico.");
		Integer codigo = leerEntero("Código: ");
		String nombre = leerString("Nombre: ");
		Double precio = leerDouble("Precio: ");
		Pais pais = seleccionarPais(paises);
		Byte cantidadDias = leerByte("Cantidad de días: ");
		
		destinos.add(new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias));
		System.out.println("Destino turístico agregado con éxito.");
	}
	//Metodo para mostrar los destino.
	private static void mostrarDestinos() {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
            return;
        }

        System.out.println("Destinos Turísticos:");
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino.getNombre() + " - " + destino.getPais().getNombre());
        }
    }
	//
}