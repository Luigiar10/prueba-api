package com.luigi.modelo;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "pedidos")
public class Pedidos {
	
	@Id
	@Column(name = "cedula_cliente")
	private Long cedulaCliente;
	
	@Column(name = "fecha_venta")
	private Timestamp timestamp;
	
	@Column(name = "direccion_cliente")
	private String direccionCliente;
	
	@Column(name = "productos")
	private String[] productos;
	
	@Column(name = "precio_productos")
	private double precioProductos;
	
	@Column(name = "iva")
	private double iva = precioProductos;
	
	@Column(name = "prcio_domicilio")
	private double precioDomicilio;
	
	@Column(name = "precio_total")
	private double precioTotal;

	// Getters and Setters
	public Long getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(Long cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String[] getProductos() {
		return productos;
	}

	public void setProductos(String[] productos) {
		this.productos = productos;
	}

	public double getPrecioProductos() {
		return precioProductos;
	}

	public void setPrecioProductos(double precioProductos) {
		this.precioProductos = precioProductos;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getPrecioDomicilio() {
		return precioDomicilio;
	}

	public void setPrecioDomicilio(double precioDomicilio) {
		this.precioDomicilio = precioDomicilio;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
}
