package com.everis.nttdatacenters_hibernate_t1_fjgv;

import java.util.List;

public interface ClienteDaoI extends CommonDaoI<Cliente>{
	
	public List<Cliente> searchByFullName(String nombre, String primerapellidoCliente, String segundoapellidoCliente);
}

