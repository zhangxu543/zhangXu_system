package com.csi.controller;

import com.csi.domain.Major;
import com.csi.service.MajorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 张旭
 * @version 1.0
 * @date 2021/4/11 13:36
 */
@RestController
@RequestMapping("/major")
public class MajorController {
    private static final Logger logger = LoggerFactory.getLogger(MajorController.class);


    @Autowired
    private MajorService majorService;

    @RequestMapping("/findByDept")
    public List<Major> findByDept(){
        List<Major> majors = majorService.listByDept(0);
        logger.info("院系个数======"+majors.size());
        return majors;
    }

    @RequestMapping("/findMajor")
    public List<Major> findMajor(@RequestBody Major stuDept){
        System.out.println(stuDept);
        List<Major> majors = majorService.listByDept(stuDept.getId());
        logger.info("专业个数======"+majors.size());
        return majors;
    }


}