package behavioral.template.main;

import java.util.Map;

public class HtmlPrinter extends OrderPrinter {

    @Override
    protected String start() {
        return "<html><body>";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "<h1>Order #" + order.getId() + "</h1>";
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder sb = new StringBuilder("<ul>");
        for (Map.Entry<String, Double> item : order.getItems().entrySet()) {
            sb.append("<li>").append(item.getKey())
                    .append(" x ").append(item.getValue())
                    .append("</li>");
        }
        sb.append("</ul>");
        return sb.toString();
    }

    @Override
    protected String formatTotal(Order order) {
        return "<h3>Total: $" + order.getTotal() + "</h3>";
    }

    @Override
    protected String end() {
        return "</body></html>";
    }
}
