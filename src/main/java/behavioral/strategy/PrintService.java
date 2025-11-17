package behavioral.strategy;

import structure.bridge.LinkedList;

import java.util.Collection;

// Context
public class PrintService {

    private OrderPrinter printer;

    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(Collection<Order> orders) {
        printer.print(orders);
    }
}
