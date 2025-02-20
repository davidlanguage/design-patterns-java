package org.example.behavioral_design_patterns.memento.command;

import org.example.behavioral_design_patterns.memento.WorkflowDesigner;

public class RemoveStepCommand extends AbstractWorkflowCommand {

    private String step;

    public RemoveStepCommand(final WorkflowDesigner designer, final String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        memento = receiver.getMemento();
        receiver.removeStep(step);
    }
}
