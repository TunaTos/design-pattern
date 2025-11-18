package behavioral.template.main;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private String id;

    private LocalDate date;

    private Map<String, Double> items = new HashMap<>();

    private double total;

    public Order(String id) {
        this.id = id;
        date = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTotal() {
        return total;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public void addItem(String key, double value) {
        items.put(key, value);
    }
}
