package com.everis.nttdatacenters_hibernate_t1_fjgv;

import java.util.List;

import org.hibernate.Session;

public class ClienteDaoImpl extends CommonDaoImpl<Cliente> implements ClienteDaoI {

	private Session session;
	
	public ClienteDaoImpl(Session session) {
		super(session);
		this.session = session;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> searchByFullName(String nombreCliente, String primerapellidoCliente, String segundoapellidoCliente) {

		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		List<Cliente> result = session
		        .createQuery("FROM Cliente WHERE nombreCliente='" + nombreCliente + "' AND primerapellidoCliente='" + primerapellidoCliente + "' AND segundoapellidoCliente='" + segundoapellidoCliente + "'").list();
		return result;
		
	}

}
