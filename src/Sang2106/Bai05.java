package Sang2106;

import java.util.ArrayList;
import java.util.TreeMap;

public class Bai05 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("Chuỗi ban đầu là: " + s1 + " " + s2);

        //solution
        //nối chuỗi 2 vào chuỗi 1
        s1 = s1 + s2; //s1 = "Hello World"
        //gán chuỗi s2 vào chuỗi s1
        s2 = s1.substring(0,s1.length()-s2.length()); //s2 = Hello World - World => s2 = Hello
        //gán chuỗi s1 vào s2
        s1 = s1.substring(s2.length());
        System.out.println("String after swap: " + s1 + " " + s2);
    }

}
