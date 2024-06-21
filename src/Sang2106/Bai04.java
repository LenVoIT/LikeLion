package Sang2106;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Bai04 {
    public static void main(String[] args) {
        String str = "characters";
        delDup(str);
    }

    public static void delDup(String str) {
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            hs.add(str.charAt(i));
        }
        for (Character ch : hs) {
            System.out.print(ch);
        }
    }
}
