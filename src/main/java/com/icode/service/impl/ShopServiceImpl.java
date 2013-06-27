package com.icode.service.impl;

import com.icode.core.dto.ShopFormDTO;
import com.icode.core.model.Shop;
import com.icode.dao.ShopDao;
import com.icode.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-23
 * Time: 上午1:08
 */
@Service("shopService")
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;

    @Override
    public void saveOrUpdateShop(ShopFormDTO shopFormDTO) {
        Shop shop = shopFormDTO.toShop();
        shopDao.saveOrUpdate(shop);
    }

    @Override
    public List<Shop> loadShops() {
        return shopDao.findAll(Shop.class);
    }
}
