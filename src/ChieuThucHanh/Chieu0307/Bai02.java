package ChieuThucHanh.Chieu0307;

import java.util.function.Function;

public class Bai02 {
    public static void main(String[] args) {
        //Khai báo 1 function nhận vào Integer trả về binary theo kiểu String
        Function<Integer,String> numberToBinary = (inputNumber) -> {
            //Ép kiểu Integer về binary
            return Integer.toBinaryString(inputNumber);
        };
        int number = 33;
        System.out.println("Binary of " + number + " is: " + numberToBinary.apply(number));
        number = 747;
        System.out.println("Binary of " + number + " is: " + numberToBinary.apply(number));
    }

}
