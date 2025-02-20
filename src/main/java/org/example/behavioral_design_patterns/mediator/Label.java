package org.example.behavioral_design_patterns.mediator;

public class Label extends javafx.scene.control.Label implements UIControl{

	private UIMediator mediator;

	public Label(final UIMediator mediator) {
		this.mediator = mediator;
		this.setMinWidth(100);
		this.setText("Label");
		mediator.register(this);
	}

	@Override
	public void controlChanged(final UIControl control) {
		setText(control.getControlValue());
	}

	@Override
	public String getControlValue() {
		return getText();
	}

	@Override
	public String getControlName() {
		return "Label";
	}


}
