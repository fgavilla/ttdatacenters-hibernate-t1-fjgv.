package com.everis.nttdatacenters_hibernate_t1_fjgv;

import java.util.List;

public interface ContractServiceI {

	public void insertContract(Contrato contrato);

	public Contrato searchById(Long id);

	public List<Contrato> searchByCustomer(Cliente cliente);

	public List<Contrato> searchAll();

	public void updateContract(Contrato contrato);

	public void deleteContract(Contrato contrato);
}