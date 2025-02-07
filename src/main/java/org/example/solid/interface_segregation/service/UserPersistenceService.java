package org.example.solid.interface_segregation.service;

import org.example.solid.interface_segregation.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Stores User entities
public class UserPersistenceService implements PersistenceService<User>{
	
	private static final Map<Long, User> USERS = new HashMap<>();
	
	@Override
	public void save(final User entity) {
		synchronized (USERS) {
			USERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(final User entity) {
		synchronized (USERS) {
			USERS.remove(entity.getId());
		}
	}

	@Override
	public User findById(final Long id) {
		synchronized (USERS) {
			return USERS.get(id);
		}
	}
	
	//@Override
	public List<User> findByName(final String name) {
		synchronized (USERS) {
			return USERS.values().stream().filter(u->u.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		}
	}

}
