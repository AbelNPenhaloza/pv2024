package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
	private Integer codigo;
	private String nombre;
	/**
	 * Constructor por defecto
	 */
	public Pais() {}
	/**
	 * Constructor parametrizado
	 * @param codigo del pais
	 * @param nombre del pais
	 */
	
	//Metodos accesores
	
	public Pais(Integer codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
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

}
