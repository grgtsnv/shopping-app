import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter client's name: ");
        String customName = scan.nextLine();
        Customer customer = new Customer(customName);

        boolean addingProducts = true;

        while (addingProducts) {
            System.out.println("\nAdd product to cart:");
            System.out.println("Choose product type:");
            System.out.println("1. Physical Product");
            System.out.println("2. Digital Product");
            System.out.print("Your choice (1/2): ");
            String typeChoice = scan.nextLine();

            System.out.print("Enter product name: ");
            String productName = scan.nextLine();

            System.out.print("Enter product price (USD): ");
            double productPrice = Double.parseDouble(scan.nextLine());

            switch (typeChoice) {
                case "1" -> {
                    System.out.print("Enter product weight in kg: ");
                    double weight = Double.parseDouble(scan.nextLine());

                    Product p = new PhysicalProduct(customName, weight, weight);
                    customer.getCart().addProduct(p);
                }
                case "2" -> {
                    System.out.println("Enter file size in MB");
                    double fileSize = Double.parseDouble(scan.nextLine());

                    Product p = new DigitalProduct(productName, productPrice, fileSize);
                    customer.getCart().addProduct(p);
                }
                default -> {
                    System.out.println("Invalid product choice.");
                }
            }

            System.out.println("Add more products?: (Y/N)");
            String more = scan.nextLine().toUpperCase();

            if (!more.equals("Y")) {
                addingProducts = false;
            }
        }

        System.out.println("\n---Your Cart---");
        customer.getCart().viewCart();

        Order order = new Order(customer);
        order.displayOrder();

        scan.close();
    }
}
