package com.devpredator.practicawebservicesconsumer.dto;
/**
 * 
 * @author 4PF28LA_2004
 *
 */
public class RestauranteDTO {
	
	private Long idRestaurante;
	
	private String nombre;
	
	private String direccion;
	
	private String slogan;

	/**
	 * @return the idRestaurante
	 */
	public Long getIdRestaurante() {
		return idRestaurante;
	}

	/**
	 * @param idRestaurante the idRestaurante to set
	 */
	public void setIdRestaurante(Long idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the slogan
	 */
	public String getSlogan() {
		return slogan;
	}

	/**
	 * @param slogan the slogan to set
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	@Override
	public String toString() {
		return "RestauranteDTO [idRestaurante=" + idRestaurante + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", slogan=" + slogan + "]";
	}
}
