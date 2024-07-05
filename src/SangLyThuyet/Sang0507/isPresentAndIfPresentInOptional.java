package SangLyThuyet.Sang0507;

import java.util.Optional;

public class isPresentAndIfPresentInOptional {
    public static void main(String[] args) {
        //Khởi tạo optionalWi
        Optional<String> optionalWithValue = Optional.of("Hello");
        Optional<String> optionalEmpty = Optional.empty();

        // Using isPresent()
        if (optionalWithValue.isPresent()) {
            System.out.println("optionalWithValue using isPresent: Value is " + optionalWithValue.get());
        } else {
            System.out.println("optionalWithValue using isPresent: No value present");
        }

        if (optionalEmpty.isPresent()) {
            System.out.println("OptionalEmpty using isPresent: Value is " + optionalEmpty.get());
        } else {
            System.out.println("OptionalEmpty using isPresent: No value present");
        }

        // Using ifPresent()
        optionalWithValue.ifPresent(value -> System.out.println("optionalWithValue Using ifPresent: Value is " + value));
        optionalEmpty.ifPresent(value -> System.out.println("optionalEmpty Using ifPresent: Value is " + value));
    }

}
