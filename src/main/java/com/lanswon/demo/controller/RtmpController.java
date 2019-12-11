package com.lanswon.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Author zsw
 * @Date 2019/11/29 10:30
 * @Version V1.0
 **/
@RestController
@RequestMapping(value="/v1/rtmp/")
public class RtmpController {

    @GetMapping(value="/on_connect")
    public String onConnect(HttpServletRequest request){
        debug(request, "on_connect");
        return "on_connect";
    }
    @GetMapping(value="/on_play")
    public String onPlay(HttpServletRequest request){
        debug(request, "on_play");
        return "on_play";
    }
    @GetMapping(value="/on_publish")
    public String onPublish(HttpServletRequest request){
        debug(request, "on_publish");
        return "on_publish";
    }
    @GetMapping(value="/on_done")
    public String onDone(HttpServletRequest request){
        debug(request, "on_done");
        return "on_done";
    }
    @GetMapping(value="/on_play_done")
    public String onPlayDone(HttpServletRequest request){
        debug(request, "on_play_done");
        return "on_play_done";
    }
    @GetMapping(value="/on_publish_done")
    public String onPublishDone(HttpServletRequest request){
        debug(request, "on_publish_done");
        return "on_publish_done";
    }
    @GetMapping(value="/on_record_done")
    public String onRecordDone(HttpServletRequest request){
        debug(request, "on_record_done");
        return "on_record_done";
    }
    @GetMapping(value="/on_update")
    public String onUpdate(HttpServletRequest request){
        debug(request, "on_update");
        return "on_update";
    }

    private String debug(HttpServletRequest request, String action){
        String str = action + ": " + request.getRequestURI() + " " + request.getQueryString();
        System.out.println(str);
        return str;
    }

}