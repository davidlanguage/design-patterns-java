package org.example.structural_design_patterns.composite;

//The component base class for composite pattern
//defines operations applicable both leaf & composite 
public abstract class File {

	private String name;

	public File(final String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	//Implemented by both BinaryFile and Directory
	public abstract void ls();

	//These three methods could be moved to the Directory class only
	//BinaryFile throws an UnsupportedOperationException for these
	public abstract void addFile(final File file);

	public abstract File[] getFiles();
	
	public abstract boolean removeFile(File file);
}
