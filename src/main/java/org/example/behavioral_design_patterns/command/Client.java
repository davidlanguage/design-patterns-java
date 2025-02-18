package org.example.behavioral_design_patterns.command;

public class Client {

	public static void main(String[] args) throws InterruptedException {

		final EWSService service = new EWSService();

		final Command command1 = new AddMemberCommand("a@a.com","spam" ,service);

		MailTasksRunner.getInstance().addCommand(command1);

		final Command command2 = new AddMemberCommand("b@b.com","not spam" ,service);

		MailTasksRunner.getInstance().addCommand(command2);

		Thread.sleep(3000);

		MailTasksRunner.getInstance().shutdown();
	}

}
