package SangLyThuyet.Sang0407;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemoAndBase64 {
    public static void main(String[] args) {

        //Stream API
        List<String> list = Arrays.asList("PHP", "Java", "Python", "C++");

        Stream<String> stream = list.stream()
                .filter(s -> s.toLowerCase().startsWith("c"));
        List<String> streamList = stream.collect(Collectors.toList());
        System.out.println(streamList);

        //Base 64
        //mã hóa chuỗi
        String pwd = "Likelion2024";
        String encode = Base64.getEncoder().encodeToString(pwd.getBytes());
        System.out.println(encode);
        //giải mã chuỗi với base64 decoding
        byte[] decodeByte = Base64.getDecoder().decode(encode);
        System.out.println(decodeByte);
        String decodeString = new String(decodeByte);
        System.out.println(decodeString);

        //mã hóa mime
        String mime1="-----------------------Easter egg-----------------------\n" +
                "Trong mã hóa Base64, độ dài của chuỗi được mã hóa đầu ra phải là bội số của 3.\n" +
                "Nếu không đủ, đầu ra sẽ được đệm bằng các ký tự pad bổ sung (dấu =).\n" +
                "Ta có thể bỏ dấu = bằng cách sử dụng withoutPadding như sau: Base64.getEncoder().withoutPadding().encodeToString(str.getBytes())\n";
        String encodeMime = Base64.getMimeEncoder().encodeToString(mime1.getBytes());
        System.out.println(encodeMime);

        //giải mã hóa mime


        byte[] decodeByteMime = Base64.getMimeDecoder().decode(encodeMime);
        String decodeString1 = new String(decodeByteMime);
        System.out.println(decodeString1);
    }
}
