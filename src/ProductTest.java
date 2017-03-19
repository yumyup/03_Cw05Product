
public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product("kawa", "inka", 12, "napoje");
        Product product2 = new Product("woda", "muszyna", "napoje");
        product1.ShowInfo();
        product2.ShowInfo();
        System.out.println(product2.name + product2.producer + product2.category);
    }
}
