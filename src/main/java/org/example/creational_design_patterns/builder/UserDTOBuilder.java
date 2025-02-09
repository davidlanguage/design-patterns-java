package org.example.creational_design_patterns.builder;

import java.time.LocalDate;

//Abstract builder
public interface UserDTOBuilder {
	//methods to build "parts" of product at a time
	UserDTOBuilder withFirstName(final String fname) ;

	UserDTOBuilder withLastName(final String lname);

	UserDTOBuilder withBirthday(final LocalDate date);

	UserDTOBuilder withAddress(final Address address);
	//method to "assemble" final product
	UserDTO build();
	//(optional) method to fetch already built object
	UserDTO getUserDTO();
}

