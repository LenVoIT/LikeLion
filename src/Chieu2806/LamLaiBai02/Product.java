package Chieu2806.LamLaiBai02;

public class Product {
    private static int idCounter = 0;
    private int id;
    private int productId;
    private String productName;
    private double price;
    static final String storeName = "Store ABC";

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int productId, String productName, double price) {
        this.id = ++idCounter;
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
}
