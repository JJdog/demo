package com.lanswon.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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

    @GetMapping("dd")
    public String test4(){
        return "...........fuck 最新的 啊啊  操！！！！！！！！！！！！！！      uuuuuuuuu..................................................................................welcome";
    }

    @GetMapping("gg")
    public String test5(){
        return "当前时间..........."+new Date();
    }


    @GetMapping("ff")
    public String test6(){
        return "最后测试，后面不玩了--》当前时间..........."+new Date();
    }
}