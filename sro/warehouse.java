import java.util.HashMap;

public class Warehouse {
    HashMap<String, Product> products = new HashMap<>();

    // CREATE
    public void addProduct(Product product) {
        products.put(product.name, product);
    }

    // READ
    public void showProducts() {
        for (Product p : products.values()) {
            p.display();
        }
    }

    // UPDATE
    public void updateProduct(String name, int quantity, double price) {
        if (products.containsKey(name)) {
            products.put(name, new Product(name, quantity, price));
        } else {
            System.out.println("Product not found");
        }
    }

    // DELETE
    public void deleteProduct(String name) {
        products.remove(name);
    }

    // SEARCH
    public void searchProduct(String name) {
        if (products.containsKey(name)) {
            products.get(name).display();
        } else {
            System.out.println("Product not found");
        }
    }
}