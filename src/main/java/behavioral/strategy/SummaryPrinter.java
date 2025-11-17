package behavioral.strategy;

import java.util.Collection;
import java.util.Iterator;

// Concrete strategy
public class SummaryPrinter implements OrderPrinter{

    @Override
    public void print(Collection<Order> orders) {
        System.out.println("************ Summary Report ************");
        Iterator<Order> iter = orders.iterator();
        double total = 0;
        for (int i = 1; iter.hasNext(); ++i) {
            Order order = iter.next();
            System.out.println(i + ". " + order.getId() + "\t"+order.getDate()+"\t"+order.getItems().size()+"\t"+order.getTotal());
            total += order.getTotal();
        }
        System.out.println("************************");
        System.out.println("\t\t\t\tTotal : " +total);
    }
}
