package bai4;

public class index {
    public static void main(String[] args) {
        Truck t1 = new Truck("Truck", "Tatra 810 4x4", 8.90864756876756,
                65.89867564756879, 80.0);
        Car c1 = new Car("Car", "Virtus", 2.355, 14.419665, 120.0);
        Motorcycle m1 = new Motorcycle("Motorcycle", "Warrior200", 2.1,
                4.41, 80.0);
        t1.modelName();
        t1.fuelEff();
        t1.travel();
        t1.maxSpeed();
        System.out.println();
        c1.modelName();
        c1.fuelEff();
        c1.travel();
        c1.maxSpeed();
        System.out.println();
        m1.modelName();
        m1.fuelEff();
        m1.travel();
        m1.maxSpeed();
    }
}
