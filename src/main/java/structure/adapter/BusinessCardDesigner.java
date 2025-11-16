package structure.adapter;

/**
 * Client code which requires Customer interface
 */
public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        String card = "";
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }
}
