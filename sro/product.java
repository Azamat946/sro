public class Product {
    String name;
    int quantity;
    double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void display() {
        System.out.println(name + " | Qty: " + quantity + " | Price: " + price);
    }
}