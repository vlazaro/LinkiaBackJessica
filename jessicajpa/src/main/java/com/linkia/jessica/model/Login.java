package com.linkia.jessica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the logins database table.
 * 
 */
@Entity
@Table(name="logins")
@NamedQuery(name="Login.findAll", query="SELECT l FROM Login l")
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="login_id")
	private int loginId;

	private String password;

	private String username;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;

	public Login() {
	}

	public int getLoginId() {
		return this.loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
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

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}