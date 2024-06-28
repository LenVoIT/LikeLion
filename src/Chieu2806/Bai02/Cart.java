package Chieu2806.Bai02;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addToCart(Product product) {
        products.add(product);
    }

    public void showProducts() {
        System.out.println("Product Id " + " \tProduct name "
                + " \tProduct price " + " \tStore name ");
        for (Product product : products) {
            System.out.println("\t" + product.getProductId() + "\t\t\t "
                    +product.getProductName() +"\t\t "
                    +product.getPrice() + "\t\t "
                    +product.storeName);
        }
    }

    public double totalPrice() {
        double totalAmount = 0;
        for (Product product : products){
            totalAmount += product.getPrice();
        }
        return totalAmount;
    }

}
