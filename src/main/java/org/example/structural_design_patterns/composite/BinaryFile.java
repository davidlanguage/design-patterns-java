package org.example.structural_design_patterns.composite;

//Leaf node in composite pattern
public class BinaryFile extends File{

    //This is to represent the size of our file
    private long size;

    public BinaryFile(String name, long size){
        super(name);
        this.size = size;
    }


    @Override
    public void ls() {
        System.out.println(getName() + "\t"+size);
    }

    //The methods below have no meaning in BinaryFile
    //As we have all operations in File, we need to show this is unsupported
    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Leaf node does not support add operation");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf node does not support get operation");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Leaf node does not support remove operation");
    }
}
