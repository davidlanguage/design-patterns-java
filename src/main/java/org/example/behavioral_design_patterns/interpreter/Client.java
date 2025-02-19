package org.example.behavioral_design_patterns.interpreter;

public class Client {

	public static void main(String[] args) {
		final Report report1 = new Report("Cashflow report", "GORILLA OR ADMIN");

		final ExpressionBuilder builder = new ExpressionBuilder();

		final PermissionExpression expression = builder.build(report1);

		System.out.println(expression);

		final User user1 = new User("Dave", "USER", "ADMIN");

		System.out.println("User access report : " +expression.interpret(user1));

	}

}
