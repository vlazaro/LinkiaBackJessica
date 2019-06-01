package com.linkia.jessica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the orden database table.
 * 
 */
@Entity
@NamedQuery(name="Orden.findAll", query="SELECT o FROM Orden o")
public class Orden implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="orden_id")
	private int ordenId;

	private String estado;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private byte registrado;

	private String session;

	@Column(name="tipo_pago")
	private String tipoPago;

	private double total;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;

	//bi-directional many-to-one association to Direccionenvio
	@ManyToOne
	@JoinColumn(name="direccionenvio_id")
	private Direccionenvio direccionenvio;

	//bi-directional many-to-one association to Ordendetalle
	@OneToMany(mappedBy="orden")
	private List<Ordendetalle> ordendetalles;

	public Orden() {
	}

	public int getOrdenId() {
		return this.ordenId;
	}

	public void setOrdenId(int ordenId) {
		this.ordenId = ordenId;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public byte getRegistrado() {
		return this.registrado;
	}

	public void setRegistrado(byte registrado) {
		this.registrado = registrado;
	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getTipoPago() {
		return this.tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Direccionenvio getDireccionenvio() {
		return this.direccionenvio;
	}

	public void setDireccionenvio(Direccionenvio direccionenvio) {
		this.direccionenvio = direccionenvio;
	}

	public List<Ordendetalle> getOrdendetalles() {
		return this.ordendetalles;
	}

	public void setOrdendetalles(List<Ordendetalle> ordendetalles) {
		this.ordendetalles = ordendetalles;
	}

	public Ordendetalle addOrdendetalle(Ordendetalle ordendetalle) {
		getOrdendetalles().add(ordendetalle);
		ordendetalle.setOrden(this);

		return ordendetalle;
	}

	public Ordendetalle removeOrdendetalle(Ordendetalle ordendetalle) {
		getOrdendetalles().remove(ordendetalle);
		ordendetalle.setOrden(null);

		return ordendetalle;
	}

}