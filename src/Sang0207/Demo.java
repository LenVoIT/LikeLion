package Sang0207;

public class Demo<T> implements DemoInterface<T>{
    @Override
    public void doSomething(T action) {
        System.out.println(action);
    }

    public static void main(String[] args) {
        //khai bao type Integer
        Demo<Integer> demo = new Demo<>();
        demo.doSomething(123);
        System.out.println(demo);
        //khai bao type String
        Demo<String> demo1 = new Demo<>();
        demo1.doSomething("Sleeping");
        System.out.println(demo1);
    }
}
