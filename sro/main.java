public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addProduct(new Product("Laptop", 10, 500000));
        warehouse.addProduct(new Product("Phone", 20, 300000));

        warehouse.showProducts();

        warehouse.updateProduct("Laptop", 5, 450000);
        warehouse.searchProduct("Laptop");

        warehouse.deleteProduct("Phone");

        warehouse.showProducts();
    }
}