package Chieu2806.LamLaiBai01;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(int id, String name, int numberOfDoors){
        super(id,name);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
