package creation.simple_factory;

public class PostFactory {

    public static Post createPost(String type)  {
        return switch (type) {
            case "BlogPost" -> new BlogPost();
            case "NewsPost" -> new NewsPost();
            case "ProductPost" -> new ProductPost();
            default -> throw new IllegalArgumentException("Post type is unknown");
        };
    }
}
