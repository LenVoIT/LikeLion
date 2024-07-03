package ChieuThucHanh.Chieu2806.Bai01;

public class Car extends Vehicle{
    private int numberOfDoors;

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    public Car(String name, int id, int numberOfDoors) {
        super(name, id);
        this.numberOfDoors = numberOfDoors;
    }
}
