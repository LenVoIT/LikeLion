package Chieu2806.BaiTapOnline.Bai02;

public class Zebra extends Animal{
    public Zebra() {
    }

    public Zebra(String name, int age) {
        super(name, age);
    }

    @Override
    public void setValue(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
