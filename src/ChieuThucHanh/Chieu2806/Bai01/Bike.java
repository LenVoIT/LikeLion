package ChieuThucHanh.Chieu2806.Bai01;

public class Bike extends Vehicle{
    private boolean hasGear;

    public Bike(String name, int id, boolean hasGear) {
        super(name, id);
        this.hasGear = hasGear;
    }

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }

}
