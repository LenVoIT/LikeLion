package SangLyThuyet.Sang2106;

import java.util.*;

public class Bai06 {
//    public static void main(String[] args) {
//        try {
//            List<Integer> nums = new ArrayList<>();
//            Scanner s = new Scanner(System.in);
//            System.out.print("Nhập số lượng phần tử:");
//            int n = s.nextInt();
//            System.out.println();
//            for (int i = 0; i < n; i++) {
//                System.out.print("a[" + i + "] = ");
//                int num = s.nextInt();
//                nums.add(num);
//            }
//            System.out.println(nums);
//        }catch (duplicateNumberException d){
//            System.out.println();
//        }
//
//    }
//    public void checkDuplicate(List<Integer> numbers) throws duplicateNumberException{
//        Set<Integer> uniqueNum = new HashSet<>();
//        for(int num:numbers){
//            if(uniqueNum.contains(num)){
//                throw new duplicateNumberException("Error: Duplicate number is: " + num);
//            }
//            uniqueNum.add(num);
//        }
//    }
//    class duplicateNumberException extends Exception{
//        public duplicateNumberException(String msg){
//            super(msg);
//        }
//    }
        public static void main(String[] args) {

        }

        public static List < Integer > readNumbersFromUser() {
            List < Integer > numbers = new ArrayList < > ();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số lượng phần tử: ");
            int count = scanner.nextInt();

            for (int i = 0; i < count; i++) {
                System.out.print("a[" + i + "] = ");
                int num = scanner.nextInt();
                numbers.add(num);
            }

            scanner.close();
            return numbers;
        }

    public void checkDuplicates(List<Integer> numbers) throws DuplicateNumberException {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int num : numbers) {
            if (uniqueNumbers.contains(num)) {
                throw new DuplicateNumberException("Duplicate number found: " + num);
            }
            uniqueNumbers.add(num);
        }
    }

    class DuplicateNumberException extends Exception {
        public DuplicateNumberException(String message) {
            super(message);
        }
    }

}
