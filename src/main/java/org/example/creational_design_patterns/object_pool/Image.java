package org.example.creational_design_patterns.object_pool;

//Represents our abstract reusable
public interface Image extends Poolable{

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);
}
