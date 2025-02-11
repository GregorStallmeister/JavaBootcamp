package ai_aided_coding;

public class Palindrome {
//    public static void main(String[] args) {
//        String input = "Anna";
//        if (isPalindrome(input)) {
//            System.out.println(input + " is a palindrome.");
//        } else {
//            System.out.println(input + " is not a palindrome.");
//        }
//    }
//
//    public static boolean isPalindrome(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left < right) {
//            // If characters at left and right indices are not equal, it's not a palindrome
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }

    public static void main(String[] args) {
        String input = "Anna";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // If characters at left and right indices are not equal, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
