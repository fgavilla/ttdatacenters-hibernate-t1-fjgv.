package com.everis.nttdatacenters_hibernate_t1_fjgv;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class CustomerServiceImpl implements CustomerServiceI {

	private ClienteDaoI customerDao;
	
	public CustomerServiceImpl(final Session session) {
		this.customerDao = new ClienteDaoImpl(session);
	}
	
	@Override
	public void insertCustomer(Cliente cliente) {
		
		customerDao.insert(cliente);
		
	}

	@Override
	public List<Cliente> searchAll() {

		List<Cliente> result = new ArrayList<Cliente>();
		result = customerDao.searchAll();

		return result;
		
	}

	@Override
	public Cliente searchById(Long id) {

		Cliente result = new Cliente();
		result = customerDao.searchById(id);

		return result;
		
	}

	@Override
	public List<Cliente> searchByFullName(String name, String lastname1, String lastname2) {
		
		List<Cliente> result = new ArrayList<Cliente>();
		result = customerDao.searchByFullName(name, lastname1, lastname2);

		return result;
		
	}

	@Override
	public void updateCustomer(Cliente customer) {
		
		customerDao.update(customer);
		
	}

	@Override
	public void deleteCustomer(Cliente customer) {
		
		customerDao.delete(customer);
		
	}

}