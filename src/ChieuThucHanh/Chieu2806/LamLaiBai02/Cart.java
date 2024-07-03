package ChieuThucHanh.Chieu2806.LamLaiBai02;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Cart {
    //khai báo danh sách sản phẩm
    List<Product> products;

    // định nghĩa
    public Cart() {
        products = new ArrayList<>();

    }
    //Thêm sản phẩm vào cart
    public void addToCart(Product product){
        products.add(product);
    }

    //Tổng giá tiền
    public String totalPrice(){
        double total = 0;
        for(Product product:products){
            total += product.getPrice();
        }
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        return currencyFormatter.format(total);
    }
    //show danh sách sản phẩm
    public void showProducts(){
        System.out.println("Products in your cart: ");
        System.out.println("Id" + "\tProduct Id" + "\t\tProduct name" + "\t\tPrice" + "\t\tStore");
        for(Product product: products){
            System.out.println(product.getId() + "\t" + product.getProductId() + " \t\t\t" + product.getProductName()
             + "\t\t\t\t" + product.getPrice() + "\t" + product.storeName);
        }
        System.out.println("Total amount: " + totalPrice());
    }
}
