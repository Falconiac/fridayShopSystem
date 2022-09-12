package de.neuefische.ProductRepo;

import de.neuefische.Model.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductDB {

    protected Map<Integer, Product> products = new HashMap<>();

    public Product addProduct(Product product){
        products.put(product.getId(), product);
        return product;
    }

    public String getProduct(int id){
        Product output = products.get(id);
        return output.toString();
    }

    public Product getObjectProduct(int id){
        Product output = products.get(id);
        return output;
    }



    public String list() {
        return "All products = " + products;
    }
}
