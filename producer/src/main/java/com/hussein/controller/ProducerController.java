package com.hussein.controller;

import com.hussein.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: ProducerController</p>
 * <p>Description: </p>
 * <p>Company: www.hussein.com</p>
 *
 * @author hwangsy
 * @date 2019/10/9 10:51 AM
 */
@RestController
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/sendMsg")
    public String sendMessage(String msg) {
        producerService.sendMsg(msg);
        return "hello world";
    }

    @GetMapping("/sendMsgWithTrans")
    public String sendMsgWithTrans(String msg) {
        producerService.sendMsgWithTrans(msg);
        return "hello world";
    }

    @GetMapping("/batchSendMsg")
    public String batchSendMsg(String msg) {
        producerService.batchSendMsg(msg);
        return "hello world";
    }
}
