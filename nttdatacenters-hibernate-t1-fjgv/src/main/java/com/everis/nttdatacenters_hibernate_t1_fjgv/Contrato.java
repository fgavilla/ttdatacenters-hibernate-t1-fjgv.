package com.everis.nttdatacenters_hibernate_t1_fjgv;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "CONTRATO")
public class Contrato extends AbstractEntity implements Serializable{

	private long idContrato;

	private Date fechaVigencia;

	private Date fechaCaducidad;

	private double precioMensual;

	private Cliente cliente;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(long idContrato) {
		this.idContrato = idContrato;
	}

	@Column(name = "FECHA_VIGENCIA")
	public Date getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	@Column(name = "FECHA_CADUCIDAD")
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Column(name = "PRECIO_MENSUAL")
	public double getPrecioMensual() {
		return precioMensual;
	}

	public void setPrecioMensual(double precioMensual) {
		this.precioMensual = precioMensual;
	}

	@ManyToOne
	@JoinColumn(name = "CLIENTE_ID")
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Transient
	public Class<?> getClase() {
		return Contrato.class;
	}

	@Override
	public String toString() {
		return "Contrato [ID=" + idContrato + ", startDate=" + fechaVigencia + ", expireDate=" + fechaCaducidad
				+ ", price=" + precioMensual + ", customer=" + cliente + "]";
	}
}
