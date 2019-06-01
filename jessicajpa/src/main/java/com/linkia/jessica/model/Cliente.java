package com.linkia.jessica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cliente_id")
	private int clienteId;

	private String apellido;

	private String codigopostal;

	private String direccion1;

	private String direccion2;

	private String email;

	private String nombre;

	private byte registrado;

	private String telefono;

	//bi-directional many-to-one association to Login
	@OneToMany(mappedBy="cliente")
	private List<Login> logins;

	//bi-directional many-to-one association to Orden
	@OneToMany(mappedBy="cliente")
	private List<Orden> ordens;

	public Cliente() {
	}

	public int getClienteId() {
		return this.clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
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

	public byte getRegistrado() {
		return this.registrado;
	}

	public void setRegistrado(byte registrado) {
		this.registrado = registrado;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Login> getLogins() {
		return this.logins;
	}

	public void setLogins(List<Login> logins) {
		this.logins = logins;
	}

	public Login addLogin(Login login) {
		getLogins().add(login);
		login.setCliente(this);

		return login;
	}

	public Login removeLogin(Login login) {
		getLogins().remove(login);
		login.setCliente(null);

		return login;
	}

	public List<Orden> getOrdens() {
		return this.ordens;
	}

	public void setOrdens(List<Orden> ordens) {
		this.ordens = ordens;
	}

	public Orden addOrden(Orden orden) {
		getOrdens().add(orden);
		orden.setCliente(this);

		return orden;
	}

	public Orden removeOrden(Orden orden) {
		getOrdens().remove(orden);
		orden.setCliente(null);

		return orden;
	}

}