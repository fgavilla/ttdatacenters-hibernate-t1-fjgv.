package com.everis.nttdatacenters_hibernate_t1_fjgv;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "CLIENTE")
public class Cliente extends AbstractEntity implements Serializable{

	private long idCliente;

	private String nombreCliente;

	private String primerapellidoCliente;

	private String segundoapellidoCliente;

	private String docIdentidad;
	
	private String updatedUser;
	private Date updatedDate;
	
	private List<Contrato> contractList;

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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customer")
	public List<Contrato> getContractList() {
		return contractList;
	}

	public void setContractList(List<Contrato> contractList) {
		this.contractList = contractList;
	}
	
	@Transient
	public Class<?> getClase() {
		return Cliente.class;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + idCliente + ", name=" + nombreCliente + ", lastName1=" + primerapellidoCliente + ", lastName2=" + segundoapellidoCliente
				+ ", dni=" + docIdentidad + ", updatedUser=" + updatedUser + ", updatedDate=" + updatedDate + "]";
	}
}
