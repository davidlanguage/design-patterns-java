package org.example.creational_design_patterns.prototype;


/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {
	
	private Point3D position;
	
	public GameUnit() {
		position = Point3D.ZERO;
	}
	
	public GameUnit(float x, float y, float z) {
		position = new Point3D(x, y, z);
	}

	public void move(final Point3D direction, final float distance) {
		Point3D finalMove = direction.normalize();
		finalMove = finalMove.multiply(distance);
		position = position.add(finalMove);
	}
	
	public Point3D getPosition() {
		return position;
	}

	protected void initialize(){
		this.position = Point3D.ZERO;
		reset();
	}

	protected abstract void reset();

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
		final GameUnit unit = (GameUnit) super.clone();
		unit.initialize();
		return unit;
    }
}
