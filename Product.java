import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Product {// program 35
    int productId;
    String productName;
    int price;
    String category;

    public Product(int productId, String productName, int price, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return this.productId + " " + this.productName + " " + this.price + " " + this.category;
    }

    public static void main(String[] args) {
        Product p1 = new Product(1000, "Product1", 10000, "Category1");
        Product p2 = new Product(1001, "Product2", 11000, "Category2");
        Product p3 = new Product(1002, "Product3", 12000, "Category1");
        Product p4 = new Product(1003, "Product4", 13000, "Category1");
        Product p5 = new Product(1004, "Product5", 14000, "Category2");
        Product p6 = new Product(1005, "Product6", 15000, "Category2");
        Product p7 = new Product(1006, "Product7", 16000, "Category3");

        Product[] products = new Product[] { p1, p2, p3, p4, p5, p6, p7 };
        Stream<Product> prodStream = Arrays.stream(products);
        Scanner sc = new Scanner(System.in);
        System.out.println("Chooose any category: ");
        String cat = sc.next();
        Stream<Product> catStream = prodStream.filter(elem -> (elem.category).equalsIgnoreCase(cat));
        catStream.forEach(elem -> System.out.println(elem.toString()));
        sc.close();
    }
}