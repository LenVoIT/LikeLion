package ChieuThucHanh.Chieu2806.LamLaiBai02;

public class ShoppingApp {
    public static void main(String[] args) {
        Product p1 = new Product(1234,"Harley", 500000);
        Product p2 = new Product(1235,"Triumph", 450000);
        Product p3 = new Product(4321,"Brixton", 100000);
        Product p4 = new Product(5678,"Yamaha", 200000);
        Cart c = new Cart();
        c.addToCart(p1);
        c.addToCart(p2);
        c.addToCart(p4);
        c.showProducts();

    }
}
