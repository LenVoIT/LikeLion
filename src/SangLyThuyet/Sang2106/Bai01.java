package SangLyThuyet.Sang2106;

import java.util.HashSet;

public class Bai01 {
    public static void main(String[] args) {
        int[] arr = {5,1,8,4,9,1,5};
        int sum = 0;
        HashSet<Integer> hs = new HashSet<>();//Set tập hợp các phần tử không trùng lặp
        for(int arrNum : arr){//duyệt phần tử trong mảng Set tên là arr
            if(!hs.contains(arrNum)){ // nếu nó không chứa trước đó thì cộng dồn
                sum+=arrNum;
                hs.add(arrNum);
            }
        }
        System.out.println(sum);
    }
}
