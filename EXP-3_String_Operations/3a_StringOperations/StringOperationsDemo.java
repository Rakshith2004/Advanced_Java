/*
Develop a java program for performing various string operations with different string handling functions directed as follows;
String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations,
String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , 
Validate Email with contains( ) and startsWith() and endsWith().
*/


package string;
public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("Are str1 and str2 equal? " + str1.equals(str2));
        System.out.println("Comparing str1 and str2 lexicographically: " + str1.compareTo(str2));

        // 4. String Searching
        String searchStr = "Hello World";
        System.out.println("Does 'Hello World' contain 'World'? " + searchStr.contains("World"));
        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));

        // 5. Substring Operations
        System.out.println("Substring of str1 from index 1 to 4: " + str1.substring(1, 4));

        // 6. String Modification
        String modifiedStr = str1.replace('l', 'x');
        System.out.println("After replacing 'l' with 'x' in str1: " + modifiedStr);

        // 7. Whitespace Handling
        String messy = "   Java Programming   ";
        System.out.println("Before trim: '" + messy + "'");
        System.out.println("After trim: '" + messy.trim() + "'");

        // 8. String Concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenated);

        // 9. String Splitting
        String csv = "Red,Green,Blue";
        String[] colors = csv.split(",");
        System.out.println("Splitted colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 10. StringBuilder Demo (Mutable Strings)
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder content: " + sb.toString());

        // 11. String Formatting
        String name = "Padmaraj";
        int age = 21;
        String formatted = String.format("Name: %s | Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email using contains(), startsWith(), endsWith()
        String email = "padmaraj@example.com";
        System.out.println("Email contains '@': " + email.contains("@"));
        System.out.println("Email starts with 'padmaraj': " + email.startsWith("padmaraj"));
        System.out.println("Email ends with '.com': " + email.endsWith(".com"));
    }
}
