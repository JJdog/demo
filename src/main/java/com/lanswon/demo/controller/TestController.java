package com.lanswon.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author zsw
 * @Date 2019/11/20 13:20
 * @Version V1.0
 **/
@RestController
public class TestController {

    @GetMapping("test")
    public String test(){
        return ".............................................................................................welcome";
    }

    @GetMapping("aa")
    public String test1(){
        return "...........fuck   aaa    uuuuuuuuu..................................................................................welcome";
    }

    @GetMapping("bb")
    public String test2(){
        return "...........fuck bbbbb       uuuuuuuuu..................................................................................welcome";
    }
    @GetMapping("cc")
    public String test3(){
        return "...........fuck ccccccc      uuuuuuuuu..................................................................................welcome";
    }
}