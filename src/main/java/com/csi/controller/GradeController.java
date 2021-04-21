package com.csi.controller;

import com.csi.domain.Grade;
import com.csi.domain.TeaDept;
import com.csi.domain.Teacher;
import com.csi.service.GradeService;
import com.csi.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author 张旭
 * @version 1.0
 * @date 2021/4/21 21:01
 */
@RestController
@RequestMapping("/grade")
public class GradeController {
    private static final Logger logger = LoggerFactory.getLogger(GradeController.class);
    @Autowired
    private GradeService service;
    @RequestMapping("/insert")
    public Result insert(HttpSession session, @RequestBody Grade grade){
        Result result = new Result() ;
        Teacher user = (Teacher) session.getAttribute("user");
        logger.info("登录教师信息======"+user);
        grade.setTeacher(user);
        service.insert(grade);
        logger.info("新增学生成绩信息======"+grade);
        result.setMessage("添加成功！");
        return result;
    }

}