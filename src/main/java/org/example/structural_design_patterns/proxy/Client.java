package org.example.structural_design_patterns.proxy;


public class Client {

	public static void main(String[] args) {

		final Image img = ImageFactory.getImage("A1.bmp");

		img.setLocation(new Point2D(10,10));

		System.out.println("Image location: " + img.getLocation());

		System.out.println("Rendering image...");

		//Only when we call render the real object is created
		img.render();
	}

}
