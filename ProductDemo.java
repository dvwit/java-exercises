public class ProductDemo {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 1200.0, 10);

        System.out.println(p.name);   // accessible (public)
        // System.out.println(p.price); // ERROR: private field cannot be accessed directly
        // System.out.println(p.stock); // OK only if ProductDemo is in the same package
    }
}
