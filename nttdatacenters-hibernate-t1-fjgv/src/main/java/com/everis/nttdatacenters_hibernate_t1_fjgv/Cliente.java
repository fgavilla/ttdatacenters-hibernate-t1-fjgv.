package com.everis.nttdatacenters_hibernate_t1_fjgv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

	private long idCliente;

	private String nombreCliente;

	private String primerapellidoCliente;

	private String segundoapellidoCliente;

	private String docIdentidad;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	@Column(name = "NOMBRE_CLIENTE")
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	@Column(name = "PRIMER_APELLIDO_CLIENTE")
	public String getPrimerapellidoCliente() {
		return primerapellidoCliente;
	}

	public void setPrimerapellidoCliente(String primerapellidoCliente) {
		this.primerapellidoCliente = primerapellidoCliente;
	}

	@Column(name = "SEGUNDO_APELLIDO_CLIENTE")
	public String getSegundoapellidoCliente() {
		return segundoapellidoCliente;
	}

	public void setSegundoapellidoCliente(String segundoapellidoCliente) {
		this.segundoapellidoCliente = segundoapellidoCliente;
	}

	@Column(name = "DOC_IDENTIDAD", unique = true, nullable = false, length = 9)
	public String getDocIdentidad() {
		return docIdentidad;
	}

	public void setDocIdentidad(String docIdentidad) {
		this.docIdentidad = docIdentidad;
	}

}
