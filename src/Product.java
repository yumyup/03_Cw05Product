
public class Product {
    String name;
    String producer;
    double price;
    String category;

    Product(String name, String producer, double price, String category) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.category = category;
    }

    Product(String name, String producer, String category) {
        this.name = name;
        this.producer = producer;
        this.category = category;
    }
    void ShowInfo (){
        System.out.println(name + producer + category + price);
    }

}
