package org.example.structural_design_patterns.proxy;

//Factory to get image objects. 
public class ImageFactory {
	//We'll provide proxy to caller instead of real object

    public static Image getImage(final String fileName){
        return new ImageProxy(fileName);
    }
}
