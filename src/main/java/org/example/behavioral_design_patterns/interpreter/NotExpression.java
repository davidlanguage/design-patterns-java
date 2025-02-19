package org.example.behavioral_design_patterns.interpreter;

public class NotExpression implements PermissionExpression {
	
	private PermissionExpression expression;
	
	public NotExpression(final PermissionExpression expression) {
		this.expression = expression;
	}

	@Override
	public boolean interpret(final User user) {
		return !expression.interpret(user);
	}
	
	@Override
	public String toString() {
		return " NOT "+expression;
	}
}
