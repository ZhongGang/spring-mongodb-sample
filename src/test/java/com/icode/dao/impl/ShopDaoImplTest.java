package com.icode.dao.impl;

import com.icode.core.model.Product;
import com.icode.core.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-27
 * Time: 下午4:16
 */
@ContextConfiguration(locations = "classpath:rootApplicationContext.xml")
public class ShopDaoImplTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private MongoOperations mongoTemplate;

    @Test
    public void createShop() throws Exception {
        Shop shop = new Shop("Shop1", "Shop11111111111");
        shop.add(new Product("Product1"));
        shop.add(new Product("Product2"));
        shop.add(new Product("Product3"));
        mongoTemplate.insert(shop);
    }
}
