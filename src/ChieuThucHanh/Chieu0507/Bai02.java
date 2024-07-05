package ChieuThucHanh.Chieu0507;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Bai02 {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(10,23,22,23,24,24,33,15,26,15);
        List<Integer> removeDuplicate = listNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Original list numbers: " + listNumbers);
        System.out.println("After removing duplicates: " + removeDuplicate);
    }
}

