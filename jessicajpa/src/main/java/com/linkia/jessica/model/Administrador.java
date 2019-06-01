package com.linkia.jessica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the administrador database table.
 * 
 */
@Entity
@NamedQuery(name="Administrador.findAll", query="SELECT a FROM Administrador a")
public class Administrador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="administrador_id")
	private int administradorId;

	private String password;

	private String username;

	public Administrador() {
	}

	public int getAdministradorId() {
		return this.administradorId;
	}

	public void setAdministradorId(int administradorId) {
		this.administradorId = administradorId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}