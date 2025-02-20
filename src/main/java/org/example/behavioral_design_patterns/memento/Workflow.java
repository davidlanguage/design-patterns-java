package org.example.behavioral_design_patterns.memento;

import java.util.Arrays;
import java.util.LinkedList;

public class Workflow {

	private LinkedList<String> steps;
	
	private String name;
	
	public Workflow(final String name) {
		this.name = name;
		this.steps = new LinkedList<>();
	}
	
	public Workflow(final String name, final String... steps) {
		this.name = name;
		this.steps = new LinkedList<>();
		if(steps != null && steps.length > 0) {
			Arrays.stream(steps).forEach(s->this.steps.add(s));
		}
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder("Workflow [name=");
		builder.append(name).append("]\nBEGIN -> ");
		for(final String step : steps) {
			builder.append(step).append(" -> ");
		}
		builder.append("END");
		return builder.toString();
	}
	
	public void addStep(final String step) {
		steps.addLast(step);
	}
	
	public boolean removeStep(final String step) {
		return steps.remove(step);
	}

	public String[] getSteps() {
		return steps.toArray(new String[steps.size()]);
	}

	public String getName() {
	    return name;
    }
}
