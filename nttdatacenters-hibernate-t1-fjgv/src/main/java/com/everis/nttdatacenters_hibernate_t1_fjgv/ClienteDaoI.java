package com.everis.nttdatacenters_hibernate_t1_fjgv;

import java.util.List;

public interface ClienteDaoI {

	public List<Cliente> searchClients();
	
	public Cliente searchByNameClient(String name);
	
}
