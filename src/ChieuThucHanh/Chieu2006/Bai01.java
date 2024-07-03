package ChieuThucHanh.Chieu2006;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Bai01 {
    public static void main(String[] args) {
        String st = new String("gibblegabbler");
        System.out.println("The given string is: " + st);
        characterNotDup(st);
    }

        public static void characterNotDup(String str) {
            //Khởi tạo HashMap
            HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
            // đổi chuỗi str về thành mảng char
            char[] chars = str.toCharArray();
            //duyệt ký tự trong mảng char
            for(char ch: chars){
                //if key không chứa
                if(!map.containsKey(ch)){
                    map.put(ch, false);
                }
                else{
                    map.replace(ch, true);
                }
            }

            //loop through input string with map
            for(char ch:chars){
                boolean isDuplicated = map.get(Character.valueOf(ch));

                if(!isDuplicated){
                    System.out.println("Ky tu khong lap dau tien: " + ch);
                    break;
                }
            }
        }
}
