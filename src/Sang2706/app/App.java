package Sang2706.app;

public class App {
    static class Person {
        int id;
        String name;

        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    static class Emp extends Person {
        float salary;

        Emp(int id, String name, float salary) {
            //gọi lại constructor có 2 tham số là id và name của class cha
            super(id, name);
            this.salary = salary;
        }

        void display() {
            System.out.println(id + " " + name + " " + salary);
        }
    }

    public static void main(String[] args) {
        Emp e1 = new Emp(1, "ankit", 45000f);
        e1.display();
    }
}
