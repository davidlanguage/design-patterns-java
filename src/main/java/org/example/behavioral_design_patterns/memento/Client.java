package org.example.behavioral_design_patterns.memento;

import org.example.behavioral_design_patterns.memento.command.AddStepCommand;
import org.example.behavioral_design_patterns.memento.command.CreateCommand;
import org.example.behavioral_design_patterns.memento.command.WorkflowCommand;

import java.util.LinkedList;

public class Client {

    public static void main(String[] args) {
        final WorkflowDesigner designer = new WorkflowDesigner();
        final LinkedList<WorkflowCommand> commands = runCommands(designer);
        designer.print();
        undoLastCommand(commands);
        designer.print();
        undoLastCommand(commands);
        designer.print();
        undoLastCommand(commands);
        designer.print();
        undoLastCommand(commands);
        designer.print();
        undoLastCommand(commands);
        designer.print();
    }

    private static void undoLastCommand(final LinkedList<WorkflowCommand> commands) {
        if(!commands.isEmpty())
            commands.removeLast().undo();
    }

    private static LinkedList<WorkflowCommand> runCommands(final WorkflowDesigner designer) {
        final LinkedList<WorkflowCommand> commands = new LinkedList<>();

        WorkflowCommand cmd = new CreateCommand(designer,"Leave Workflow");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer,"Create Leave Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer,"Submit Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer,"Application Approved");
        commands.addLast(cmd);
        cmd.execute();

        return commands;
    }
}
