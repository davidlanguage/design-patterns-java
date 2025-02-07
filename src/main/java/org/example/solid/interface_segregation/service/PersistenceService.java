package org.example.solid.interface_segregation.service;

import org.example.solid.interface_segregation.entity.Entity;

import java.util.List;


//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	// This method should not be included in this interface. By deleting it, we are presering the interface segregation principle
	//public List<T> findByName(String name);
}
