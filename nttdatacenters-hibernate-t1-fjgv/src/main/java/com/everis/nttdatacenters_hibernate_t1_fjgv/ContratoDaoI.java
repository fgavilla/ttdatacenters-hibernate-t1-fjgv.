package com.everis.nttdatacenters_hibernate_t1_fjgv;

import java.util.List;

public interface ContratoDaoI extends CommonDaoI<Contrato>{
	
	public List<Contrato> searchByCustomer(Cliente cliente);
	
}