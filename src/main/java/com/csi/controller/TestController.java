package com.csi.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
    @RequestMapping("/questionBasicList")
    public String firstpage() {
        return "questionBasicList";
    }



    @RequestMapping("/index1")
    public String index1() {

        return "index1";

    }

    @RequestMapping("/index")
    public String index() {

        return "index";

    }

    @RequestMapping("/login")
    public String login() {

        return "Login";

    }

    /*@RequestMapping("/Register")
    public String Register(Model model) {
        List<Student0> list = studentService.list();
        model.addAttribute("students",list) ;
        return "Register";

    }*/

    @RequestMapping("/main")
    public String main() {

        return "main";

    }
}
