package behavioral.state;

// Context class
public class Order {

    private OrderState currentState;

    public Order() {
        currentState = new New();
    }

    public double cancel() {
        currentState = new Cancelled();
        return  currentState.handleCancellation();
    }

    public void paymentSuccessful() {
        currentState = new Paid();
    }

    public void dispatched() {
        currentState = new InTransit();
    }

    public void delivered() {
        currentState = new Delivered();
    }

}
