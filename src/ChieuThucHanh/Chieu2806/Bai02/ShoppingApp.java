package ChieuThucHanh.Chieu2806.Bai02;

public class ShoppingApp {
    public static void main(String[] args) {
        //init new Product
        Product p1 = new Product(1,"ProductA",70000);
        Product p2 = new Product(2,"ProductB",80000);
        Product p3 = new Product(3,"ProductC",90000);
        Product p4 = new Product(4,"ProductD",200000);

        //init new Cart
        Cart c1 = new Cart();
        c1.addToCart(p1);
        c1.addToCart(p2);
        c1.addToCart(p4);

        System.out.println("Products in your cart including: ");
        c1.showProducts();
        System.out.println("Total amount you have to pay: " + c1.totalPrice());

    }
}
