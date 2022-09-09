import de.neuefische.Model.Product;
import de.neuefische.ProductRepo.ProductDB;

public class Main {

    public static void main(String[] args) {
        Product screws = new Product(1,"Screws");
        Product nails = new Product(2,"Nails");
        Product mouse = new Product(3, "Wireless Mouse");
        Product keyboard = new Product(4, "Keyboard");
        Product monitor = new Product(5, "Monitor");

        ProductDB productList = new ProductDB();

        productList.addProduct(screws);
        productList.addProduct(nails);
        productList.addProduct(mouse);
        productList.addProduct(keyboard);
        productList.addProduct(monitor);

        System.out.println(productList.list());

    }
}
