package org.example.behavioral_design_patterns.interpreter;

//Abstract expression
public interface PermissionExpression {

	boolean interpret(User user); 
}
