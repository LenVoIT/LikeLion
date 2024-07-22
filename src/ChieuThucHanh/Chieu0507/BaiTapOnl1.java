package ChieuThucHanh.Chieu0507;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BaiTapOnl1 {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        //Tính giá trị trung bình của dãy số trên
        double average = listNumbers.stream()
                .mapToDouble(number -> number.doubleValue())
                .average()
                .orElse(0.0);
        System.out.println(average);

        //Dùng stream chuyển đổi các phần tử của danh sách chuỗi thành Uppercase||Lowercase
        List<String> listString = Arrays.asList("Honda", "YAMAHa", "vinfast");
        System.out.println(listString);
        List<String> toUpperCase = listString.stream()
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(toUpperCase);

        //Write a Java program to count the number of strings in
        // a list that start with a specific letter using streams.
        List<String> listString2 = Arrays.asList("Python", "Php", "C#", "C++", "C", "Java", "Ruby", "Golang", "Dart"
                , "Kotlin", "JS");
        int count = (int) listString2.stream()
//                .map(str -> str.startsWith("C"))
                .filter(c -> c.startsWith("C"))
                .count();
        System.out.println(count);

        List<String> sortedString = listString2.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedString);

        //Max & min element
        int maxElement = listNumbers.stream()
                .mapToInt(nums -> nums.intValue())
                .max()
                .orElse(1);
        System.out.println("Max element: " + maxElement);

        int minElement= listNumbers.stream()
                .mapToInt(nums -> nums.intValue())
                .min()
                .orElse(1);
        System.out.println("Min element: " + minElement);

        //Second smallest & second largest
        int secondSmallesEle = listNumbers.stream()
                .distinct()
                .sorted()
                .mapToInt(nums -> nums.intValue())
                .skip(1)
                .findFirst()
                .orElse(1);
        System.out.println("Second smallest element: " + secondSmallesEle);

        int secondLargestEle = listNumbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .mapToInt(nums -> nums.intValue())
                .skip(1)
                .findFirst()
                .orElse(1);
        System.out.println("Second largest element: " + secondLargestEle);

        int sum = listNumbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);

        int parallelSum = listNumbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Parallel Sum: " + parallelSum);
    }
}
