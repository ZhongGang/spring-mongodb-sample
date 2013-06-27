package com.icode.service;

import com.icode.core.dto.ShopFormDTO;
import com.icode.core.model.Shop;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-23
 * Time: 上午1:08
 */
public interface ShopService {

    void saveOrUpdateShop(ShopFormDTO shop);

    List<Shop> loadShops();
}
