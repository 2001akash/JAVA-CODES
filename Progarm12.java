import java.util.ArrayList;

public class Progarm12 {
    public static void main(String[] args) {
        ArrayList<String> shopping_cart = new ArrayList<String>();
        System.out.print("Total Productcount Count  in Cart" + shopping_cart.size());
        // let us add elment
        shopping_cart.add("iphone");
        shopping_cart.add("airPods");
        shopping_cart.add("charger");
        shopping_cart.add("dvd");
        shopping_cart.add("watch");
        System.out.print("Total Product count in cart" + shopping_cart.size());
        shopping_cart.remove("dvd");
        System.out.println(shopping_cart);
        System.out.println("Total Product in cart" + shopping_cart.size());
        for (String product : shopping_cart) {
            System.out.println("You Added:" + product);
        }
    }
}
