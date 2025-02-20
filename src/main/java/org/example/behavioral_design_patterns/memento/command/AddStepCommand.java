package org.example.behavioral_design_patterns.memento.command;

import org.example.behavioral_design_patterns.memento.WorkflowDesigner;

public class AddStepCommand extends AbstractWorkflowCommand {

    private String step;

    public AddStepCommand(final WorkflowDesigner designer, final String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.addStep(step);
    }
}
