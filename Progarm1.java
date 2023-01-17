import java.util.Scanner;

public class Progarm1 {
    public static void main(String[] args) {
        char letter = 'A';
        int code = letter;
        System.out.println(code);
        int mycode = 67;// code to character
        char letter1 = (char) mycode;// explicit type conversion
        System.out.println(letter1);
        // dora the explorer method
        for (code = 50; code <= 64; code++)
            System.out.println(code + "" + (char) code);
        for (code = 91; code <= 96; code++)
            System.out.println(code + "" + (char) code);

        // uranary oprtator ++,--
        // ++increments the value of a variabke by 1
        // --decrement the value of a variable by 1
        // postfix: eg var++, when operator is after varaible
        // prefix:eg ++var,when variable is before variable
        int test = 99;
        int result = --test;
        System.out.println(test);
        System.out.println(result);
        // Printing first ??? increment/decrement first??
        int secret = 99;
        System.out.println(++secret);
        System.out.println(++secret);
        System.out.println(secret--);
        System.out.println(++secret);
        System.out.println(++secret);
        System.out.println(secret++);

        // takingn input from user:using scanner class
        Scanner sc = new Scanner(System.in); // is a package:u can compare
        System.out.println("What  is your name");
        String name = sc.next();
        System.out.println("What  is your age");
        int age = sc.nextInt();
        System.out.println("What  is your height");
        float height = sc.nextFloat();
        String msg = String.format("Hello%s,Your age is %d and height is %f",
                name, age, height);
        String msg1 = "Hello" + name + "you age is" + "your height is " + height;
        sc.close();
        System.out.println(msg);
        System.out.println(msg1);
    }
}
