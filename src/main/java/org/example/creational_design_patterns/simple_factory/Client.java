package org.example.creational_design_patterns.simple_factory;

public class Client {

	public static void main(String[] args) {
		final Post post = PostFactory.createPost("news");
		System.out.println(post);

	}

}
