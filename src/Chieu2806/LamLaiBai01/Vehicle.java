package Chieu2806.LamLaiBai01;

abstract class Vehicle {
    final int id;
    private String name;
    static int vehicleCount;
    public Vehicle(int id, String name){
        this.id = id;
        this.name = name;
        vehicleCount++;
    }

    public void move(){}
}
