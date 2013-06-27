package com.icode.core.model;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-26
 * Time: 下午6:44
 */
public class Product extends AbstractEntity {
    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
