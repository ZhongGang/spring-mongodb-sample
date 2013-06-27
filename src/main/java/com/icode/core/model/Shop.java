package com.icode.core.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-22
 * Time: 下午4:11
 */
public class Shop extends AbstractEntity {
    private String name;
    private String description;
    private List<Product> products = new ArrayList<Product>();

    public Shop() {
    }

    public Shop(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Product> getProducts() {
        return products;
    }
}
