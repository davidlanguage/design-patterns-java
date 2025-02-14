package org.example.structural_design_patterns.facade.email;

public abstract class Template {

	public TemplateType templateType;

	public abstract String format(Object obj);
	
}
