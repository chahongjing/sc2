package com.zjy.stream_kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 */
@RestController
public class IndexController {
    @Autowired
    private SendService sendService;

    @RequestMapping("/send/{msg}")
    public void send(@PathVariable("msg") String msg){
        sendService.sendMsg(msg);
    }
}
