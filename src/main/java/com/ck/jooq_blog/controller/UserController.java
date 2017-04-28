package com.ck.jooq_blog.controller;

import com.ck.jooq_blog.dao.UserDao;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dudycoco on 17-4-29.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        String json = new Gson().toJson(userDao.findAll());
        return json;
    }
}
