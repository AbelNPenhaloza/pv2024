package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Producto producto;
		
		for(int i= 1; i <= 3; i++) {
			producto = new Producto();
			
			System.out.println("\nIngrese los datos para el producto " + i);
			System.out.print("Ingrese el nombre: ");
			producto.setNombre(sc.next());
			System.out.print("Ingrese el codigo: ");
			producto.setCodigo(sc.nextInt());
			System.out.print("Ingrese el precio: ");
			producto.setPrecio(sc.nextDouble());
			System.out.print("Ingrese el descuento si corresponde en el rango [0, 50]: ");
			producto.setDescuento(sc.nextInt());
			sc.nextLine();
			//Mostrar los datos y el descuento calculado para cada producto
			mostrarProducto(producto);
							
		}
		sc.close();	
	}
	
	//Metodo para mostrar los datos de un producto y el precio con descuento aplicado.
	private static void mostrarProducto(Producto producto) {
		System.out.println("\nNombre: " + producto.getNombre());
		System.out.println("Codigo: " + producto.getCodigo());
		System.out.println("Precio: $ " + producto.getPrecio());
		System.out.println("Descuento: " + producto.getDescuento() + "%");
		System.out.println("Precio con descuento: $ " + producto.calcularDescuento());
		
	}

}
