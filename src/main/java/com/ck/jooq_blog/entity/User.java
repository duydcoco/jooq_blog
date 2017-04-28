package com.ck.jooq_blog.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by dudycoco on 17-4-29.
 */
@Data
@Entity
@Table(name = "user")
public class User {
    @Column(name = "uid")
    private Long uid;
    @Column(name = "name")
    private String name;
    @Column(name = "sex")
    private Boolean sex;
    @Column(name = "age")
    private Integer age;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "password")
    private String password;
    @Column(name = "register_time")
    private Date registerTime;

}
