package org.example.creational_design_patterns.singleton;
/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {

    // We overwrite the default empty public constructor
    private EagerRegistry(){
        //With a private constructor we ensure EagerRegistry cannot be inherited
    }

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    public static EagerRegistry getInstance(){
        return INSTANCE;
    }

}