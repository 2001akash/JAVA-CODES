import java.util.Arrays;

public class Program9 {
    public static void main(String[] args) {
        String part1 = "Lovely Professional";
        String part2 = " University ";
        String finalResult = part1.concat(part2);
        System.out.println(finalResult);
        // concatenation
        String msg = "Crocodile";
        System.out.println(msg.indexOf("r"));
        String testStr1 = "Rockstar";
        String testStr2 = "rockstar";
        // compare two strings
        System.out.println(testStr1.compareTo(testStr2));
        // ignore case
        System.out.println(testStr1.compareToIgnoreCase(testStr2));
        // contains method
        System.out.println(msg.contains("roco"));
        // replace method
        System.out.println(msg.replace("o", "@"));
        // this fn gives string from start till end index
        System.out.println(msg.substring(1, 4));
        // split fn
        String icecream = "chocooate-rumraisin-vanilla-strwberry";
        String[] flavors = icecream.split("-");
        System.out.println(Arrays.toString(flavors));
    }
}
