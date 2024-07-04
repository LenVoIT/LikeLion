package ChieuThucHanh.Chieu0407;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bai02 {
    public static void main(String[] args) {
        //khai báo 1 mảng các phần tử kiểu dữ liệu integer
//        Integer[] numbers = {1,7,18,25,77,300,101};
        //hoặc khai báo theo list
        List<Integer> listInteger = Arrays.asList(1, 7, 18, 25, 77, 300, 101);
        //Sử dụng cách 1 thì ép kiểu mảng number về thành mảng string
//        String listNumbersToArray = Arrays.toString(numbers);
        System.out.println(listInteger);

        //Khai báo 1 Function<List,Integer> để nhận vào 1 mảng các phần tử số nguyên và trả về
        //phần tử lớn thứ 2 và nhỏ nhất trong mảng

        //Khai báo class Optional kiểu Integer = ép stream thằng listInteger vào
        //sắp xếp giảm dần bỏ qua phần tử đầu tiên(phần tử lớn nhất) lấy phần tử thứ 2
        //Nếu không có trả về null
        Optional<Integer> sortedList = listInteger.stream()
                .distinct() //remove duplicate
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        //gọi sortedList của class Optional . phương thức ifPresent(nếu có)
        //secLarNum là khai báo biến nhận vào
        sortedList.ifPresent(secLarNum -> System.out.println("Second largest element: " + secLarNum));

        //Tìm phần tử nhỏ nhất
        Optional<Integer> sortedList1 = listInteger.stream()
                .distinct() //remove duplicate
                .sorted()
                .findFirst();
        //Viết theo lambda
        sortedList1.ifPresent(smallestNum -> System.out.println("Smallest element: " + smallestNum));
        //viết theo method reference
//        System.out.print("Smallest element: ");
//        sortedList1.ifPresent(System.out::println);


    }
}
