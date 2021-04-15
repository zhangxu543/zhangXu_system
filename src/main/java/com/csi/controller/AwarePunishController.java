package com.csi.controller;

import com.csi.domain.AwarePunish;
import com.csi.domain.Subject;
import com.csi.service.AwarePunishService;
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
    private static final Logger logger = LoggerFactory.getLogger(MajorController.class);

    @Autowired
    private AwarePunishService service;

    @RequestMapping("/insert")
    public Result insert(@RequestBody AwarePunish awarePunish){
        logger.info("新增奖罚信息========"+awarePunish);
        Result result = new Result() ;
        service.insert(awarePunish);
        result.setMessage("添加成功！");
        return result;
    }




}