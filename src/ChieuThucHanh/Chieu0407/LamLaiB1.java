package ChieuThucHanh.Chieu0407;

import java.util.function.Predicate;

public class LamLaiB1 {
    public static void main(String[] args) {
        Predicate<String> isPalinrome = (str) -> {
            String reverseStr = new StringBuilder(str).reverse().toString();
            return str.equals(reverseStr);
        };
        String s = "Madam";
        System.out.println(s + " is a palindrome ? " + isPalinrome.test(s));
        String s1 = "radar";
        System.out.println(s1 + " is a palindrome ? " + isPalinrome.test(s1));
    }
}

