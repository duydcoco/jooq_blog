package com.ck.jooq_blog.dao;

import com.ck.jooq_blog.entity.User;

import java.util.List;

/**
 * Created by dudycoco on 17-4-29.
 */
public interface UserDao {

    List<User> findAll();
}
