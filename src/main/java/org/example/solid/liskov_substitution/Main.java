package org.example.solid.liskov_substitution;

public class Main {

	public static void main(String[] args) {
		
		final Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());
		
		final Square square = new Square(10);
		System.out.println(square.computeArea());
		
		useRectangle(rectangle);
		
		useSquare(square);

		computeRectangle(rectangle);

		computeSquare(square);

	}

	private static void useRectangle(final Rectangle rectangle) {
		rectangle.setHeight(20);
		rectangle.setWidth(30);
		assert rectangle.getHeight() == 20 : "Height Not equal to 20";
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";
	}

	private static void useSquare(final Square square){
		square.setSide(10);
		assert square.getSide() == 10 : "Side Not Equal to 10";
	}

	private static void computeRectangle(final Rectangle rectangle){

		final int expectedRectangleResult = 600;

		rectangle.setHeight(20);

		rectangle.setWidth(30);

		assert rectangle.computeArea() == expectedRectangleResult : "Side Not Equal to 600";
	}

	private static void computeSquare(final Square square){

		final int expectedSquareResult = 100;

		square.setSide(10);

		assert square.computeArea() == expectedSquareResult : "Side Not Equal to 100";
	}
}
