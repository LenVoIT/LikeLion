package Chieu2806.LamLaiBai01;

public class Bicycle extends Vehicle {
    private boolean hasGear;

    public Bicycle(int id, String name, boolean hasGear) {
        super(id,name);
        this.hasGear = hasGear;
    }

    @Override
    public void move() {
        System.out.println("Bicycle is moving");
    }
}
