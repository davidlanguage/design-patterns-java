package org.example.solid.liskov_substitution;

public class Rectangle implements IShape {

	private int width;
	
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int computeArea() {
		return width * height;
	}
}
