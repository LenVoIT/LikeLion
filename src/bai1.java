public class bai1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.speedUp();
        Bicycle b1 = new Bicycle();
        b1.speedUp();
    }

    public static abstract class Vehicle {
        public Vehicle() {}

        public void speedUp() {
            System.out.println("Tốc độ của xe là 100km/h");
        }
    }

    public static class Car extends Vehicle {
        public Car() {}
        @Override
        public void speedUp() {
            System.out.println("Tốc độ của xe hơi là 120km/h");
        }
    }

    public static class Bicycle extends Vehicle {
        public Bicycle() {
        }
        @Override
        public void speedUp() {
            System.out.println("Tốc độ của xe đạp là 30km/h");
        }
    }
}
