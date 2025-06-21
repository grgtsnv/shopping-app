import java.util.*;

public class Order {
    private Customer customer;
    private ArrayList<Product> items;
    private double total;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>(customer.getCart().getProducts());
        this.total = customer.getCart().getTotal();
    }

    public void displayOrder() {
        System.out.println("\nOrder for: " + customer.getName());
        for(Product p : items){
            p.displayInfo();
        }
        System.out.println("Total: $" + total);
    }
}
