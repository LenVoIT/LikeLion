package ChieuThucHanh.Chieu2806.LamLaiBai01;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        Bicycle bi1 = new Bicycle(1,"Martin",false);
        Car c1 = new Car(2,"Bentley",4);
        bi1.move();
        c1.move();
        System.out.println("Total vehicles: " + Vehicle.vehicleCount);
    }
}
