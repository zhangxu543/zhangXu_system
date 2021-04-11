package com.csi.controller;


import com.csi.domain.Student;
import com.csi.service.StudentService;
import com.csi.util.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/student")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Student> list(){
        List<Student> list = studentService.findByLike(null);
        logger.info("学生个数======"+list.size());
        return list;
    }
    @RequestMapping("/findByLike")
    @ResponseBody
    public List<Student> findByLike(@RequestBody Student student){
        if("".equalsIgnoreCase(student.getStuClass())){
            student.setStuClass(null);
        }if("".equalsIgnoreCase(student.getStuId())){
            student.setStuId(null);
        }if("".equalsIgnoreCase(student.getStuName())){
            student.setStuName(null);
        }if("".equalsIgnoreCase(student.getStuSex())){
            student.setStuSex(null);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("stuId",student.getStuId());
        map.put("stuName",student.getStuName());
        map.put("stuSex",student.getStuSex());
        map.put("stuClass",student.getStuClass());
        List<Student> list = studentService.findByLike(map);
        logger.info("学生个数======"+list.size());
        return list;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(@RequestBody Student student){
        Result result = new Result() ;
        studentService.insert(student);
        result.setMessage("添加成功！");
        return result;
    }

}

