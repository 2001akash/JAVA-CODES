//import java.util.;
public class Characters {
    public static void main(String[] args) {
        String text1 = "LOVELY  () PROFESSIONAL*&";
        text1 = text1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(text1.toLowerCase());
        String text2 = "lovely  () professional*&";
        text2 = text2.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(text2.toUpperCase());

    }
}