package com.blog.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("get_bot_info/")
    public List<String> getBotInfo() {
        List<String> list = new LinkedList<>();
        list.add("apple");
        list.add("orange");
        return list;
    }
}
