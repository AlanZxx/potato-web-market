package com.potato.marketweb.controller;

import com.potato.marketweb.service.postgres.Postgre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    Postgre postgre;
    @RequestMapping("/hello")
    @ResponseBody
    public int testHello(){
        return postgre.getAllTest();
    }
}
