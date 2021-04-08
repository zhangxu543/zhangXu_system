package com.csi.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
    @RequestMapping("/questionBasicList")
    public String firstpage() {
        return "admin/questionBasicList";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "admin/index";
    }




}
