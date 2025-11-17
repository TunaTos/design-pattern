package behavioral.strategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Concrete strategy
public class DetailPrinter implements OrderPrinter{
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("***************** Detail Report *****************");
        Iterator<Order> iter = orders.iterator();
        double grandTotal = 0;
        for (int i = 1; iter.hasNext(); ++i) {
            Order order = iter.next();
            System.out.println(i + ". Order ID: " + order.getId());
            System.out.println("   Date: " + order.getDate());
            System.out.println("   Items:");
            for (Map.Entry<String, Double> entry : order.getItems().entrySet()) {
                System.out.println("      - " + entry.getKey() + ": $" + entry.getValue());
            }
            System.out.println("   Order Total: $" + order.getTotal());
            System.out.println();
            grandTotal += order.getTotal();
        }
        System.out.println("*************************************************");
        System.out.println("Grand Total: $" + grandTotal);
    }
}
