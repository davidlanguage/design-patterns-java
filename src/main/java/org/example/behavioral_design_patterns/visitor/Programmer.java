package org.example.behavioral_design_patterns.visitor;

public class Programmer extends AbstractEmployee {
	private String skill;
	
	public Programmer(final String name, final String skill) {
		super(name);
		this.skill = skill;
	}
	
	public String getSkill() {
		return skill;
	}


	@Override
	public void accept(final Visitor visitor) {
		//We pass visitor in each child of AbstractEmployee because we need to reference each type of employee
		//In this case, we want a Programmer reference, and not an AbstractEmployee reference
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "Programmer{" +
				"skill='" + skill + '\'' +
				'}';
	}
}
