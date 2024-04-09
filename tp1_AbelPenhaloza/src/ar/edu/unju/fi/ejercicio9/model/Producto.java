package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private Integer codigo;
	private Double precio;
	private int descuento;
	/**
	 * Constructor por defecto
	 */
	public Producto() {}
	
	//Metodo para calcular el descuento y retornar el precio con el descuento.
	
	public double calcularDescuento() {
		if(descuento >= 0 && descuento <= 50) {
			double descuentoAplicado = precio * (descuento / 100.0);
			return precio - descuentoAplicado;
		}else {
			return precio;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	
	
	
	
	
}
