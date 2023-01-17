
import java.util.Scanner;

//by akash deep
public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the world");
        String str = sc.next();
        String nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'a')
                ch = '0';
            else if (ch == 'e')
                ch = '1';
            else if (ch == 'i')
                ch = '2';
            else if (ch == 'o')
                ch = '3';
            else if (ch == 'u')
                ch = '4';
            nstr = ch + nstr;
        }
        sc.close();
        System.out.println(nstr + "aca");
    }
}