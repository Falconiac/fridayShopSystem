import de.neuefische.Model.Product;
import de.neuefische.OrderRepo.Order;
import de.neuefische.OrderRepo.OrderRepo;
import de.neuefische.ProductRepo.ProductDB;

public class Main {

    public static void main(String[] args) {

        OrderRepo listOfOrders = new OrderRepo();



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

        Order testOrder = new Order(1);
        testOrder.setOrder(productList, 1);
        testOrder.setOrder(productList,3);
        listOfOrders.addOrder(testOrder);

        Order testOrder2 = new Order(2);
        testOrder2.setOrder(productList, 2);
        testOrder2.setOrder(productList,4);
        listOfOrders.addOrder(testOrder2);

        Order testOrder3 = new Order(3);
        testOrder3.setOrder(productList, 2);
        testOrder3.setOrder(productList,4);
        testOrder3.setOrder(productList, 1);
        testOrder3.setOrder(productList,3);
        listOfOrders.addOrder(testOrder3);




    }
}
