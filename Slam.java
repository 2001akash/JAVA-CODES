import java.util.Scanner;

public class Slam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name? ");

        String name = sc.next();

        System.out.println("what is your  hobby? ");

        String hobby = sc.next();

        System.out.println("Favourite langyuge? ");

        String lang = sc.next();
        System.out.println("Best friend");
        String friend = sc.next();
        String msg = String.format(
                "Your Name is  %s, Your hobby is %f , your favourite language is %s , , your best friendis %s,",
                name, hobby, lang, friend);
        sc.close();
        System.out.println(msg);
    }

}
