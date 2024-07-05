package SangLyThuyet.Sang0507;

import java.util.Optional;

public class LyThuyet {
    public static void main(String[] args) {
        //tạo ra 1 đối tượng optional rỗng
        Optional<String> opt = Optional.empty();

        //Tạo ra 1 đối tượng non-null(có thể có giá trị hoặc empty
        String str = "";
        Optional<String> opt1 = Optional.of(str);
        System.out.println(opt1.isPresent());

        //To ra 1 đối tượng cho phép null hoặc non-null
        String str2 = null;
        Optional<String> opt3 = Optional.ofNullable(str2);
    }
}
