package ChieuThucHanh.Chieu2806.Bai01;

abstract class Vehicle {
    private String name;
    final int id;
    static int vehicleCount = 0;
    public void move(){}

    public Vehicle(String name, int id) {
        this.name = name;
        this.id = id;
        vehicleCount++;
    }

}
