package org.example.creational_design_patterns.builder.builder2;

import java.time.LocalDate;


import org.example.creational_design_patterns.builder.Address;
import org.example.creational_design_patterns.builder.User;
import org.example.creational_design_patterns.builder.builder2.UserDTO.UserDTOBuilder;

public class Client {

	public static void main(String[] args) {
		final User user = createUser();
		// Client has to provide director with concrete builder
		final UserDTO dto = directBuild(UserDTO.getBuilder(), user);
		final UserDTO dto2 = UserDTO.getBuilder().withAddress(user.getAddress()).withBirthday(user.getBirthday())
						.withFirstName(user.getFirstName()).withLastName(user.getLastName()).build();
		System.out.println(dto);
		System.out.println("\n");
		System.out.println(dto2);
	}

	/**
	 * This method serves the role of director in builder pattern.
	 */
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withBirthday(user.getBirthday()).withAddress(user.getAddress()).build();
	}

	/**
	 * Returns a sample user.
	 */
	public static User createUser() {
		User user = new User();
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
