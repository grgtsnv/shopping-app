class PhysicalProduct extends Product {
    private double weight;
    private double shippingCost;

    public PhysicalProduct(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " (Physical) - " + price + " BGN, Weight: " + weight + "kg");
    }
}
