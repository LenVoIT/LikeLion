package ChieuThucHanh.Chieu0407;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Predicate;

public class Bai01 {

    public static void main(String[] args) {
        //Khai báo 1 Predicate(trả về boolean) có đầu vào là str
        Predicate<String> checkString = (str) -> {
            //Khai báo 1 biến reverseString là chuỗi viết ngược lại của thằng đầu vào str
            String reverseString = new StringBuilder(str).reverse().toString();
            return str.equals(reverseString);
        };
        //Khai báo chuỗi s và gán giá trị cho s
        String s = "Madam";
        //Check và display
        System.out.println(s + " is a palindrome? " + checkString.test(s));

        String s1 = "radar";
        System.out.println(s1 + " is a palindrome? " + checkString.test(s1));

        String s2 = "defied";
        System.out.println(s2 + " is a palindrome? " + checkString.test(s2));
    }

}
