package behavioral.chain_of_responsibility.practice;

public class Level2Support extends  SupportHandler{
    @Override
    public void handleRequest(String request, int priority) {
        if (priority <= 2) {
            System.out.println("Level 2 Support" + request + " complete");
        } else if (nextHandler != null) {
            System.out.println("Level 2 Support: next Level");
            nextHandler.handleRequest(request, priority);
        }
    }


}
