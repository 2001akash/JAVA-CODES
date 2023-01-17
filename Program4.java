import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {
        String animal = "crocodile";
        // animal[4] = "a";//error:coz string is immutable ds (only)
        // .charAt(index):this fn lets us access a character at given index
        System.out.println(animal.charAt(1));
        // using loop to access all elemnets using .charAt()
        for (int index = 0; index < animal.length(); index++) {
            System.out.println(animal.charAt(index));
        }
        // converting a string into character array using .to CharArrya()
        char[] letters = animal.toCharArray();
        // advantage of converting a string to chracter is that we can update values in
        // char array
        letters[4] = 'a';
        System.out.println(Arrays.toString(letters));
        // converting char array to string
        String newAnimal = new String(letters);
        System.out.println(newAnimal);
    }
}
