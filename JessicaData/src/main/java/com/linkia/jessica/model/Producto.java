package com.linkia.jessica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="producto_id")
	private int productoId;

	private String descripcioncorta;

	private String descripcionlarga;

	private String imagen;

	private String nombre;

	private double precio;

	//bi-directional many-to-one association to Ordendetalle
	@OneToMany(mappedBy="producto")
	private List<Ordendetalle> ordendetalles;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private Categoria categoria;

	public Producto() {
	}

	public int getProductoId() {
		return this.productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public String getDescripcioncorta() {
		return this.descripcioncorta;
	}

	public void setDescripcioncorta(String descripcioncorta) {
		this.descripcioncorta = descripcioncorta;
	}

	public String getDescripcionlarga() {
		return this.descripcionlarga;
	}

	public void setDescripcionlarga(String descripcionlarga) {
		this.descripcionlarga = descripcionlarga;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<Ordendetalle> getOrdendetalles() {
		return this.ordendetalles;
	}

	public void setOrdendetalles(List<Ordendetalle> ordendetalles) {
		this.ordendetalles = ordendetalles;
	}

	public Ordendetalle addOrdendetalle(Ordendetalle ordendetalle) {
		getOrdendetalles().add(ordendetalle);
		ordendetalle.setProducto(this);

		return ordendetalle;
	}

	public Ordendetalle removeOrdendetalle(Ordendetalle ordendetalle) {
		getOrdendetalles().remove(ordendetalle);
		ordendetalle.setProducto(null);

		return ordendetalle;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}