package SangLyThuyet.Sang0407;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Baitap {
    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(1.2,3.5,4.8,6.9,5.2);
        Function<List<Double>,Double> findAverage = (List<Double> input) -> {
            //Khai báo biến tổng là sum
            //Tạo ra 1 stream với các phần tử từ danh sách trong input
            //MapToDouble là phương thức của stream ánh xạ đến từng phần tử của stream sang giá trị double
            //Cách 1
//            double sum = input.stream().mapToDouble(Double::doubleValue).sum();
//            return sum / input.size();

            //Cách 2
            double result = input.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            return result;
        };
        //Cách 1
//        double ave = findAverage.apply(doubleList);
//        System.out.println(ave);

        //Cách 2
        System.out.println(findAverage.apply(doubleList));
    }
}
