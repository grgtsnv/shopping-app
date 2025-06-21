import java.util.*;

public class Cart {

    private ArrayList<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product: " + p.getName() + " added to cart!");
    }

    public void viewCart() {
        if(products.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }
        
        for(Product p : products) {
            System.out.println("Product: ");
            p.displayInfo();
        }
    }

    public double getTotal() {
        double total = 0;
        for(Product p : products) {
            total += p.getPrice();
        }

        return total;
    }

    public void clearCart() {
        products.clear();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
