package org.example.behavioral_design_patterns.memento;

public class WorkflowDesigner {

    private Workflow workflow;

    public void createWorkflow(final String name) {
        workflow = new Workflow(name);
    }

    public Workflow getWorkflow() {
        return this.workflow;
    }

    public Memento getMemento(){

        if (workflow == null){

            return new Memento();
        }

        return new Memento(workflow.getSteps(), workflow.getName());
    }

    public void setMemento(final Memento memento) {

        //Memento is empty only if workflow is empty
        //In that case, the previous step must be an empty workflow
        if (memento.isEmpty()){
            this.workflow = null;
        } else{
            // we return the Memento values to the workflow
            this.workflow = new Workflow(memento.getName(), memento.getSteps());
        }



    }

    public void addStep(String step) {
        workflow.addStep(step);
    }

    public void removeStep(String step) {
        workflow.removeStep(step);
    }

    public void print() {
        System.out.println(workflow);
    }

    //Inner class for Memento
    public class Memento {

        // We use an array instead of a List, because the Memento object should be immutable
        private String[] steps;

        private String name;

        private Memento(){

        }

        private Memento(final String[] steps, final String name){
            this.steps = steps;
            this.name = name;
        }

        private String[] getSteps(){
            return steps;
        }

        private String getName(){
            return name;
        }

        private boolean isEmpty(){
            return this.getSteps() == null && this.getName() == null;
        }

    }
}
