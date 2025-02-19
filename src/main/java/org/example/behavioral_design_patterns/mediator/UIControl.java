package org.example.behavioral_design_patterns.mediator;

//Abstract colleague
public interface UIControl {
	
	void controlChanged(UIControl control);
	
	String getControlValue();
	
	String getControlName();
}
