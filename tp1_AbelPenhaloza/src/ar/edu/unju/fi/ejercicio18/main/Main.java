package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
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
	//Metodo que lee un entero ingresado por consola
	private static Integer leerEntero (String mensaje) {
		System.out.print(mensaje);
		return sc.nextInt();
	}
	private static String leerString(String mensaje) {
        System.out.print(mensaje);
        return sc.next();
    }

    private static Double leerDouble(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    private static Byte leerByte(String mensaje) {
        System.out.print(mensaje);
        return sc.nextByte();
    }
    
    private static Pais seleccionarPais(ArrayList<Pais> paises) {
        if(paises.isEmpty()) {
        	System.out.println("No hay paises disponibles.");
        	return null;
        }
        mostrarPaises(paises);
        Integer codigoPais = leerEntero("Seleccione el código del país: ");
        for (Pais pais : paises) {
            if (pais.getCodigo().equals(codigoPais)) {
                return pais;
            }
        }
        System.out.println("No se encontró el país seleccionado.");
        return null;
    }
    
    private static DestinoTuristico buscarDestinoPorCodigo(Integer codigo) {
        for (DestinoTuristico destino : destinos) {
            if (destino.getCodigo().equals(codigo)) {
                return destino;
            }
        }
        return null;
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
	//2 -Metodo para mostrar los destino.
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
	//3 -Metodo modificar un Pais
	private static void modificarPais() {
		if (destinos.isEmpty()) {
			System.out.println("No hay destinos turísticos para modificar.");
			return;
			
		}
		ArrayList<Pais> paisesAsociados = new ArrayList<>();
		for (DestinoTuristico destino : destinos) {
	        if (!paisesAsociados.contains(destino.getPais())) {
	            paisesAsociados.add(destino.getPais());
	        }
	    }

	    Pais nuevoPais = seleccionarPais(paisesAsociados);
	    if (nuevoPais == null) {
	        return;
	    }
	    
		Integer codigoDestino = leerEntero("Ingrese el codigo del Destino Turistico");
		DestinoTuristico destino = buscarDestinoPorCodigo(codigoDestino);
		
		if(destino == null) {
			System.out.println("No se encontró ningún destino con ese código.");
			return;
		}
		
		destino = new DestinoTuristico(destino.getCodigo(), destino.getNombre(),
				destino.getPrecio(), nuevoPais, destino.getCantidadDias());
		System.out.println("País modificado con éxito.");
	}
	//4 -Metodo que vacia el arrayList
	private static void limpiarDestinos() {
		destinos.clear();
		System.out.println("Destinos turísticos eliminados.");
	}
	//5 -Metodo que elimina un destino seleccionado por el usuario
	private static void eliminarDestino() {
		if(destinos.isEmpty()) {
			System.out.println("No hay detinos turísticos para eliminar.");
			return;
		}
		Integer codigoDestino = leerEntero("Ingrese el código de destino turístico a eliminar");
		Iterator<DestinoTuristico> iter = destinos.iterator();
		while(iter.hasNext()) {
			DestinoTuristico destino = iter.next();
			if(destino.getCodigo() == codigoDestino) {
				iter.remove();
				System.out.println("Destino turístico eliminado con éxito.");
				return;
			}
		}
		System.out.println("No se encontró ningún destino con ese código.");
	}
	//6 -Metodo para mostrar los destinos Ordenados
	private static void mostrarDestinosOrdenados() {
		if(destinos.isEmpty()) {
			System.out.println("No hay destinos turísticos para mostrar.");
			return;
		}
		ArrayList <DestinoTuristico> destinosOrdenados = new ArrayList <>(destinos);
		Collections.sort(destinosOrdenados, (a,b)-> a.getNombre().compareToIgnoreCase(b.getNombre()));
		
		System.out.println("Destinos Turisticos Ordenados por Nombre.");
		for(DestinoTuristico destino: destinosOrdenados) {
			System.out.println(destino.getNombre() + " - " + destino.getPais().getNombre());
		}
	}
	//7 -Metodo que muesta los Paises
	private static void mostrarPaises(ArrayList<Pais> paises) {
		if(paises.isEmpty()) {
			System.out.println("No hay paises para mostrar.");
			return;
		}
		
		System.out.println("Paises Disponibles.");
		for(Pais pais: paises) {
			System.out.println("Codigo: " + pais.getCodigo() + " - Nombre: " + pais.getNombre());
		}
	}
	
	private static void mostrarDestinosPorPais() {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
            return;
        }

        ArrayList<Pais> paises = new ArrayList<>();
        for (DestinoTuristico destino : destinos) {
            if (!paises.contains(destino.getPais())) {
                paises.add(destino.getPais());
            }
        }

        Pais paisSeleccionado = seleccionarPais(paises);
        if (paisSeleccionado != null) {
            System.out.println("Destinos turísticos en " + paisSeleccionado.getNombre() + ":");
            for (DestinoTuristico destino : destinos) {
                if (destino.getPais().equals(paisSeleccionado)) {
                    System.out.println(destino.getNombre() + " - Precio: " + destino.getPrecio() + " - Días: " + destino.getCantidadDias());
                }
            }
        }
    }
	
}