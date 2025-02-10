package org.example.creational_design_patterns.factory_method;

import org.example.creational_design_patterns.factory_method.message.Message;
import org.example.creational_design_patterns.factory_method.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
