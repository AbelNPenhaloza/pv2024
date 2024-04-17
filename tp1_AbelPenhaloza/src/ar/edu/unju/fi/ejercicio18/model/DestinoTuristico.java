package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	private Integer codigo;
	private String nombre;
	private Double precio;
	private Pais pais;
	private Byte cantidadDias;
	
	/**
	 * Constructor por defecto
	 */
	public DestinoTuristico() {}

	/**
	 * Constructor parametrizado de Destino Turistico
	 * @param codigo del Destino Turistico
	 * @param nombre del Destino Turistico
	 * @param precio del Destino Turistico
	 * @param pais del Destino Turistico
	 * @param cantidadDias del Destino Turistico
	 */
	public DestinoTuristico(Integer codigo, String nombre, Double precio, Pais pais, Byte cantidadDias) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.cantidadDias = cantidadDias;
	}
	//Metodos Accesores de la Clase Destino Turistico

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Byte getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(Byte cantidadDias) {
		this.cantidadDias = cantidadDias;
	}
	

}
