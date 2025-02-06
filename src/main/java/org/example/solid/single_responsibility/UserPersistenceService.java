package org.example.solid.single_responsibility;

public class UserPersistenceService {

    private Store store = new Store();

	public void saveUser(final User user){
        store.store(user);
    }
}
