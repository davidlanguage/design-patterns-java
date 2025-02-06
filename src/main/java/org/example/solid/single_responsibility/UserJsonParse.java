package org.example.solid.single_responsibility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserJsonParse {

    public User parse(final String userJson) throws JsonProcessingException {

        final ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(userJson, User.class);

    }


}
