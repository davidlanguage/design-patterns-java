package org.example.structural_design_patterns.bridge;

//This is the abstraction. 
//It represents a First in First Out collection
public interface FifoCollection<T> {

	//Adds element to collection
	void offer(T element);
	
	//Removes & returns first element from collection
	T poll();

}
