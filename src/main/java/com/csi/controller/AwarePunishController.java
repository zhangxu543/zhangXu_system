package com.csi.controller;

import com.csi.domain.AwarePunish;
import com.csi.domain.Subject;
import com.csi.domain.TeaDept;
import com.csi.service.AwarePunishService;
import com.csi.service.StudentService;
import com.csi.service.SubjectService;
import com.csi.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 张旭
 * @version 1.0
 * @date 2021/4/13 20:10
 */
@RestController
@RequestMapping("/awarePunish")
public class AwarePunishController {
    private static final Logger logger = LoggerFactory.getLogger(AwarePunishController.class);

    @Autowired
    private AwarePunishService service;

    @Autowired
    private StudentService studentService;

    @RequestMapping("/insert")
    public Result insert(@RequestBody AwarePunish awarePunish){
        logger.info("新增奖罚信息========"+awarePunish);
        Result result = new Result() ;
        awarePunish.setClassroom(studentService.findById(awarePunish.getStudent().getStuId()).getStuClass());
        if("奖励".equals(awarePunish.getStatus()))
            awarePunish.setLevels("");
        service.insert(awarePunish);
        result.setMessage("添加成功！");
        return result;
    }

    @RequestMapping("/findAll")
    public List<AwarePunish> findAll(){
        List<AwarePunish> list = service.findByLike(null);
        logger.info("奖罚个数======"+list.size());
        return list;
    }

    @RequestMapping("/findByLike")
    public List<AwarePunish> findByLike(@RequestBody AwarePunish awarePunish){
        logger.info("筛选条件======"+awarePunish);
        if("奖励".equals(awarePunish.getStatus()))
            awarePunish.setLevels(null);
        if("".equals(awarePunish.getTimes()))
            awarePunish.setTimes(null);
        if("".equals(awarePunish.getStatus()))
            awarePunish.setStatus(null);
        logger.info("筛选条件======"+awarePunish);
        List<AwarePunish> list = service.findByLike(awarePunish);
        logger.info("筛选个数======"+list.size());
        return list;
    }

}