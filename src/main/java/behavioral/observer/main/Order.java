package behavioral.observer.main;

import java.util.ArrayList;
import java.util.List;

// A concrete subject
public class Order {

    private  String id;

    private double itemCost;

    private int count;

    private double discount;

    private double shippingCost;

    public double getTotal() {
        return itemCost - discount + shippingCost;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    private List<OrderObserver> observers = new ArrayList<>();

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public Order(String id) {
        this.id = id;
    }

    public void addItem(double price) {
        itemCost += price;
        count++;
        observers.forEach(o -> o.updated(this));
    }

    public String getId() {
        return id;
    }

    public double getItemCost() {
        return itemCost;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", itemCost=" + itemCost +
                ", count=" + count +
                ", discount=" + discount +
                ", shippingCost=" + shippingCost +
                ", observers=" + observers +
                '}';
    }
}
