package com.linkia.jessica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the direccionenvio database table.
 * 
 */
@Entity
@NamedQuery(name="Direccionenvio.findAll", query="SELECT d FROM Direccionenvio d")
public class Direccionenvio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="direccionenvio_id")
	private int direccionenvioId;

	private String apellido;

	private String codigopostal;

	private String direccion1;

	private String direccion2;

	private String email;

	private String nombre;

	private String telefono;

	//bi-directional many-to-one association to Orden
	@OneToMany(mappedBy="direccionenvio")
	private List<Orden> ordens;

	public Direccionenvio() {
	}

	public int getDireccionenvioId() {
		return this.direccionenvioId;
	}

	public void setDireccionenvioId(int direccionenvioId) {
		this.direccionenvioId = direccionenvioId;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCodigopostal() {
		return this.codigopostal;
	}

	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}

	public String getDireccion1() {
		return this.direccion1;
	}

	public void setDireccion1(String direccion1) {
		this.direccion1 = direccion1;
	}

	public String getDireccion2() {
		return this.direccion2;
	}

	public void setDireccion2(String direccion2) {
		this.direccion2 = direccion2;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Orden> getOrdens() {
		return this.ordens;
	}

	public void setOrdens(List<Orden> ordens) {
		this.ordens = ordens;
	}

	public Orden addOrden(Orden orden) {
		getOrdens().add(orden);
		orden.setDireccionenvio(this);

		return orden;
	}

	public Orden removeOrden(Orden orden) {
		getOrdens().remove(orden);
		orden.setDireccionenvio(null);

		return orden;
	}

}