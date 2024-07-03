package SangLyThuyet.Sang0307;

import SangLyThuyet.Sang0307.Lambda.BaseInterface;
import SangLyThuyet.Sang0307.Lambda.FuncInter3;
import SangLyThuyet.Sang0307.Lambda.FuncInterface2args;
import SangLyThuyet.Sang0307.MethodReferences.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) {
        //Cách thông thường
//        Hello hello = new Hello();
//        hello.sayHello();

        //Sử dụng lambda
        BaseInterface hello2 = (name) -> {
            System.out.println("Say Hello " + name);
        };
        hello2.sayHello("Len");


        FuncInterface2args funcInterface2args = (x, y) -> {
            //Return bắt buộc sử dùng {}
            return x * y;
        };
        System.out.println(funcInterface2args.tinh(4, 9));

        //lambda với forEach
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Python");

        list.forEach((element) -> {
            System.out.println(element);
        });

        FuncInter3 f3 = (name, age) -> {
            System.out.println("Tôi tên: " + name + " " + age + " tuổi");
        };
        f3.present("Lên", 23);

        //Functional Interface mặc định của Java
        Function<String, Integer> func = new Function<>() {
            @Override
            public Integer apply(String name) {
                return Integer.parseInt(name);
            }
        };
        //Chuyển đổi thành lambda
        Function<String, Integer> fun1 = (name) -> {
            return Integer.parseInt(name);
        };


        //METHOD REFERENCES
//        int x = 5, y = 10;
//        int z = toDo(x,y, Service::tinhTong);
//        System.out.println("Tổng x và y là: " + z);
//
//
//        public static int toDo(int x, int y, Calculator cal){
//            return cal.timXY(x, y);
//        }
    }
}
