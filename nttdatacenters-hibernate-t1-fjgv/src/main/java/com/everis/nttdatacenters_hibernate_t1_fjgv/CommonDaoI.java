package com.everis.nttdatacenters_hibernate_t1_fjgv;

import java.util.List;


public interface CommonDaoI<T> {

	public void insert(T paramT);
	
	public T searchById(Long id);

	public List<T> searchAll();

	public void update(T paramT);
	
	public void delete(T paramT);
	
}