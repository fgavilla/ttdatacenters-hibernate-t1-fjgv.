package com.everis.nttdatacenters_hibernate_t1_fjgv;

import java.util.List;
import org.hibernate.Session;


public class ContratoDaoImpl extends CommonDaoImpl<Contrato> implements ContratoDaoI {

	private Session session;

	public ContratoDaoImpl(Session session) {
		super(session);
		this.session = session;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Contrato> searchByCustomer(Cliente cliente) {

		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}


		List<Contrato> result = session.createQuery("FROM Contrato WHERE Cliente.idCliente=" + cliente.getIdCliente()).list();
		return result;
	}

}
