package com.dsy.controller;

import com.dsy.model.user;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class Hello {
    @RequestMapping(value = "/{id}")
    public user hello(@PathVariable Integer id) {
        user u = new user();
        u.setId(id);
        u.setName("xxxx");
        u.setAge(1111);
        return u;
    }
}
