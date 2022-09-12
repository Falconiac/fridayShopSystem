package de.neuefische.OrderRepo;

import de.neuefische.Model.Product;
import de.neuefische.ProductRepo.ProductDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order {

    protected int id;

    protected ArrayList<Product> order = new ArrayList<>();



    public Order(int id) {
        super();
        this.id = id;

    }

    public Order() {
    }

    public void setOrder(ProductDB db, Integer id) {
        Product product = db.getObjectProduct(id);
        order.add(product);
    }



    public String orderStringOutput() {
        return "Order{" +
                "id='" + id + '\'' +
                ", order=" + order.toString() +
                '}';
    }

    public ArrayList<Product> getOrder() {
        return order;
    }

    public int getId() {
        return id;
    }
}


