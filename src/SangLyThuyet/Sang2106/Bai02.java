package SangLyThuyet.Sang2106;

public class Bai02 {
    public static void main(String[] args) {
        String str = "hello";
        char[] charArr = str.toCharArray(); //ép chuỗi str thành mảng char
        char[] charArr2 = new char[charArr.length*2]; // tạo 1 mảng char mới với độ dài bằng 2 lần mảng char
        for(int i =0;i<charArr.length;i++){
            charArr2[2*i]=charArr[i]; // gán ký tự đầu của mảng 1 vào mảng 2 (index thứ i)
            charArr2[2*i+1]=charArr[i]; // gán ký tự đầu của mảng 1 vào mảng 2(index thứ i+1)
        }
        str = new String(charArr2);
        System.out.println(str);
    }
}
