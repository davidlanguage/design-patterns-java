package org.example.behavioral_design_patterns.iterator;

public class Client {

	public static void main(String[] args) {

		final Iterator<ThemeColor> iterator = ThemeColor.getIterator();

		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}
