package org.example.behavioral_design_patterns.chain_of_reponsibility;


public enum Role {
    DIRECTOR("Director"),
    MANAGER("Manager"),
    PROJECT_LEAD("Project Lead");

    private final String roleName;

    private Role(final String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
