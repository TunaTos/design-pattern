package behavioral.chain_of_responsibility.practice;

public class Level3Support extends SupportHandler{
    @Override
    public void handleRequest(String request, int priority) {
        System.out.println("Level 3 Support (Manager): " + request + " complete");
    }
}
