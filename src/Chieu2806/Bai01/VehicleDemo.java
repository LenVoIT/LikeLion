package Chieu2806.Bai01;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Rolls",1,4);
        vehicles[1] = new Bike("Triumph",2,true);
        for(Vehicle vehicle:vehicles){
            vehicle.move();
        }

        System.out.println("Numbers of vehicle: " + Vehicle.vehicleCount);
    }
}
