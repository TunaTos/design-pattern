package behavioral.chain_of_responsibility.practice;

public class Level1Support extends SupportHandler{
    @Override
    public void handleRequest(String request, int priority) {
        if (priority <= 1) {
            System.out.println("Level 1 Support : " + request + " complete");
        } else if (nextHandler != null) {
            System.out.println("Level1 Support : next Level");
            nextHandler.handleRequest(request, priority);
        }
    }
}