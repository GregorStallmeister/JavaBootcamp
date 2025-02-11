package ai_aided_coding;

public class RverseString {
    public static void main(String[] args) {
        String original = "Hello";
        String reversed = reverseString(original);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
