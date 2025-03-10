package org.example.behavioral_design_patterns.interpreter;

//Non terminal expression
public class OrExpression implements PermissionExpression {
	
	private PermissionExpression expression1;
	private PermissionExpression expression2;
	
	public OrExpression(final PermissionExpression one, final PermissionExpression two) {
		this.expression1 = one;
		this.expression2 = two;
	}

	@Override
	public boolean interpret(final User user) {
		return expression1.interpret(user) || expression2.interpret(user);
	}
	
	@Override
	public String toString() {
		return expression1 +" OR "+expression2;
	}
}
