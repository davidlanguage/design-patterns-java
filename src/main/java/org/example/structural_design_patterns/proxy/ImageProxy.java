package org.example.structural_design_patterns.proxy;


//Proxy class.
public class ImageProxy implements Image{

    private String fileName;

    //hold the referrence to the real object
    private BitmapImage bitmapImage;

    private Point2D location;

    public ImageProxy(String fileName){
        this.fileName = fileName;
    }


    @Override
    public void setLocation(final Point2D point2d) {
        if (bitmapImage != null){
            bitmapImage.setLocation(point2d);
        } else {
            //This is in case we do not have a real object
            location = point2d;
        }
    }

    @Override
    public Point2D getLocation() {

        if (bitmapImage != null){
            return bitmapImage.getLocation();
        } else {
            // if no real image is created, we are to return the cached or stored value
            return location;
        }

    }

    @Override
    public void render() {
        //If object is not present, we create it
        if(bitmapImage == null){
            bitmapImage = new BitmapImage(fileName);
            if (location != null){
                bitmapImage.setLocation(location);
            }

        }

        bitmapImage.render();
    }
}
