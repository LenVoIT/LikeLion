package ChieuThucHanh.Chieu0507;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Bai01 {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14);
        int sumOfEven = listNumbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(integer -> integer.intValue())
                .sum();
        int sumOfOdd = listNumbers.stream()
                .filter(number -> number % 2 != 0)
                .mapToInt(integer -> integer.intValue())
                .sum();
        System.out.println(listNumbers);
        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Sum of odd numbers: " + sumOfOdd);
    }
}
