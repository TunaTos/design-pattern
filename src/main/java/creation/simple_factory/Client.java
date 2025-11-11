package creation.simple_factory;

public class Client {

    public static void main(String[] args) {
        Post blog = PostFactory.createPost("BlogPost");
        Post news = PostFactory.createPost("NewsPost");
        Post product = PostFactory.createPost("ProductPost");

        System.out.println(blog.getClass().getName());
        System.out.println(news.getClass().getName());
        System.out.println(product.getClass().getName());
    }
}

