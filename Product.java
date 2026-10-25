public class Product {
    public String name;
    private double price;
    protected int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative.");
            return;
        }
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Price: " + price + ", Stock: " + stock);
    }
}
