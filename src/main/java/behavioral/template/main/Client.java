package behavioral.template.main;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        Order order = new Order("1001");
        order.addItem("Soda", 2.50);
        order.addItem("Coke", 11.95);
        order.addItem("Pizza", 15.95);

        OrderPrinter textPrinter = new TextPrinter();
        textPrinter.printOrder(order, "1001.txt");

        OrderPrinter htmlPrinter = new HtmlPrinter();
        htmlPrinter.printOrder(order, "1002.txt");
    }
}
