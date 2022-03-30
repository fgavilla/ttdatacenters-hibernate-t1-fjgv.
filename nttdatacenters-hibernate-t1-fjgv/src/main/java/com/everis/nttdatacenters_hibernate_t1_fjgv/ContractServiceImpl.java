package com.everis.nttdatacenters_hibernate_t1_fjgv;

import java.util.List;
import org.hibernate.Session;

public class ContractServiceImpl implements ContractServiceI {
	
	private ContratoDaoI contractDao;
	
	public ContractServiceImpl(final Session session) {
		this.contractDao = new ContratoDaoImpl(session);
	}

	@Override
	public void insertContract(Contrato contract) {
		
		contractDao.insert(contract);
		
	}

	@Override
	public Contrato searchById(Long id) {
		
		Contrato result = contractDao.searchById(id);
		return result;
		
	}

	@Override
	public List<Contrato> searchByCustomer(Cliente customer) {
		
		List<Contrato> result = contractDao.searchByCustomer(customer);
		return result;
		
	}

	@Override
	public List<Contrato> searchAll() {
		
		List<Contrato> result = contractDao.searchAll();
		return result;
		
	}

	@Override
	public void updateContract(Contrato contract) {

		contractDao.update(contract);
		
	}

	@Override
	public void deleteContract(Contrato contract) {
		
		contractDao.delete(contract);
		
	}

}