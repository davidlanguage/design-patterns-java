package org.example.creational_design_patterns.factory_method;

import org.example.creational_design_patterns.factory_method.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage(){

        final Message msg = createMessage();

        msg.addDefaultHeaders();

        msg.encrypt();

        return msg;
    }

    public abstract Message createMessage();
	
}
