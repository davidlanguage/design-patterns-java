package org.example.structural_design_patterns.composite;

public class Client {
	
	
	public static void main(String[] args) {
		final File root1 = createTreeOne();
		root1.ls();

		System.out.println("------------------------------------");

		final File root2 = createTreeTwo();
		root2.ls();
	}
	
	//Client builds tree using leaf and composites
	private static File createTreeOne() {
		final File file1 = new BinaryFile("File1", 1000);
		final Directory dir1 = new Directory("dir1");
		dir1.addFile(file1);
		final File file2 = new BinaryFile("file2", 2000);
		final File file3 = new BinaryFile("file3", 150);
		final Directory dir2 = new Directory("dir2");
		dir2.addFile(file2);
		dir2.addFile(file3);
		dir2.addFile(dir1);
		return dir2;
	}

	private static File createTreeTwo() {
		return new BinaryFile("Another file", 200);
	}
}
