package org.example.solid.liskov_substitution;

public class Square implements IShape {

	public int side;

	public Square(int side) {
		this.side = side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getSide(){
		return side;
	}

	@Override
	public int computeArea() {
		return side*side;
	}
}
