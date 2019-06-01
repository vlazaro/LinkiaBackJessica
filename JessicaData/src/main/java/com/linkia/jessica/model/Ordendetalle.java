package com.linkia.jessica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ordendetalle database table.
 * 
 */
@Entity
@NamedQuery(name="Ordendetalle.findAll", query="SELECT o FROM Ordendetalle o")
public class Ordendetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ordendetalle_id")
	private int ordendetalleId;

	private int cantidad;

	//bi-directional many-to-one association to Orden
	@ManyToOne
	@JoinColumn(name="orden_id")
	private Orden orden;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="producto_id")
	private Producto producto;

	public Ordendetalle() {
	}

	public int getOrdendetalleId() {
		return this.ordendetalleId;
	}

	public void setOrdendetalleId(int ordendetalleId) {
		this.ordendetalleId = ordendetalleId;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Orden getOrden() {
		return this.orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}