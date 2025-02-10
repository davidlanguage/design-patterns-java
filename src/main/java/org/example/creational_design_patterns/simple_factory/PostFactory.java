package org.example.creational_design_patterns.simple_factory;

/**
 * This class acts as a simple factory for creation of 
 * different posts on website.
 *
 */
public class PostFactory {

    public static Post createPost(final String type){
        return switch (type) {
            case "blog" -> new BlogPost();
            case "news" -> new NewsPost();
            case "product" -> new ProductPost();
            default -> throw new IllegalArgumentException("Post Type is Unknown");
        };

    }
}
