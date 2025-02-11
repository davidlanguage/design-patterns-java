package org.example.creational_design_patterns.singleton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL(){

    }

    //Volatile forces read/write from main memory instead of cache
    private static volatile LazyRegistryWithDCL INSTANCE;

    public static LazyRegistryWithDCL getInstance(){

        if (INSTANCE == null){
            synchronized (LazyRegistryWithDCL.class){
                //We check again the null value in case more than one thread might be in the synchronized block
                //If so, two new INSTANCE objects would be created, and we only want one
                //As it is synchronized, as soon as one thread creates the new instance, it will not be null for the others
                if (INSTANCE == null){
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }

        return INSTANCE;
    }
 
}
