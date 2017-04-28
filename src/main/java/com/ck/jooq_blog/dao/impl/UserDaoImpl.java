package com.ck.jooq_blog.dao.impl;

import com.ck.gen.base.model.Tables;
import com.ck.jooq_blog.dao.UserDao;
import com.ck.jooq_blog.entity.User;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dudycoco on 17-4-29.
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private DSLContext dsl;

    @Override
    public List<User> findAll() {

        List<User> list = dsl.selectFrom(Tables.USER).fetch().map(record -> {
            User user = record.into(User.class);
            return user;
        });
        return list;
    }
}
