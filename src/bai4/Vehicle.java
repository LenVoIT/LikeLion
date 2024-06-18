package bai4;

public abstract class Vehicle {
    private String vehicleType;
    private String vehicleName;
    private double fuel;
    private double distance;
    private double speed;

    public Vehicle(String vehicleType, String vehicleName, double fuel, double distance, double speed) {
        this.vehicleType = vehicleType;
        this.vehicleName = vehicleName;
        this.fuel = fuel;
        this.distance = distance;
        this.speed = speed;
    }
    public void modelName(){
        System.out.println(this.vehicleType + " model: " + this.vehicleName);
    }
    public void fuelEff(){
        System.out.println("Fuel Efficiency: " + this.fuel + " mpg");
    }
    public void travel(){
        System.out.println("Distance traveled: " + this.distance + " miles");
    }
    public void maxSpeed(){
        System.out.println("Max Speed: " + this.speed + " mph");
    }
}
