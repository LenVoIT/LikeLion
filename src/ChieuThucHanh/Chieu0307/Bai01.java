package ChieuThucHanh.Chieu0307;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Bai01 {
    public static void main(String[] args) {
        //Khai báo 1 function nhận 1 tham số Integer đầu vào và trả về 1 Integer => Dùng để tính
        //ước số nguyên tố lớn nhất
        Function<Integer, Integer> findLargestPrimeFactor = (n) -> {
            //Khai báo Predicate nhận vào 1 Integer trả về giá trị kiểu boolean để kiểm tra có phải số nguyên
            // tố không
            Predicate<Integer> isPrime = (number) -> {
                //Số 1 và 0 kp snt
                if (number == 1 || number == 0)
                    return false;
                // 2 là snt
                if (number == 2)
                    return true;
                //Duyệt từ 2 đến căn bậc 2 của số cho trước để giảm số lần lặp của vòng lặp for
                for (int i = 2; i < Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                    return true;
                }
                return true;
            };
            if (n == 2)
                return 2;
            //nếu đầu vào là số nguyên tố thì trả về chính nó
            if (isPrime.test(n)) //tương đương với if(isPrime.test(n) == true)
                return n;
            //nếu đầu vào không phải là snt thì duyệt vòng lặp for
            // chạy từ số căn bậc 2 của số đã cho trước giảm dần để tìm được ước lớn nhất với
            // số lần lặp for ít nhất
            for (int i = (int) Math.sqrt(n); i > 2; i--) {
                if (n % i == 0 && isPrime.test(i))
                    return i;
            }
            return 1;
        };
        int n = 176;
        System.out.println("Number: " + n);
        System.out.println("Largest prime factor: " + findLargestPrimeFactor.apply(n));

        n = 36;
        System.out.println("Number: " + n);
        System.out.println("Largest prime factor: " + findLargestPrimeFactor.apply(n));

        n = 72;
        System.out.println("Number: " + n);
        System.out.println("Largest prime factor: " + findLargestPrimeFactor.apply(n));
    }
}
