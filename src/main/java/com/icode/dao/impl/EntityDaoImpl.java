package com.icode.dao.impl;

import com.icode.core.model.AbstractEntity;
import com.icode.dao.EntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-23
 * Time: 上午1:32
 */
public class EntityDaoImpl implements EntityDao {

    @Autowired
    private MongoOperations mongoTemplate;

    @Override
    public <T extends AbstractEntity> void saveOrUpdate(T t) {
        mongoTemplate.insert(t);
    }

    @Override
    public <T extends AbstractEntity> List<T> findAll(Class<T> clazz) {
        return mongoTemplate.findAll(clazz);
    }
}
