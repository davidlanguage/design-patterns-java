package org.example.behavioral_design_patterns.state;

//Context class
public class Order {

	private OrderState currentState;

	public Order(){
		currentState = new New();
	}
	
	public double cancel() {
		double charges = currentState.handleCancellation();
		//cancellation fees
		currentState = new Cancelled();
		return charges;
	}
   
	public void paymentSuccessful() {
		currentState = new Paid();
	}
	
	public void dispatched() {
		currentState = new InTransit();
	}
	
	public void delivered() {
		currentState = new Delivered();
	}
}
