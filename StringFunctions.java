public class StringFunctions {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length);
        
        // Substring
        String substring = str.substring(7);
        System.out.println("Substring: " + substring);
        
        // Concatenation
        String anotherString = " Welcome!";
        String concatenatedString = str.concat(anotherString);
        System.out.println("Concatenated String: " + concatenatedString);
        
        // Character at index
        char charAt = str.charAt(4);
        System.out.println("Character at index 4: " + charAt);
        
        // Index of a character or substring
        int indexOf = str.indexOf('o');
        System.out.println("Index of 'o': " + indexOf);
        
        // Replace
        String replacedString = str.replace('l', 'L');
        System.out.println("Replaced String: " + replacedString);
        
        // Uppercase and lowercase
        String uppercaseString = str.toUpperCase();
        String lowercaseString = str.toLowerCase();
        System.out.println("Uppercase: " + uppercaseString);
        System.out.println("Lowercase: " + lowercaseString);
        
        // Trim leading and trailing whitespace
        String stringWithWhitespace = "   Hello   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Trimmed String: " + trimmedString);
        
        // Split into an array of substrings
        String sentence = "This is a sentence.";
        String[] words = sentence.split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }
        // Check if a string contains a specific substring
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);
    }
}
