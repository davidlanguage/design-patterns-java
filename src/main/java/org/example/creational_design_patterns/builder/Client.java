package org.example.creational_design_patterns.builder;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {
		final User user = createUser();
		final UserDTOBuilder builder = new UserWebDTOBuilder();

		final UserDTO dto = directBuild(builder, user);
		System.out.println(dto);
	}

	//Director
	private static UserDTO directBuild(final UserDTOBuilder builder, final User user) {
		return builder.withFirstName(user.getFirstName())
				.withLastName(user.getLastName())
				.withAddress(user.getAddress())
				.withBirthday(user.getBirthday())
				.build();
	}

	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		final User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		final Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}
