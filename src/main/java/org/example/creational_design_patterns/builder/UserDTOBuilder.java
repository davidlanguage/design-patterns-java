package org.example.creational_design_patterns.builder;

import java.time.LocalDate;

//Abstract builder
public interface UserDTOBuilder {
	//methods to build "parts" of product at a time
	UserDTOBuilder withFirstName(String fname) ;

	UserDTOBuilder withLastName(String lname);

	UserDTOBuilder withBirthday(LocalDate date);

	UserDTOBuilder withAddress(com.cpc.dp.builder.Address address);
	//method to "assemble" final product
	com.cpc.dp.builder.UserDTO build();
	//(optional) method to fetch already built object
	com.cpc.dp.builder.UserDTO getUserDTO();
}

