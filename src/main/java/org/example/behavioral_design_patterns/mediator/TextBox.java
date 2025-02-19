package org.example.behavioral_design_patterns.mediator;

import javafx.scene.control.TextField;

public class TextBox extends TextField implements UIControl{

	private UIMediator uiMediator;

	private boolean mediatedUpdated;

	public TextBox(final UIMediator uiMediator) {
		this.uiMediator = uiMediator;
		this.setText("Textbox");
		this.uiMediator.register(this);
		this.textProperty().addListener((value, oldValue, newValue)->{

			if (!mediatedUpdated){
				this.uiMediator.valueChanged(this);
			}

		});
	}

	@Override
	public void controlChanged(final UIControl control) {
		this.mediatedUpdated = true;
		this.setText(control.getControlValue());
		this.mediatedUpdated = false;
	}

	@Override
	public String getControlValue() {
		return getText();
	}

	@Override
	public String getControlName() {
		return "Textbox";
	}
}
