package org.example.creational_design_patterns.singleton;

public class Client {

	public static void main(String[] args) {

		final EagerRegistry registry = EagerRegistry.getInstance();
		final EagerRegistry registry2 = EagerRegistry.getInstance();

		System.out.println(registry);
		System.out.println(registry2);

		final LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getInstance();
		final LazyRegistryWithDCL lazyRegistryWithDCL2 = LazyRegistryWithDCL.getInstance();

		System.out.println(lazyRegistryWithDCL);
		System.out.println(lazyRegistryWithDCL2);

		LazyRegistryIODH singleton;
		singleton = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();

		System.out.println("-");

	}

}
