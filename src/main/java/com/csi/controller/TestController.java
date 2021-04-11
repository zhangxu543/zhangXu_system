package com.csi.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
    @RequestMapping("/questionBasicList")
    public String firstpage() {
        return "admin/questionBasicList";
    }

    @RequestMapping("/students")
    public String students() {
        return "admin/studentList";
    }
    @RequestMapping("/majors")
    public String majors() {
        return "admin/majorList";
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
