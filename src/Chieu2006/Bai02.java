package Chieu2006;

import java.util.Arrays;

public class Bai02 {
    public static void main(String[] args) {
        String[] colors={"Red","Green","Orange","White","Black"};
        System.out.print("List before sort: ");
        for(String c : colors){
            System.out.print(c + " ");
        }
        Arrays.sort(colors);
        System.out.print("\nList after sort: ");
        for(String c : colors){
            System.out.print(c + " ");
        }
    }
}
