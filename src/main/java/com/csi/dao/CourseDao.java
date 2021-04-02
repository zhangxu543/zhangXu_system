package com.csi.dao;

import com.csi.domain.City;
import com.csi.domain.Course;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 张旭
 * @version 1.0
 * @date 2021/3/27 18:06
 */

@Repository
public interface CourseDao {
   List<Course> findByClass(String classroom);
   void insert(Course course);
   void updateById(Course course);
}